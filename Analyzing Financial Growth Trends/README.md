
# Square and Sort Array
This Java program squares non-zero elements of an integer array and sorts them in non-decreasing order. It uses a two-pointer technique to efficiently sort the squared values in place, while handling edge cases like empty arrays and null inputs.

## Features:
- Squares all non-zero elements of the array.
- Sorts the squared elements in non-decreasing order.
- Handles empty and null arrays gracefully with an exception.

## Requirements:
- Java 8 or higher.

## How It Works:

1. **Input**: The program takes an integer array as input.
2. **Squaring**: The program squares each non-zero element of the array.
3. **Sorting**: The squared values are sorted using a two-pointer approach from both ends of the array.
4. **Output**: The program returns a sorted array of squared values.

## Example:

### Input:

```java
int[] gp = new int[]{-5, -2, 0, 3, 10};
```

### Output:

```
[0, 4, 9, 25, 100]
```

### Explanation:
- **Squaring**: The array `{-5, -2, 0, 3, 10}` becomes `[25, 4, 0, 9, 100]`.
- **Sorting**: The array `[25, 4, 0, 9, 100]` is sorted to `[0, 4, 9, 25, 100]`.

### Edge Cases:
- An empty array (`{}`) will throw an `IllegalArgumentException` with the message `"Empty Array"`.
- A null input will also throw an `IllegalArgumentException`.

## Code Example:

```java
import java.util.Arrays;

public class Main {

    public static int[] compute(int[] gP) {
        if (gP == null || gP.length == 0) {
            throw new IllegalArgumentException("Empty Array");
        }

        // Step 1: Square the non-zero elements
        for (int j = 0; j < gP.length; j++) {
            if (gP[j] != 0) {
                gP[j] = gP[j] * gP[j];
            }
        }

        // Step 2: Sort the squared values in non-decreasing order using two pointers
        int[] result = new int[gP.length];
        int start = 0, end = gP.length - 1;
        int i = gP.length - 1; // Pointer to fill result from the back

        // Two pointer approach to fill result array from the back
        while (start <= end) {
            if (gP[start] > gP[end]) {
                result[i--] = gP[start++];
            } else {
                result[i--] = gP[end--];
            }
        }

        return result; // Return the sorted array
    }

    public static void main(String[] args) {
        try {
            // Test cases
            int[] gp = new int[]{-5, -2, 0, 3, 10};
            System.out.println(Arrays.toString(compute(gp)));

            int[] gp1 = new int[]{2, 2, 2};
            System.out.println(Arrays.toString(compute(gp1)));

            int[] gp0 = new int[]{};
            System.out.println(Arrays.toString(compute(gp0)));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
```

## How to Run:
1. **Clone the repository** or download the files to your local machine.
2. **Compile**: Open a terminal and run:
   ```sh
   javac Main.java
   ```
3. **Run**: After compilation, execute the program:
   ```sh
   java Main
   ```

