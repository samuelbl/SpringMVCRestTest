package com.jcg.examples.bean;

public class MfaPojo {
	private String email;
	private String tipo;
	private Boolean mfa;
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "MfaPojo [email=" + email + ", tipo=" + tipo + ", mfa=" + mfa + "]";
	}
	/**
	 * @return the mfa
	 */
	public Boolean getMfa() {
		return mfa;
	}
	/**
	 * @param mfa the mfa to set
	 */
	public void setMfa(Boolean mfa) {
		this.mfa = mfa;
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
