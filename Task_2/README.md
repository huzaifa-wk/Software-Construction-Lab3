# Lab Task 2 — Bank Account Operations

## Objective

The objective of this lab is to test class invariants and exceptional conditions in a Java `BankAccount` class. The implementation ensures that valid banking operations work correctly and invalid operations are prevented using appropriate exceptions.

## Implementation

The `BankAccount` class contains the following methods:

* `deposit(double amt)` — adds the specified amount to the account balance.
* `withdraw(double amt)` — withdraws the specified amount if sufficient balance is available.
* `getBalance()` — returns the current account balance.

The implementation enforces the following conditions:

* A positive deposit increases the balance.
* A valid withdrawal decreases the balance.
* A negative deposit throws `IllegalArgumentException`.
* A withdrawal greater than the available balance throws `IllegalStateException`.
* The account balance cannot become negative.

## JUnit Testing

JUnit 5 is used to test the `BankAccount` class.

The following test cases are implemented:

1. **Positive Deposit** — verifies that depositing `1000` increases the balance to `1000`.
2. **Valid Withdrawal** — verifies that withdrawing `300` from a balance of `1000` results in a balance of `700`.
3. **Overdraft** — verifies that withdrawing more than the available balance throws `IllegalStateException`.
4. **Negative Deposit** — verifies that depositing a negative amount throws `IllegalArgumentException`.

The `assertEquals()` method is used to verify expected balance values, while `assertThrows()` is used to verify expected exceptions.

## Test Cases

| Method under test | Input                               | Expected Output            |
| ----------------- | ----------------------------------- | -------------------------- |
| `deposit()`       | `1000`                              | Balance = `1000`           |
| `withdraw()`      | Balance = `1000`, Withdraw = `300`  | Balance = `700`            |
| `withdraw()`      | Balance = `1000`, Withdraw = `1500` | `IllegalStateException`    |
| `deposit()`       | `-500`                              | `IllegalArgumentException` |

## Project Structure

```text
Software-Construction-Lab3/
│
├── README.md
├── pom.xml
Task_2/
└── src/
    ├── main/
    │   └── java/
    │       └── BankAccount.java
    │
    └── test/
        └── java/
            └── BankAccountTest.java
```

## How to Run

### Using NetBeans

1. Open the `Software-Construction-Lab3` project in NetBeans.
2. Make sure the Maven dependencies are loaded.
3. Open `BankAccountTest.java`.
4. Right-click the file.
5. Select **Test File**.
6. Check the JUnit test results.

### Using Maven

Open a terminal in the project directory and run:

```bash
mvn test
```

## Expected Test Result

All four JUnit test cases should pass successfully.

```text
Tests run: 4
Failures: 0
Errors: 0
Skipped: 0
```

Expected tests:

```text
✓ testDepositPositiveAmount
✓ testWithdrawValidAmount
✓ testWithdrawBeyondBalance
✓ testDepositNegativeAmount
```

## Learning Outcome

This lab provided practical experience with JUnit testing, assertions, exception handling, and class invariants. It demonstrated how unit tests can verify both normal operations and invalid conditions in a Java program.

## Conclusion

The `BankAccount` class correctly performs valid deposit and withdrawal operations while preventing invalid transactions. The JUnit test cases verify that the account balance is updated correctly and that the appropriate exceptions are thrown for negative deposits and overdrafts.
