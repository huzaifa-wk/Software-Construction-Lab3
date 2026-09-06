# CalculatorApp – JUnit 5 Testing & Code Coverage

## Overview

This project is a Java-based Calculator application developed as part of the Software Construction laboratory. The purpose of this task was to extend the existing calculator functionality and improve the quality of software testing using **JUnit 5**.

The calculator provides basic arithmetic operations along with additional `power()` and `modulus()` operations. Unit tests were developed to verify normal, boundary, and exceptional cases. The project also uses **JaCoCo** to generate a code-coverage report.

---

## Technologies Used

* **Java 21**
* **Apache Maven**
* **JUnit 5**
* **JaCoCo**
* **NetBeans IDE**

---

## Calculator Features

The `Calculator1` class provides the following operations:

| Method                     | Description                                 |
| -------------------------- | ------------------------------------------- |
| `add(int a, int b)`        | Adds two integers                           |
| `subtract(int a, int b)`   | Subtracts the second integer from the first |
| `multiply(int a, int b)`   | Multiplies two integers                     |
| `divide(int a, int b)`     | Divides two integers                        |
| `power(int base, int exp)` | Calculates the power of a number            |
| `modulus(int a, int b)`    | Calculates the remainder                    |

### Exception Handling

The calculator handles invalid division and modulus operations.

If the divisor is zero:

```java
throw new IllegalArgumentException("Cannot divide by zero.");
```

For modulus, if the second value is zero:

```java
throw new IllegalArgumentException("Cannot calculate modulus by zero.");
```

---

## Changes Made

### 1. Added `power()` Method

The following method was added:

```java
public int power(int base, int exp) {
    return (int) Math.pow(base, exp);
}
```

This method calculates the value of a base raised to an exponent.

---

### 2. Added `modulus()` Method

The following method was added:

```java
public int modulus(int a, int b) {
    if (b == 0) {
        throw new IllegalArgumentException("Cannot calculate modulus by zero.");
    }
    return a % b;
}
```

The method calculates the remainder after division and throws an `IllegalArgumentException` when the divisor is zero.

---

## JUnit 5 Testing

JUnit 5 was used to test the calculator functionality.

The test class contains **9 test methods** covering different types of test cases.

### Normal Cases

Normal input values are tested for:

* Addition
* Subtraction
* Multiplication
* Division
* Power
* Modulus

### Boundary Cases

Boundary-style cases are tested using values such as:

* Adding negative and positive numbers
* Multiplication by zero
* Power with exponent `0`
* Power with base `1`
* Modulus resulting in `0`

Examples:

```java
assertEquals(1, calculator.power(10, 0));
assertEquals(1, calculator.power(1, 100));
```

### Exceptional Cases

Invalid operations are tested using JUnit's `assertThrows()`.

Division by zero:

```java
assertThrows(
    IllegalArgumentException.class,
    () -> calculator.divide(10, 0)
);
```

Modulus by zero:

```java
assertThrows(
    IllegalArgumentException.class,
    () -> calculator.modulus(10, 0)
);
```

The exception messages are also verified to ensure that the correct error is generated.

---

## Test Fixture Setup

`@BeforeEach` is used to create a new calculator object before every test:

```java
@BeforeEach
void setUp() {
    calculator = new Calculator1();
}
```

`@AfterEach` is used to reset the calculator instance after every test:

```java
@AfterEach
void tearDown() {
    calculator = null;
}
```

This ensures that each test starts with a fresh calculator instance and that test cases remain independent.

---

## Test Results

The project contains **9 JUnit 5 test methods**.

Expected result:

```text
Tests run: 9
Failures: 0
Errors: 0
Skipped: 0
```

All implemented tests pass successfully.

---

## Code Coverage

JaCoCo is used to generate the code-coverage report.

The Maven command used to generate the report is:

```text
clean verify
```

The generated report can be found at:

```text
target/site/jacoco/index.html
```

Open the `index.html` file in a web browser to view the coverage results.

### Coverage Percentage

**Coverage: [ENTER YOUR ACTUAL PERCENTAGE HERE]%**

> The percentage should be taken directly from the JaCoCo report generated in NetBeans.

---

## Project Structure

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
```

---

## Learning Outcome

This task improved the testing quality of the Calculator application by introducing systematic unit testing with JUnit 5. Instead of testing only normal inputs, the test suite also checks boundary conditions and invalid operations such as division and modulus by zero. Using `@BeforeEach` and `@AfterEach` makes the tests independent and ensures that a fresh calculator instance is used for every test. Exception testing also verifies that invalid inputs are handled correctly. Finally, JaCoCo code coverage provides measurable evidence of how much of the calculator code is exercised by the tests.

---

## Submission Requirements

The following items are included for submission:

* `Calculator1.java`
* `Calculator1Test.java`
* JaCoCo code-coverage screenshot
* Short reflection on improvement in testing quality
* `README.md`

---

## Author

**Mr. Cheeky**

Software Engineering
UET Abbottabad
