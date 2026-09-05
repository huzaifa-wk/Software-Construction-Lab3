/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package StringUtility;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Huzaifa Waheed Khan
 */
public class StringUtilTest {

    @Test
    public void testMadam() {
        StringUtil util = new StringUtil();

        assertTrue(util.isPalindrome("madam"));
    }

    @Test
    public void testRaceCarCaseInsensitive() {
        StringUtil util = new StringUtil();

        assertTrue(util.isPalindrome("RaceCar"));
    }

    @Test
    public void testHello() {
        StringUtil util = new StringUtil();

        assertFalse(util.isPalindrome("hello"));
    }

    @Test
    public void testNullString() {
        StringUtil util = new StringUtil();

        assertFalse(util.isPalindrome(null));
    }

    @Test
    public void testEmptyString() {
        StringUtil util = new StringUtil();

        assertFalse(util.isPalindrome(""));
    }
}
