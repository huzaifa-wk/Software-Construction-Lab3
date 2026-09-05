# Software-Construction-Lab3
# Lab Task 1 — Temperature Converter

## Objective

The objective of this lab is to test the correctness of temperature conversion formulas between Celsius, Fahrenheit, and Kelvin using Java and JUnit testing.

## Implementation

In this lab, a `TemperatureConverter` class was implemented with the following methods:

* `celsiusToFahrenheit()` — converts Celsius to Fahrenheit.
* `fahrenheitToCelsius()` — converts Fahrenheit to Celsius.
* `celsiusToKelvin()` — converts Celsius to Kelvin.

JUnit tests were created to verify known temperature conversion values. A round-trip test was also implemented to verify that converting Celsius to Fahrenheit and then back to Celsius produces approximately the original value.

An assertion tolerance of `0.01` was used for decimal calculations.

## Project Structure

```text
Software-Construction-Lab3/
│
├── README.md
├── pom.xml
└── src/
    ├── main/
    │   └── java/
    │       └── TemperatureConverter.java
    │
    └── test/
        └── java/
            └── TemperatureConverterTest.java
```

## How to Run

1. Clone or download this repository.
2. Open the project in NetBeans or another Java IDE.
3. Build the project.
4. Run the JUnit test class `TemperatureConverterTest`.
5. Verify that all tests pass successfully.

For Maven projects, tests can also be executed using:

```text
mvn test
```

## Testing

The tests verify:

* `0°C = 32°F`
* `100°C = 212°F`
* `32°F = 0°C`
* `212°F = 100°C`
* `0°C = 273.15K`
* `100°C = 373.15K`
* Celsius → Fahrenheit → Celsius round-trip conversion

## Result

All implemented JUnit test cases should pass successfully, confirming that the temperature conversion methods produce the expected results within the specified tolerance.
