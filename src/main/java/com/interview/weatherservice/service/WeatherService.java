/**
 * 
 */
package com.interview.weatherservice.service;

import com.interview.weatherservice.model.WeatherDeatailResponse;

/**
 * @author indiahiring
 *
 */
public interface WeatherService {

	WeatherDeatailResponse getWeatherDeatils(String location);
	
	

}
