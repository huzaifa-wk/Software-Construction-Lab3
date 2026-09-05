/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TemperatureConverter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Huzaifa Waheed Khan
 */
public class TemperatureConverterTest {

    @Test
    public void testCelsiusToFahrenheit() {
        TemperatureConverter converter = new TemperatureConverter();

        assertEquals(32.0, converter.celsiusToFahrenheit(0), 0.01);
        assertEquals(212.0, converter.celsiusToFahrenheit(100), 0.01);
    }

    @Test
    public void testFahrenheitToCelsius() {
        TemperatureConverter converter = new TemperatureConverter();

        assertEquals(0.0, converter.fahrenheitToCelsius(32), 0.01);
        assertEquals(100.0, converter.fahrenheitToCelsius(212), 0.01);
    }

    @Test
    public void testCelsiusToKelvin() {
        TemperatureConverter converter = new TemperatureConverter();

        assertEquals(273.15, converter.celsiusToKelvin(0), 0.01);
        assertEquals(373.15, converter.celsiusToKelvin(100), 0.01);
    }

    @Test
    public void testRoundTripConversion() {
        TemperatureConverter converter = new TemperatureConverter();

        double original = 25.0;

        double fahrenheit = converter.celsiusToFahrenheit(original);
        double result = converter.fahrenheitToCelsius(fahrenheit);

        assertEquals(original, result, 0.01);
    }
}
