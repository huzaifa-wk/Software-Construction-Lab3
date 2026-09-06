/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Mr. Cheeky🥀
 */
public class Calculator1Test {

    private Calculator1 calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator1();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    void testAdd() {
        assertEquals(10, calculator.add(7, 3));
        assertEquals(0, calculator.add(-3, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(4, calculator.subtract(10, 6));
        assertEquals(-6, calculator.subtract(3, 9));
    }

    @Test
    void testMultiply() {
        assertEquals(15, calculator.multiply(3, 5));
        assertEquals(0, calculator.multiply(0, 100));
    }

    @Test
    void testDivide() {
        assertEquals(2, calculator.divide(10, 5));
        assertEquals(3, calculator.divide(9, 3));
    }

    @Test
    void testDivideByZero() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> calculator.divide(10, 0)
        );

        assertEquals("Cannot divide by zero.", exception.getMessage());
    }

    @Test
    void testPower() {
        assertEquals(8, calculator.power(2, 3));
        assertEquals(25, calculator.power(5, 2));
    }

    @Test
    void testPowerBoundary() {
        assertEquals(1, calculator.power(10, 0));
        assertEquals(1, calculator.power(1, 100));
    }

    @Test
    void testModulus() {
        assertEquals(1, calculator.modulus(10, 3));
        assertEquals(0, calculator.modulus(20, 5));
    }

    @Test
    void testModulusByZero() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> calculator.modulus(10, 0)
        );

        assertEquals(
                "Cannot calculate modulus by zero.",
                exception.getMessage()
        );
    }
}
