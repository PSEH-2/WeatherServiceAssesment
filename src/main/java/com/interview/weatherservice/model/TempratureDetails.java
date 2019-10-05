/**
 * 
 */
package com.interview.weatherservice.model;

import java.io.Serializable;

/**
 * @author indiahiring
 *
 */
public class TempratureDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Double temp;
	private Double temp_min;
	private Double temp_max;
	private Double pressure;
	private Double sea_level;
	private Double grnd_level;
	private Integer humidity;
	private Double temp_kf;

	/**
	 * @return the temp
	 */
	public Double getTemp() {
		return temp;
	}

	/**
	 * @param temp
	 *            the temp to set
	 */
	public void setTemp(Double temp) {
		this.temp = temp;
	}

	/**
	 * @return the temp_min
	 */
	public Double getTemp_min() {
		return temp_min;
	}

	/**
	 * @param temp_min
	 *            the temp_min to set
	 */
	public void setTemp_min(Double temp_min) {
		this.temp_min = temp_min;
	}

	/**
	 * @return the temp_max
	 */
	public Double getTemp_max() {
		return temp_max;
	}

	/**
	 * @param temp_max
	 *            the temp_max to set
	 */
	public void setTemp_max(Double temp_max) {
		this.temp_max = temp_max;
	}

	/**
	 * @return the pressure
	 */
	public Double getPressure() {
		return pressure;
	}

	/**
	 * @param pressure
	 *            the pressure to set
	 */
	public void setPressure(Double pressure) {
		this.pressure = pressure;
	}

	/**
	 * @return the sea_level
	 */
	public Double getSea_level() {
		return sea_level;
	}

	/**
	 * @param sea_level
	 *            the sea_level to set
	 */
	public void setSea_level(Double sea_level) {
		this.sea_level = sea_level;
	}

	/**
	 * @return the grnd_level
	 */
	public Double getGrnd_level() {
		return grnd_level;
	}

	/**
	 * @param grnd_level
	 *            the grnd_level to set
	 */
	public void setGrnd_level(Double grnd_level) {
		this.grnd_level = grnd_level;
	}

	/**
	 * @return the humidity
	 */
	public Integer getHumidity() {
		return humidity;
	}

	/**
	 * @param humidity
	 *            the humidity to set
	 */
	public void setHumidity(Integer humidity) {
		this.humidity = humidity;
	}

	/**
	 * @return the temp_kf
	 */
	public Double getTemp_kf() {
		return temp_kf;
	}

	/**
	 * @param temp_kf
	 *            the temp_kf to set
	 */
	public void setTemp_kf(Double temp_kf) {
		this.temp_kf = temp_kf;
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
		result = prime * result
				+ ((grnd_level == null) ? 0 : grnd_level.hashCode());
		result = prime * result
				+ ((humidity == null) ? 0 : humidity.hashCode());
		result = prime * result
				+ ((pressure == null) ? 0 : pressure.hashCode());
		result = prime * result
				+ ((sea_level == null) ? 0 : sea_level.hashCode());
		result = prime * result + ((temp == null) ? 0 : temp.hashCode());
		result = prime * result + ((temp_kf == null) ? 0 : temp_kf.hashCode());
		result = prime * result
				+ ((temp_max == null) ? 0 : temp_max.hashCode());
		result = prime * result
				+ ((temp_min == null) ? 0 : temp_min.hashCode());
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
		TempratureDetails other = (TempratureDetails) obj;
		if (grnd_level == null) {
			if (other.grnd_level != null)
				return false;
		} else if (!grnd_level.equals(other.grnd_level))
			return false;
		if (humidity == null) {
			if (other.humidity != null)
				return false;
		} else if (!humidity.equals(other.humidity))
			return false;
		if (pressure == null) {
			if (other.pressure != null)
				return false;
		} else if (!pressure.equals(other.pressure))
			return false;
		if (sea_level == null) {
			if (other.sea_level != null)
				return false;
		} else if (!sea_level.equals(other.sea_level))
			return false;
		if (temp == null) {
			if (other.temp != null)
				return false;
		} else if (!temp.equals(other.temp))
			return false;
		if (temp_kf == null) {
			if (other.temp_kf != null)
				return false;
		} else if (!temp_kf.equals(other.temp_kf))
			return false;
		if (temp_max == null) {
			if (other.temp_max != null)
				return false;
		} else if (!temp_max.equals(other.temp_max))
			return false;
		if (temp_min == null) {
			if (other.temp_min != null)
				return false;
		} else if (!temp_min.equals(other.temp_min))
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
		builder.append("TempratureDetails [temp=");
		builder.append(temp);
		builder.append(", temp_min=");
		builder.append(temp_min);
		builder.append(", temp_max=");
		builder.append(temp_max);
		builder.append(", pressure=");
		builder.append(pressure);
		builder.append(", sea_level=");
		builder.append(sea_level);
		builder.append(", grnd_level=");
		builder.append(grnd_level);
		builder.append(", humidity=");
		builder.append(humidity);
		builder.append(", temp_kf=");
		builder.append(temp_kf);
		builder.append("]");
		return builder.toString();
	}

}
