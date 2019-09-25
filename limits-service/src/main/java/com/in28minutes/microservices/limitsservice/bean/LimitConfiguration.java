package com.in28minutes.microservices.limitsservice.bean;

public class LimitConfiguration {

	protected LimitConfiguration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LimitConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
	
	private int maximum;
	private int minimum;
	
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
}
