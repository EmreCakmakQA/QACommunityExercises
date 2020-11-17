package com.qa.community.temperatureconverter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;



public class TemperatureConverterTEST {
	
	static TemperatureConverter testConverter;
	
	
	
	@BeforeAll
	public static void beforeAll() {
		testConverter = new TemperatureConverter();
	}
	
	
	@Test
	public void celciusToFahrenheit() {
		
		float testValue = testConverter.convertCelsiusToFahrenheit(20);
		System.out.println("Expected: 68.0 \nObtained: " + testValue + "\n");
		assertEquals(68.0f, testValue);
		
		
	}
	
	@Test
	public void FahrenheitToCelcius() {
		float testValue = testConverter.convertFahrenheitToCelsius(41);
		System.out.println("Expected: 5.0 \nObtained: " + testValue + "\n");
		assertEquals(5.0f, testValue);
		
	}
	
	@Test
	public void KelvinToCelcius() {
		float testValue = testConverter.convertKelvinToCelsius(273);
		System.out.println("Expected: -0.15 \nObtained: " + testValue + "\n");
		assertEquals(-0.15f, testValue);
		
	}
	
	@Test
	public void CelciusToKelvin() {
		float testValue = testConverter.convertCelsiusToKelvin(20);
		System.out.println("Expected: 293.15 \nObtained: " + testValue + "\n");
		assertEquals(293.15f, testValue);
		
	}
	
	@Test
	public void FahrenheitToKelvin() {
		float testValue = testConverter.convertFahrenheitToKelvin(23);
		System.out.println("Expected: 268.15 \nObtained: " + testValue + "\n");
		assertEquals(268.15f, testValue);
		
	}
	
	@Test
	public void KelvinToFahrenheit() {
		float testValue = testConverter.convertKelvinToFahrenheit(20);
		System.out.println("Expected: -423.67 \nObtained: " + testValue + "\n");
		assertEquals(-423.67f, testValue);
		
	}
	
}




