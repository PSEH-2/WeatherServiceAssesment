package com.interview.weatherservice.serviceimpl;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.reflect.FieldUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import com.interview.weatherservice.model.City;
import com.interview.weatherservice.model.ForecastDetails;
import com.interview.weatherservice.model.WeatherApiResponse;
import com.interview.weatherservice.model.WeatherInfo;
import com.interview.weatherservice.service.WeatherService;
import com.interview.weatherservice.service.WeatherServiceImpl;

public class WeatherServiceimplTest {

	@InjectMocks
	private WeatherServiceImpl weatherServiceImpl;
	
	@Mock
	private WeatherService weatherService;
	
	@Mock
	private RestTemplate restTemplate;
	
private String weatherUrl="https://samples.openweathermap.org/data/2.5/forecast?q=?&appid=?";
	
	private String appId="b6907d289e10d714a6e88b30761fae22";
	
	@Before
	public void setUp() throws Exception {
		FieldUtils.writeField(weatherServiceImpl, "weatherUrl", weatherUrl);
		FieldUtils.writeField(weatherServiceImpl, "appId", appId);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testWhenRainsThenMessageCarryUmbrella() {
		WeatherApiResponse weatherApiResponse=new WeatherApiResponse();
		City city=new City();
		city.setName("London");
		weatherApiResponse.setCity(city);
		List<ForecastDetails> list=new ArrayList<ForecastDetails>();
		ForecastDetails forecastDetails=new ForecastDetails();
		forecastDetails.setDt(new Date());
		List<WeatherInfo> weather=new ArrayList<WeatherInfo>();
		WeatherInfo weatherInfo=new WeatherInfo();
		weatherInfo.setMain("Rain");
		weather.add(weatherInfo);
		forecastDetails.setWeather(weather);
		
		weatherApiResponse.setList(list);
//		HttpEntity<?> entity = new HttpEntity<>(headers);
//
//		HttpEntity<WeatherApiResponse> response = restTemplate.exchange(
//		        builder.toUriString(), 
//		        HttpMethod.GET, 
//		        entity, 
//		        WeatherApiResponse.class);
//		Mockito.when(restTemplate.exchange(Mockito.anyString(), Mockito.anyString(),Mockito.anyString(),Mockito))
//	      .thenReturn(alex);
//		Mockito.mock(when)
//		HttpEntity<WeatherApiResponse>=new HttpEntity<>();
		
		fail("Not yet implemented");
	}

}
