# Animal Leg Counter

This project contains a Java program that counts the number of animals with exactly four legs from a given array of animal names. The program uses various data structures and approaches to efficiently solve the problem.

## Problem Statement

Given an array of animal names, return the count of animals that have exactly four legs. 

### Input Format:
- An array `animals` where each element is a string representing the name of an animal.

### Output Format:
- An integer representing the count of animals with four legs.

### Examples:

#### Example 1:
Input:
```java
String[] animals = {"lion", "monkey", "deer", "snake", "elephant"};
```
Output:
```
3
```
Explanation: In this array, "lion", "deer", and "elephant" have four legs.

#### Example 2:
Input:
```java
String[] animals = {"frog", "horse", "spider", "ant"};
```
Output:
```
1
```
Explanation: Only "horse" has four legs in this array.

---

## Implementation

The program is implemented with the following steps:

1. **Input Validation**: The input array is checked for `null` or empty conditions. If the array is invalid, an `IllegalArgumentException` is thrown.
2. **Animal Matching**: 
   - The program uses either a nested loop with a predefined `checker` array or a `HashSet` to efficiently identify animals with four legs.
3. **Output the Count**: The program returns the count of valid animals.

---

## Example Code

### Approach 1: Using `HashSet`
```java
import java.util.HashSet;
import java.util.Set;

public class AnimalCounter {
    public static int counting(String[] animals) {
        if (animals == null || animals.length == 0) {
            throw new IllegalArgumentException("Animals array is empty or null");
        }

        // Define a set of animals with exactly 4 legs
        Set<String> checker = new HashSet<>();
        checker.add("lion");
        checker.add("deer");
        checker.add("elephant");
        checker.add("horse");
        checker.add("dog");
        checker.add("cat");

        int count = 0;
        for (String animal : animals) {
            if (checker.contains(animal)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] animals = {"lion", "monkey", "deer", "snake", "elephant"};
        System.out.println("Count of animals with four legs: " + counting(animals));
    }
}
```

---

### Time Complexity

- Using **HashSet**:
  - **Construction of HashSet**: O(1) for a predefined set of fixed size.
  - **Lookup for each animal**: O(1) (on average).
  - Total time complexity: O(n), where `n` is the number of animals in the input array.

- Using **Nested Loops**:
  - Outer loop: O(n).
  - Inner loop: O(m), where `m` is the size of the `checker` array.
  - Total time complexity: O(n * m).

### Space Complexity

- **HashSet**: O(m), where `m` is the size of the `checker` set.
- **Nested Loops**: O(1) additional space.

---


## Testing

The program has been tested with various input scenarios:
1. Valid arrays with mixed animals.
2. Edge cases: null or empty arrays.
3. Arrays with repeated animal names.

---

## How to Run

1. Clone this repository:
```bash
git clone https://github.com/itsvee0120/AD325
cd "Animal Leg Count in the Forest"
```

2. Compile the Java file:
```bash
javac AnimalCounter.java
```

3. Run the program:
```bash
java AnimalCounter
```

---

## License
This project is licensed under the MIT License.
