# Lab Task 4 — Simple Timer Utility

## Objective

The objective of this lab task is to use JUnit to test elapsed-time computation, boundary conditions, and invalid input handling.

## Implementation

The `TimerUtil` class contains the `secondsBetween(int start, int end)` method. The method calculates the number of seconds between a given start time and end time.

The implementation performs the following operations:

1. Checks whether the end time is smaller than the start time.
2. Throws an `IllegalArgumentException` if the end time is smaller than the start time.
3. Calculates the elapsed time by subtracting the start time from the end time.
4. Returns the calculated number of seconds.

## JUnit Testing

JUnit 5 is used to test the elapsed-time calculation and exception handling functionality.

The following test cases are implemented:

* `start = 10, end = 25` → `15` seconds
* `start = 0, end = 0` → `0` seconds
* `start = 25, end = 10` → `IllegalArgumentException`

The `assertEquals()` assertion is used when a specific elapsed-time value is expected, while `assertThrows()` is used to verify that an exception is generated for invalid input.

## Test Cases

| Method under test  | Input              | Expected Output            |
| ------------------ | ------------------ | -------------------------- |
| `secondsBetween()` | `start=10, end=25` | `15` seconds               |
| `secondsBetween()` | `start=0, end=0`   | `0` seconds                |
| `secondsBetween()` | `start=25, end=10` | `IllegalArgumentException` |

## Project Structure

```text
Software-Construction-Lab3/
│
├── README.md
├── pom.xml
│
└── Task_4/
    └── src/
        ├── main/
        │   └── java/
        │       └── TimerUtil.java
        │
        └── test/
            └── java/
                └── TimerUtilTest.java

```

## How to Run

### Using NetBeans

1. Open the `Software-Construction-Lab3` project in NetBeans.
2. Make sure Maven dependencies are loaded.
3. Open `TimerUtilTest.java`.
4. Right-click the test file.
5. Select **Test File**.
6. Check the JUnit test results.

### Using Maven

Run the following command from the project directory:

```bash
mvn test
```

## Expected Result

All three JUnit test cases should pass successfully.

```text
Tests run: 3
Failures: 0
Errors: 0
Skipped: 0

```

Expected tests:

```text
✓ testNormalCase
✓ testBoundaryCase
✓ testInvalidInput

```

## Learning Outcome

This task provided practical experience with elapsed-time calculations, boundary-condition testing, input validation, exception handling, and JUnit assertions. It also demonstrated how unit tests can be used to verify both normal and invalid inputs.

## Conclusion

The `TimerUtil` class successfully calculates the elapsed time between a start and end value while preventing invalid time ranges. The JUnit tests verify the correct results for normal and boundary cases and confirm that an `IllegalArgumentException` is generated when the end time is earlier than the start time.
