/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ShoppingCart;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Huzaifa Waheed Khan
 */
public class ShoppingCartTest {

    @Test
    public void testAddThreeItems() {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Laptop");
        cart.addItem("Mouse");
        cart.addItem("Keyboard");

        assertEquals(3, cart.getItemCount());
    }

    @Test
    public void testRemoveOneItem() {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Laptop");
        cart.addItem("Mouse");
        cart.addItem("Keyboard");

        cart.removeItem("Mouse");

        assertEquals(2, cart.getItemCount());
    }

    @Test
    public void testClearCart() {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Laptop");
        cart.addItem("Mouse");
        cart.addItem("Keyboard");

        cart.clear();

        assertEquals(0, cart.getItemCount());
    }

    @Test
    public void testRemoveNonExistentItem() {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Laptop");

        assertDoesNotThrow(() -> cart.removeItem("Phone"));

        assertEquals(1, cart.getItemCount());
    }
}
