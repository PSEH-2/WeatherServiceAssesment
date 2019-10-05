package com.interview.weatherservice.model;

import java.io.Serializable;
import java.util.Date;

public class WeatherDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date date;
	private Double maxTemp;
	private Double minTemp;

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the maxTemp
	 */
	public Double getMaxTemp() {
		return maxTemp;
	}

	/**
	 * @param maxTemp
	 *            the maxTemp to set
	 */
	public void setMaxTemp(Double maxTemp) {
		this.maxTemp = maxTemp;
	}

	/**
	 * @return the minTemp
	 */
	public Double getMinTemp() {
		return minTemp;
	}

	/**
	 * @param minTemp
	 *            the minTemp to set
	 */
	public void setMinTemp(Double minTemp) {
		this.minTemp = minTemp;
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
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((maxTemp == null) ? 0 : maxTemp.hashCode());
		result = prime * result + ((minTemp == null) ? 0 : minTemp.hashCode());
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
		WeatherDetails other = (WeatherDetails) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (maxTemp == null) {
			if (other.maxTemp != null)
				return false;
		} else if (!maxTemp.equals(other.maxTemp))
			return false;
		if (minTemp == null) {
			if (other.minTemp != null)
				return false;
		} else if (!minTemp.equals(other.minTemp))
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
		builder.append("WeatherDetails [date=");
		builder.append(date);
		builder.append(", maxTemp=");
		builder.append(maxTemp);
		builder.append(", minTemp=");
		builder.append(minTemp);
		builder.append("]");
		return builder.toString();
	}

}
