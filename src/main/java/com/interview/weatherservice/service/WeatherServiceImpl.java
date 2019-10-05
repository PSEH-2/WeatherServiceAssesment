/**
 * 
 */
package com.interview.weatherservice.service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;



import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;








import com.interview.weatherservice.model.ForecastDetails;
import com.interview.weatherservice.model.TempratureDetails;
import com.interview.weatherservice.model.WeatherApiResponse;
import com.interview.weatherservice.model.WeatherDeatailResponse;import com.interview.weatherservice.model.WeatherDetails;
import com.interview.weatherservice.model.WeatherInfo;


/**
 * @author indiahiring
 *
 */
@Service
public class WeatherServiceImpl implements WeatherService {
	
	Logger logger = LoggerFactory.getLogger(WeatherServiceImpl.class);
	
	
	@Value( "${open.weather.forecast.url}" )
	private String weatherUrl;
	
	@Value( "${open.weather.forecast.appid}")
	private String appId;

	@Autowired
	private RestTemplate restTemplate;
	
	/* (non-Javadoc)
	 * @see com.interview.weatherservice.service.WeatherService#getWeatherDeatils(java.lang.String)
	 */
	@Override
	public WeatherDeatailResponse getWeatherDeatils(String location) {
		logger.info("WeatherServiceImpl.getWeatherDeatils() has been called with location=",location);
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(weatherUrl)
		        .queryParam("q", location)
		        .queryParam("appid", appId);

		HttpEntity<?> entity = new HttpEntity<>(headers);

		HttpEntity<WeatherApiResponse> response = restTemplate.exchange(
		        builder.toUriString(), 
		        HttpMethod.GET, 
		        entity, 
		        WeatherApiResponse.class);
		WeatherApiResponse weatherApiResponse=response.getBody();
		WeatherDeatailResponse weatherDeatailResponse = prepareWeatherDetails(weatherApiResponse);
		// TODO Auto-generated method stub
		return weatherDeatailResponse;
	}

	/**
	 * @param response
	 * @return
	 */
	private WeatherDeatailResponse prepareWeatherDetails(WeatherApiResponse weatherApiResponse) {
		
		WeatherDeatailResponse weatherDeatailResponse=new WeatherDeatailResponse();
		weatherDeatailResponse.setStatusCode(weatherApiResponse.getCod());
		List<ForecastDetails> forecastDetails=weatherApiResponse.getList();
		List<WeatherDetails> weatherDetails=new ArrayList<>();
weatherDeatailResponse.setWeatherDetails(weatherDetails);
		Map<Date, TempratureDetails> dateWithTemMap=new HashMap<>();
		forecastDetails.forEach(fd->{
			LocalDate currentDate = convertToLocalDateViaInstant(fd.getDt());
			Date date=new Date(currentDate.getYear(), currentDate.getMonthValue(), currentDate.getDayOfMonth());
			if(dateWithTemMap.containsKey(date)){
				TempratureDetails tempratureDetails=dateWithTemMap.get(date);
				TempratureDetails tempratureDetails2=fd.getMain();
				Double maxTemp=Math.max(tempratureDetails.getTemp_max(), tempratureDetails2.getTemp_max());
				Double minTemp=Math.max(tempratureDetails.getTemp_min(), tempratureDetails2.getTemp_min());
				
				tempratureDetails2.setTemp_max(maxTemp);
				tempratureDetails2.setTemp_min(minTemp);
				dateWithTemMap.put(date, tempratureDetails2);
			}else{
				dateWithTemMap.put(date, fd.getMain());
			}
			List<WeatherInfo> weatherInfos=  fd.getWeather();
			weatherInfos.forEach(win->{
				if(win.getMain().equals("Rain")){
					weatherDeatailResponse.setMessage("'Carry umbrella");
				}
			});

		});
		
		dateWithTemMap.forEach((key,val)->{
			Double maxTemp=Double.MIN_VALUE;
			WeatherDetails weatherDetail=new WeatherDetails();
			weatherDetail.setDate(key);
			weatherDetail.setMaxTemp(val.getTemp_max());
			weatherDetail.setMinTemp(val.getTemp_min());
			maxTemp=Math.max(maxTemp, val.getTemp_max());
			weatherDetails.add(weatherDetail);
			if(StringUtils.isEmpty(weatherDeatailResponse.getMessage())&& maxTemp>314){
				weatherDeatailResponse.setMessage("Use sunscreen lotion");
			}
		});

		weatherDeatailResponse.setWeatherDetails(weatherDetails);
		return weatherDeatailResponse;
	}
	
	private LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
	    return dateToConvert.toInstant()
	      .atZone(ZoneId.systemDefault())
	      .toLocalDate();
	}
}
