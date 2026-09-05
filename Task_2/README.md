# Lab Task 2 — Bank Account Operations

## Objective

The objective of this lab is to test class invariants and exceptional conditions in a Java `BankAccount` class. The implementation ensures that invalid operations, such as depositing a negative amount or withdrawing more money than the available balance, are rejected using appropriate exceptions.

## Implementation

The `BankAccount` class contains the following methods:

* `deposit(double amt)` — adds money to the account balance.
* `withdraw(double amt)` — withdraws money if sufficient balance is available.
* `getBalance()` — returns the current account balance.

The class maintains the following rules:

* A negative deposit is not allowed and throws `IllegalArgumentException`.
* A withdrawal greater than the available balance is not allowed and throws `IllegalStateException`.
* A valid deposit increases the account balance.
* A valid withdrawal decreases the account balance.
* The account balance must not become negative.

## Testing

JUnit 5 tests were created to verify the following conditions:

1. Positive deposit increases the account balance.
2. Valid withdrawal decreases the account balance.
3. Withdrawal beyond the available balance throws `IllegalStateException`.
4. Negative deposit throws `IllegalArgumentException`.

The `assertEquals()` method is used to verify expected balances, while `assertThrows()` is used to verify that the correct exceptions are generated.

## Test Cases

| Method under test | Input                           | Expected Output            |
| ----------------- | ------------------------------- | -------------------------- |
| `deposit()`       | `1000`                          | Balance = `1000`           |
| `withdraw()`      | Balance `1000`, withdraw `300`  | Balance = `700`            |
| `withdraw()`      | Balance `1000`, withdraw `1500` | `IllegalStateException`    |
| `deposit()`       | `-500`                          | `IllegalArgumentException` |

## How to Run

1. Open the project in NetBeans or another Java IDE.
2. Make sure JUnit 5 is configured.
3. Open `BankAccountTest.java`.
4. Run the test file.
5. Verify that all four test cases pass successfully.

For a Maven project, tests can also be executed using:

```text
mvn test
```

## Expected Result

All four JUnit test cases should pass with:

```text
Tests run: 4
Failures: 0
Errors: 0
```

## Conclusion

The tests verify that the `BankAccount` class correctly handles normal banking operations and prevents invalid operations through exception handling.
