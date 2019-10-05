/**
 * 
 */
package com.interview.weatherservice.model;

import java.util.Date;
import java.util.List;

/**
 * @author indiahiring
 *
 */
public class ForecastDetails {

	private Date dt;
	private String dt_txt;
	private TempratureDetails main;
	private List<WeatherInfo> weather;
	private Clouds clouds;
	private Wind wind;
	private Sys sys;

	/**
	 * @return the dt
	 */
	public Date getDt() {
		return dt;
	}

	/**
	 * @param dt
	 *            the dt to set
	 */
	public void setDt(Date dt) {
		this.dt = dt;
	}

	/**
	 * @return the dt_txt
	 */
	public String getDt_txt() {
		return dt_txt;
	}

	/**
	 * @param dt_txt
	 *            the dt_txt to set
	 */
	public void setDt_txt(String dt_txt) {
		this.dt_txt = dt_txt;
	}

	/**
	 * @return the main
	 */
	public TempratureDetails getMain() {
		return main;
	}

	/**
	 * @param main
	 *            the main to set
	 */
	public void setMain(TempratureDetails main) {
		this.main = main;
	}

	/**
	 * @return the weather
	 */
	public List<WeatherInfo> getWeather() {
		return weather;
	}

	/**
	 * @param weather
	 *            the weather to set
	 */
	public void setWeather(List<WeatherInfo> weather) {
		this.weather = weather;
	}

	/**
	 * @return the clouds
	 */
	public Clouds getClouds() {
		return clouds;
	}

	/**
	 * @param clouds
	 *            the clouds to set
	 */
	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}

	/**
	 * @return the wind
	 */
	public Wind getWind() {
		return wind;
	}

	/**
	 * @param wind
	 *            the wind to set
	 */
	public void setWind(Wind wind) {
		this.wind = wind;
	}

	/**
	 * @return the sys
	 */
	public Sys getSys() {
		return sys;
	}

	/**
	 * @param sys
	 *            the sys to set
	 */
	public void setSys(Sys sys) {
		this.sys = sys;
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
		result = prime * result + ((clouds == null) ? 0 : clouds.hashCode());
		result = prime * result + ((dt == null) ? 0 : dt.hashCode());
		result = prime * result + ((dt_txt == null) ? 0 : dt_txt.hashCode());
		result = prime * result + ((main == null) ? 0 : main.hashCode());
		result = prime * result + ((sys == null) ? 0 : sys.hashCode());
		result = prime * result + ((weather == null) ? 0 : weather.hashCode());
		result = prime * result + ((wind == null) ? 0 : wind.hashCode());
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
		ForecastDetails other = (ForecastDetails) obj;
		if (clouds == null) {
			if (other.clouds != null)
				return false;
		} else if (!clouds.equals(other.clouds))
			return false;
		if (dt == null) {
			if (other.dt != null)
				return false;
		} else if (!dt.equals(other.dt))
			return false;
		if (dt_txt == null) {
			if (other.dt_txt != null)
				return false;
		} else if (!dt_txt.equals(other.dt_txt))
			return false;
		if (main == null) {
			if (other.main != null)
				return false;
		} else if (!main.equals(other.main))
			return false;
		if (sys == null) {
			if (other.sys != null)
				return false;
		} else if (!sys.equals(other.sys))
			return false;
		if (weather == null) {
			if (other.weather != null)
				return false;
		} else if (!weather.equals(other.weather))
			return false;
		if (wind == null) {
			if (other.wind != null)
				return false;
		} else if (!wind.equals(other.wind))
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
		builder.append("ForecastDetails [dt=");
		builder.append(dt);
		builder.append(", dt_txt=");
		builder.append(dt_txt);
		builder.append(", main=");
		builder.append(main);
		builder.append(", weather=");
		builder.append(weather);
		builder.append(", clouds=");
		builder.append(clouds);
		builder.append(", wind=");
		builder.append(wind);
		builder.append(", sys=");
		builder.append(sys);
		builder.append("]");
		return builder.toString();
	}

}
