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
public class WeatherApiResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cod;
	private Double message;
	private Integer cnt;
	private City city;
	private List<ForecastDetails> list;

	/**
	 * @return the cod
	 */
	public String getCod() {
		return cod;
	}

	/**
	 * @param cod
	 *            the cod to set
	 */
	public void setCod(String cod) {
		this.cod = cod;
	}

	/**
	 * @return the message
	 */
	public Double getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(Double message) {
		this.message = message;
	}

	/**
	 * @return the cnt
	 */
	public Integer getCnt() {
		return cnt;
	}

	/**
	 * @param cnt
	 *            the cnt to set
	 */
	public void setCnt(Integer cnt) {
		this.cnt = cnt;
	}

	/**
	 * @return the city
	 */
	public City getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(City city) {
		this.city = city;
	}

	/**
	 * @return the list
	 */
	public List<ForecastDetails> getList() {
		return list;
	}

	/**
	 * @param list
	 *            the list to set
	 */
	public void setList(List<ForecastDetails> list) {
		this.list = list;
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
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((cnt == null) ? 0 : cnt.hashCode());
		result = prime * result + ((cod == null) ? 0 : cod.hashCode());
		result = prime * result + ((list == null) ? 0 : list.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
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
		WeatherApiResponse other = (WeatherApiResponse) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (cnt == null) {
			if (other.cnt != null)
				return false;
		} else if (!cnt.equals(other.cnt))
			return false;
		if (cod == null) {
			if (other.cod != null)
				return false;
		} else if (!cod.equals(other.cod))
			return false;
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
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
		builder.append("WeatherApiResponse [cod=");
		builder.append(cod);
		builder.append(", message=");
		builder.append(message);
		builder.append(", cnt=");
		builder.append(cnt);
		builder.append(", city=");
		builder.append(city);
		builder.append(", list=");
		builder.append(list);
		builder.append("]");
		return builder.toString();
	}

}
