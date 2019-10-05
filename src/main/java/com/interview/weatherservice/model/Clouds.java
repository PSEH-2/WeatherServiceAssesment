/**
 * 
 */
package com.interview.weatherservice.model;

import java.io.Serializable;

/**
 * @author indiahiring
 *
 */
public class Clouds implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer all;

	/**
	 * @return the all
	 */
	public Integer getAll() {
		return all;
	}

	/**
	 * @param all the all to set
	 */
	public void setAll(Integer all) {
		this.all = all;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((all == null) ? 0 : all.hashCode());
		return result;
	}

	/* (non-Javadoc)
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
		Clouds other = (Clouds) obj;
		if (all == null) {
			if (other.all != null)
				return false;
		} else if (!all.equals(other.all))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Clouds [all=");
		builder.append(all);
		builder.append("]");
		return builder.toString();
	}
	
	
}
