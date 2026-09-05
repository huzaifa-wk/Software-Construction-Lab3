# Lab Task 5 — Shopping Cart (Mini Case Study)

## Objective

The objective of this lab task is to use JUnit to test a simple shopping cart system, combine multiple test assertions, and verify basic business rules such as adding, removing, and clearing items.

## Implementation

The `ShoppingCart` class manages a collection of shopping cart items using an `ArrayList`.

The implementation performs the following operations:

1. Adds an item to the shopping cart.
2. Removes an item from the shopping cart.
3. Returns the total number of items in the cart.
4. Clears all items from the shopping cart.
5. Allows an attempt to remove a non-existent item without throwing an error.

The shopping cart uses a private list to store the items, which keeps the cart data protected from direct external access.

## JUnit Testing

JUnit 5 is used to test the shopping cart functionality and business rules.

The following test cases are implemented:

* Add 3 items → count = `3`
* Remove 1 item → count = `2`
* Clear cart → count = `0`
* Remove a non-existent item → no exception is thrown and the item count remains unchanged

The `assertEquals()` assertion is used to verify the number of items in the cart. The `assertDoesNotThrow()` assertion is used to verify that removing a non-existent item does not generate an exception.

## Test Cases

| Method under test                 | Input             | Expected Output |
| --------------------------------- | ----------------- | --------------- |
| `addItem()` / `getItemCount()`    | Add 3 items       | `3` items       |
| `removeItem()` / `getItemCount()` | Remove 1 item     | `2` items       |
| `clear()` / `getItemCount()`      | Clear cart        | `0` items       |
| `removeItem()`                    | Non-existent item | No exception    |

## Project Structure

```text
Software-Construction-Lab3/
│
├── README.md
├── pom.xml
│
└── Task_5/
    └── src/
        ├── main/
        │   └── java/
        │       └── ShoppingCart.java
        │
        └── test/
            └── java/
                └── ShoppingCartTest.java

```

## How to Run

### Using NetBeans

1. Open the `Software-Construction-Lab3` project in NetBeans.
2. Make sure Maven dependencies are loaded.
3. Open `ShoppingCartTest.java`.
4. Right-click the test file.
5. Select **Test File**.
6. Check the JUnit test results.

### Using Maven

Run the following command from the project directory:

```bash
mvn test
```

## Expected Result

All four JUnit test cases should pass successfully.

```text
Tests run: 4
Failures: 0
Errors: 0
Skipped: 0

```

Expected tests:

```text
✓ testAddThreeItems
✓ testRemoveOneItem
✓ testClearCart
✓ testRemoveNonExistentItem
```

## Learning Outcome

This task provided practical experience with testing collection-based functionality, combining multiple assertions, and verifying simple business rules. It also demonstrated how JUnit can be used to test operations that modify the state of an object.

## Conclusion

The `ShoppingCart` class successfully manages items through add, remove, count, and clear operations. The JUnit tests verify that items are added and removed correctly, the cart can be cleared, and attempting to remove a non-existent item does not cause an exception. All test cases are expected to pass successfully.
