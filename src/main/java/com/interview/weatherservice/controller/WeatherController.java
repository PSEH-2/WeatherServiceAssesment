/**
 * 
 */
package com.interview.weatherservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.interview.weatherservice.model.WeatherDeatailResponse;
import com.interview.weatherservice.service.WeatherService;

/**
 * @author indiahiring
 *
 */
@RestController
public class WeatherController {
	
	Logger logger = LoggerFactory.getLogger(WeatherController.class);
	
	@Autowired
	private WeatherService weatherService;
	
	@GetMapping("/weatherDetails")
	public WeatherDeatailResponse getWeatherDeatils(@RequestParam String location){
		logger.info("WeatherController.getWeatherDeatils has been called with location =",location);
		return weatherService.getWeatherDeatils(location);
	}

}
