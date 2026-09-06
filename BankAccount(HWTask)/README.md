# 🏦 BankAccount — Java Account Validation & Unit Testing

A Java-based banking utility application built with NetBeans and Maven. This project models core bank account business operations, enforcing business rules such as balance validation, overdraft prevention, dynamic account inactivity tracking, and defensive exception handling using JUnit 5 assertions.

---

## 📌 Features

- **Deposit Operations:** Accepts valid funds and dynamically reactivates accounts when thresholds are met. Prevents negative deposits.
- **Withdrawal Safeguards:** Enforces overdraft protection and blocks negative withdrawal amounts.
- **Inactivity Logic:** Automatically marks accounts as inactive (`isActive() = false`) when the balance drops below $100 after a withdrawal.
- **Comprehensive Unit Testing:** Uses JUnit 5 (`@BeforeEach`, `assertEquals`, `assertTrue`, `assertFalse`, `assertThrows`) to validate normal, boundary, and exceptional conditions.

---

## 🛠️ Business Rules & API Methods

| Method | Signature | Business Logic & Rules |
| :--- | :--- | :--- |
| **Deposit** | `deposit(double amt)` | Adds `amt` to balance. Throws `IllegalArgumentException` if `amt < 0`. Reactivates account if balance $\ge 100$. |
| **Withdraw** | `withdraw(double amt)` | Subtracts `amt` from balance. Throws `IllegalArgumentException` if `amt < 0`, or `IllegalStateException` if `amt > balance`. Sets account inactive if balance $< 100$. |
| **Get Balance** | `getBalance()` | Returns current account balance (`double`). |
| **Is Active** | `isActive()` | Returns `true` if balance $\ge 100$, otherwise `false`. |

---

## 📂 Project Structure

```text
BankAccount
│
├── src
│   ├── main
│   │   └── java
│   │       └── BankAccount
│   │           └── BankAccount.java
│   │
│   └── test
│       └── java
│           └── BankAccount
│               └── BankAccountTest.java
│
├── pom.xml
└── README.md
