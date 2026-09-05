# Software Construction Lab 3

## Objective

The objective of this lab is to practice unit testing in Java using JUnit 5. The lab focuses on testing normal cases, boundary conditions, invalid inputs, exception handling, string operations, and basic business rules. The tasks are organized using a Maven-style project structure with separate source and test files.

## Implementation and Tasks Completed

Five Java programming tasks were implemented and tested using JUnit 5.

### Lab Task 1 — Temperature Converter

Implemented a `TemperatureConverter` class for converting:

* Celsius to Fahrenheit
* Fahrenheit to Celsius
* Celsius to Kelvin

JUnit tests were created to verify the conversion results and round-trip conversion.

### Lab Task 2 — Bank Account Operations

Implemented a `BankAccount` class for basic account operations such as:

* Depositing money
* Withdrawing money
* Checking the account balance

JUnit tests verify valid transactions and exceptional conditions such as negative deposits and overdrafts.

### Lab Task 3 — String Utility (Palindrome Checker)

Implemented a `StringUtil` class to determine whether a string is a palindrome.

The tests cover:

* Normal palindrome strings
* Case-insensitive input
* Non-palindrome strings
* `null` input
* Empty strings

### Lab Task 4 — Simple Timer Utility

Implemented a `TimerUtil` class to calculate the number of seconds between a start and end value.

The tests cover:

* Normal elapsed-time calculation
* Boundary condition where start and end are equal
* Invalid input where the end value is smaller than the start value

### Lab Task 5 — Shopping Cart

Implemented a `ShoppingCart` class for basic shopping cart operations.

The tests verify:

* Adding items
* Removing items
* Counting items
* Clearing the cart
* Removing a non-existent item without throwing an exception

## Project Structure

```text
Software-Construction-Lab3/
│
├── README.md
├── pom.xml
│
├── Task_1/
│   ├── README.md
│   └── src/
│       ├── main/
│       │   └── java/
│       │       └── TemperatureConverter.java
│       │
│       └── test/
│           └── java/
│               └── TemperatureConverterTest.java
│
├── Task_2/
│   ├── README.md
│   └── src/
│       ├── main/
│       │   └── java/
│       │       └── BankAccount.java
│       │
│       └── test/
│           └── java/
│               └── BankAccountTest.java
│
├── Task_3/
│   ├── README.md
│   └── src/
│       ├── main/
│       │   └── java/
│       │       └── StringUtil.java
│       │
│       └── test/
│           └── java/
│               └── StringUtilTest.java
│
├── Task_4/
│   ├── README.md
│   └── src/
│       ├── main/
│       │   └── java/
│       │       └── TimerUtil.java
│       │
│       └── test/
│           └── java/
│               └── TimerUtilTest.java
│
└── Task_5/
    ├── README.md
    └── src/
        ├── main/
        │   └── java/
        │       └── ShoppingCart.java
        │
        └── test/
            └── java/
                └── ShoppingCartTest.java
```

## How to Run the Code and Tests

### Using NetBeans

1. Open the `Software-Construction-Lab3` project in NetBeans.
2. Make sure the Maven dependencies are loaded.
3. Navigate to the required task.
4. Open the corresponding JUnit test file.
5. Right-click the test file.
6. Select **Test File**.
7. View the results in the JUnit Test Results window.

Each task can be tested separately.

### Using Maven

Open a terminal in the project directory and run:

```bash
mvn test
```

This command compiles the project and executes the JUnit tests.

## Technologies Used

* Java
* JUnit 5
* Maven
* NetBeans
* Git
* GitHub
