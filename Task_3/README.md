# Lab Task 3 — String Utility (Palindrome Checker)

## Objective

The objective of this lab task is to use JUnit to test string-processing logic, palindrome detection, and case-insensitive string operations.

## Implementation

The `StringUtil` class contains the `isPalindrome(String s)` method. The method checks whether a given string is a palindrome.

The implementation performs the following operations:

1. Checks whether the input is `null`.
2. Removes non-alphabetic characters from the string.
3. Converts the string to lowercase to make the comparison case-insensitive.
4. Reverses the cleaned string.
5. Compares the reversed string with the original cleaned string.
6. Returns `true` if both strings are equal; otherwise, returns `false`.

An additional check is used to return `false` for an empty string, according to the test requirement.

## JUnit Testing

JUnit 5 is used to test the palindrome-checking functionality.

The following test cases are implemented:

* `"madam"` → `true`
* `"RaceCar"` → `true` because the comparison is case-insensitive.
* `"hello"` → `false`
* `null` → `false`
* Empty string → `false`

The `assertTrue()` assertion is used when a palindrome is expected, while `assertFalse()` is used when the input should not be considered a palindrome.

## Test Cases

| Method under test | Input       | Expected Output |
| ----------------- | ----------- | --------------- |
| `isPalindrome()`  | `"madam"`   | `true`          |
| `isPalindrome()`  | `"RaceCar"` | `true`          |
| `isPalindrome()`  | `"hello"`   | `false`         |
| `isPalindrome()`  | `null`      | `false`         |
| `isPalindrome()`  | `""`        | `false`         |

## Project Structure

```text
Software-Construction-Lab3/
│
├── README.md
├── pom.xml
│
└── Task_3/
    └── src/
        ├── main/
        │   └── java/
        │       └── StringUtil.java
        │
        └── test/
            └── java/
                └── StringUtilTest.java
```

## How to Run

### Using NetBeans

1. Open the `Software-Construction-Lab3` project in NetBeans.
2. Make sure Maven dependencies are loaded.
3. Open `StringUtilTest.java`.
4. Right-click the test file.
5. Select **Test File**.
6. Check the JUnit test results.

### Using Maven

Run the following command from the project directory:

```bash
mvn test
```

## Expected Result

All five JUnit test cases should pass successfully.

```text
Tests run: 5
Failures: 0
Errors: 0
Skipped: 0
```

Expected tests:

```text
✓ testMadam
✓ testRaceCarCaseInsensitive
✓ testHello
✓ testNullString
✓ testEmptyString
```

## Learning Outcome

This task provided practical experience with string manipulation, case-insensitive comparisons, input validation, and JUnit assertions. It also demonstrated how unit tests can be used to verify both normal and edge-case inputs such as `null` and empty strings.

## Conclusion

The `StringUtil` class successfully identifies palindrome strings while handling case differences, non-alphabetic characters, null input, and empty strings. The JUnit tests verify that the implementation produces the expected results for both valid and edge-case inputs.
