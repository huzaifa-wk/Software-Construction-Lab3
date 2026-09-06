# 🧮 CalculatorApp — Enhanced Java Calculator with JUnit 5 & JaCoCo Coverage

A robust Java mathematical utility application built using **NetBeans** and **Apache Maven**. This repository showcases best practices in Test-Driven Development (TDD), defensive programming, boundary testing, and continuous code coverage analysis using **JUnit 5** and **JaCoCo**.

---

## 📌 Project Overview

`CalculatorApp` extends a foundational arithmetic utility to support higher-order mathematical operations, including exponentiation and modulus arithmetic. The primary goal of this project is to maintain 100% test coverage across all execution paths while enforcing strict runtime assertions and handling exceptional edge cases gracefully.

### Key Highlights
- **Defensive Engineering:** Strict input validation that catches invalid states (e.g., division or modulus by zero) and raises descriptive runtime exceptions (`IllegalArgumentException`).
- **Comprehensive Unit Testing:** Built using JUnit 5 dynamic assertions and lifecycle mechanics to guarantee complete state isolation between individual test executions.
- **Full Coverage Guarantee:** Configured alongside JaCoCo to track line, branch, and instruction-level code coverage.

---

## 🛠️ Architecture & Features

The application provides six primary operations exposed through a clean Java API:

| Operation | Method Signature | Behavior / Edge Cases |
| :--- | :--- | :--- |
| **Addition** | `add(int a, int b)` | Returns $a + b$. Works with positive, negative, and zero inputs. |
| **Subtraction** | `subtract(int a, int b)` | Returns $a - b$. Correctly handles negative differences. |
| **Multiplication** | `multiply(int a, int b)` | Returns $a \times b$. Handles identity and zero products. |
| **Division** | `divide(int a, int b)` | Returns $\lfloor a / b \rfloor$. Throws `IllegalArgumentException` if $b = 0$. |
| **Power** | `power(int base, int exp)` | Computes $base^{exp}$ via `Math.pow`. Handles $x^0 = 1$ and $1^x = 1$. |
| **Modulus** | `modulus(int a, int b)` | Returns $a \pmod b$. Throws `IllegalArgumentException` if $b = 0$. |

---

## 📂 Project Structure

```text
CalculatorApp
│
├── src
│   ├── main
│   │   └── java
│   │       └── Calculator
│   │           └── Calculator1.java
│   │
│   └── test
│       └── java
│           └── Calculator
│               └── Calculator1Test.java
│
├── target
│   └── site
│       └── jacoco
│           └── index.html
│
├── pom.xml
└── README.md
