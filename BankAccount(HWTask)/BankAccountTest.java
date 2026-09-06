/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package BankAccount;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Huzaifa Waheed Khan
 */
public class BankAccountTest {

    @Test
    public void testDepositPositiveAmount() {
        BankAccount account = new BankAccount();

        account.deposit(1000);

        assertEquals(1000.0, account.getBalance(), 0.01);
    }

    @Test
    public void testWithdrawValidAmount() {
        BankAccount account = new BankAccount();

        account.deposit(1000);
        account.withdraw(300);

        assertEquals(700.0, account.getBalance(), 0.01);
    }

    @Test
    public void testWithdrawBeyondBalance() {
        BankAccount account = new BankAccount();

        account.deposit(1000);

        assertThrows(
                IllegalStateException.class,
                () -> account.withdraw(1500)
        );
    }

    @Test
    public void testDepositNegativeAmount() {
        BankAccount account = new BankAccount();

        assertThrows(
                IllegalArgumentException.class,
                () -> account.deposit(-500)
        );
    }
}
