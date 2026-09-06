/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package SimpleTimerUtility;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author codez
 */
public class TimerUtilTest {

    @Test
    public void testNormalCase() {
        TimerUtil timer = new TimerUtil();

        int result = timer.secondsBetween(10, 25);

        assertEquals(15, result);
    }

    @Test
    public void testBoundaryCase() {
        TimerUtil timer = new TimerUtil();

        int result = timer.secondsBetween(0, 0);

        assertEquals(0, result);
    }

    @Test
    public void testInvalidInput() {
        TimerUtil timer = new TimerUtil();

        assertThrows(
                IllegalArgumentException.class,
                () -> timer.secondsBetween(25, 10)
        );
    }
}
