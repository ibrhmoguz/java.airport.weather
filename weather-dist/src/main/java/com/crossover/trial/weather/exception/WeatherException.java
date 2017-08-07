package com.crossover.trial.weather.exception;

/**
 * An internal exception marker
 */
public class WeatherException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1763593411470554908L;
	
	public WeatherException(String message){
		super(message);
	}
}
