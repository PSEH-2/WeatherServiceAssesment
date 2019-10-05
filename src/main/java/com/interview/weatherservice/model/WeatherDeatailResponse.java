/**
 * 
 */
package com.interview.weatherservice.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author indiahiring
 *
 */
public class WeatherDeatailResponse implements Serializable{

	private String statusCode;

	private List<WeatherDetails> weatherDetails;
	private String message;

	/**
	 * @return the statusCode
	 */
	public String getStatusCode() {
		return statusCode;
	}

	/**
	 * @param statusCode
	 *            the statusCode to set
	 */
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 * @return the weatherDetails
	 */
	public List<WeatherDetails> getWeatherDetails() {
		return weatherDetails;
	}

	/**
	 * @param weatherDetails
	 *            the weatherDetails to set
	 */
	public void setWeatherDetails(List<WeatherDetails> weatherDetails) {
		this.weatherDetails = weatherDetails;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result
				+ ((statusCode == null) ? 0 : statusCode.hashCode());
		result = prime * result
				+ ((weatherDetails == null) ? 0 : weatherDetails.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WeatherDeatailResponse other = (WeatherDeatailResponse) obj;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (statusCode == null) {
			if (other.statusCode != null)
				return false;
		} else if (!statusCode.equals(other.statusCode))
			return false;
		if (weatherDetails == null) {
			if (other.weatherDetails != null)
				return false;
		} else if (!weatherDetails.equals(other.weatherDetails))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("WeatherDeatailResponse [statusCode=");
		builder.append(statusCode);
		builder.append(", weatherDetails=");
		builder.append(weatherDetails);
		builder.append(", message=");
		builder.append(message);
		builder.append("]");
		return builder.toString();
	}

}
