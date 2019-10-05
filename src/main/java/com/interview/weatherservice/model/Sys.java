/**
 * 
 */
package com.interview.weatherservice.model;

import java.io.Serializable;

/**
 * @author indiahiring
 *
 */
public class Sys implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String pod;

	/**
	 * @return the pod
	 */
	public String getPod() {
		return pod;
	}

	/**
	 * @param pod the pod to set
	 */
	public void setPod(String pod) {
		this.pod = pod;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pod == null) ? 0 : pod.hashCode());
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
		Sys other = (Sys) obj;
		if (pod == null) {
			if (other.pod != null)
				return false;
		} else if (!pod.equals(other.pod))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Sys [pod=");
		builder.append(pod);
		builder.append("]");
		return builder.toString();
	}
	
}
