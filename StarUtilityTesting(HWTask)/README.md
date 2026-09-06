# 🔤 StringUtility — String Processing & JUnit 5 Testing

A Java utility project built with NetBeans and Maven, designed to analyze, process, and validate strings. This application provides robust logic for checking palindromes, counting vowels, and validating anagrams while demonstrating comprehensive testing practices using **JUnit 5** with `@DisplayName` annotations.

---

## 📌 Features

- **Palindrome Check:** Identifies whether a string is a palindrome, ignoring non-alphabetic characters and casing.
- **Vowel Counting:** Counts the occurrences of vowels (`a`, `e`, `i`, `o`, `u`) in a given string regardless of case.
- **Anagram Validation:** Compares two strings to determine if they are anagrams of each other.
- **Null & Empty Safety:** Safely handles empty strings and `null` pointers without throwing unhandled exceptions.
- **Descriptive JUnit 5 Reporting:** Uses expressive method names and `@DisplayName` annotations for readable test outputs.

---

## 🛠️ API Methods

| Method | Signature | Behavior & Edge-Case Rules |
| :--- | :--- | :--- |
| **Palindrome** | `isPalindrome(String s)` | Strips non-letters and performs case-insensitive check. Returns `false` for `null` or empty inputs. |
| **Count Vowels** | `countVowels(String s)` | Counts all vowels (`a, e, i, o, u`). Returns `0` for `null`, empty, or vowel-free strings. |
| **Anagram** | `isAnagram(String s1, String s2)` | Compares normalized character counts between two strings. Returns `false` if either string is `null`, empty, or mismatched in length. |

---

## 📂 Project Structure

```text
StringUtility
│
├── src
│   ├── main
│   │   └── java
│   │       └── StringUtility
│   │           └── StringUtil.java
│   │
│   └── test
│       └── java
│           └── StringUtility
│               └── StringUtilTest.java
│
├── pom.xml
└── README.md
