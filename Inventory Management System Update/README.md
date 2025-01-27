# Assignment: Inventory Management System Update | Array

## Objective:
The goal of this assignment is to implement a solution that processes an inventory array in such a way that whenever a product has a stock count of zero, the system will duplicate that entry, shifting the subsequent product entries to the right. This ensures that the inventory reflects an order for restocking those zero-stock items, without creating any extra space in the array.

### Problem Context:
In retail inventory systems, products with zero stock require restocking. The company wants to ensure that any product with a zero stock count is duplicated in the inventory list to represent the order for that product to be restocked. The unique requirement is that this operation must be carried out **in-place**, meaning no new arrays or additional space can be used beyond the original array.

### Requirements:
1. **Input Array**: A given array representing the inventory where each element is an integer. Each integer represents the stock count of a product.
2. **Operation**: For every `0` in the inventory, duplicate that entry and shift subsequent elements to the right. If the array has a `0` at position `i`, then:
    - The item at index `i` will stay at index `i`.
    - The `0` will be duplicated and placed at position `i + 1`.
    - All items after index `i` should be shifted right to make space for the new `0`.
3. **In-Place Modification**: The operation must be performed in-place, meaning no new arrays should be created, and the operation should modify the original array.
4. **Edge Cases**:
    - The array may be empty.
    - The array may contain no zeros, in which case no modification is needed.
    - The array may consist entirely of zeros.

### Function Specification:
The function to implement is `duplicatesZ(int[] inventory)`:

- **Input**:
    - An array `inventory` of integers, where each integer represents a product's stock count.

- **Output**:
    - The function modifies the `inventory` array in-place. No return value is needed.

The function should:
- Count the number of zeros in the array.
- Shift the elements in the array from the end to the beginning, duplicating any zeros and shifting subsequent products to the right.
- Ensure that the new array (with the duplicate zeros) does not exceed the original array’s length.

### Example Walkthrough:
Let’s walk through a few examples to better understand the functionality.

1. **Example 1**:
    - Input: `[4, 0, 1, 3, 0, 2, 5, 0]`
    - Steps:
        - Count the zeros: There are 3 zeros.
        - Shift elements starting from the end.
        - Result: `[4, 0, 0, 1, 3, 0, 0, 2]`
    - Output: `[4, 0, 0, 1, 3, 0, 0, 2]`

2. **Example 2**:
    - Input: `[3, 2, 1]`
    - Steps:
        - Count the zeros: There are no zeros.
        - Since there are no zeros, the array remains unchanged.
    - Output: `[3, 2, 1]`

3. **Example 3**:
    - Input: `[0, 0, 0]`
    - Steps:
        - Count the zeros: There are 3 zeros.
        - Shift elements from the end and duplicate the zeros.
        - Result: `[0, 0, 0]`
    - Output: `[0, 0, 0]`

4. **Example 4**:
    - Input: `[]`
    - Steps:
        - The array is empty, so no changes are needed.
    - Output: `[]`

5. **Example 5**:
    - Input: `[1, 2, 3, 0, 0, 0]`
    - Steps:
        - Count the zeros: There are 3 zeros.
        - Since all zeros are at the end, the array stays the same.
    - Output: `[1, 2, 3, 0, 0, 0]`

6. **Example 6**:
    - Input: `[1, 0, 2, 0, 3]`
    - Steps:
        - Count the zeros: There are 2 zeros.
        - Shift elements from the end and duplicate the zeros.
        - Result: `[1, 0, 0, 2, 0]`
    - Output: `[1, 0, 0, 2, 0]`

### Code Explanation:
```java
import java.util.Arrays;

public class Main {

    public static void duplicatesZ(int[] inventory) {
        int zeroes = 0;
        int len = inventory.length;

        // 1st for loop => zeroes count
        for (int i : inventory) {
            if (i == 0) {
                zeroes++;
            }
        }

        // 2nd for loop => computing the shift and duplication
        for (int i = len - 1; i >= 0; i--) {
            // Check if index + zeroes is within bounds
            if (i + zeroes < len) {
                inventory[i + zeroes] = inventory[i];
            }

            // If current element is zero, duplicate it
            if (inventory[i] == 0) {
                zeroes--;
                if (i + zeroes < len) {
                    inventory[i + zeroes] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Example test cases
        int[] inventory1 = new int[]{4, 0, 1, 3, 0, 2, 5, 0};
        duplicatesZ(inventory1);
        System.out.println(Arrays.toString(inventory1)); // Output: [4, 0, 0, 1, 3, 0, 0, 2]

        int[] inventory2 = new int[]{3, 2, 1};
        duplicatesZ(inventory2);
        System.out.println(Arrays.toString(inventory2)); // Output: [3, 2, 1]
    }
}
```

### Test Cases:

We can verify the implementation with the following test cases:

1. **Test Case 1**: An array containing zeros.
2. **Test Case 2**: An array with no zeros.
3. **Test Case 3**: An array containing only zeros.
4. **Test Case 4**: An empty array.
5. **Test Case 5**: An array with zeros at the end.
6. **Test Case 6**: An array with zeros in the middle.

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testDuplicatesZ_case1() {
        int[] inventory = new int[]{4, 0, 1, 3, 0, 2, 5, 0};
        Main.duplicatesZ(inventory);
        assertArrayEquals(new int[]{4,0,0,1,3,0,0,2}, inventory);
    }

    @Test
    public void testDuplicatesZ_case2() {
        int[] inventory = new int[]{3, 2, 1};
        Main.duplicatesZ(inventory);
        assertArrayEquals(new int[]{3, 2, 1}, inventory);
    }

    @Test
    public void testDuplicatesZ_case3() {
        int[] inventory = new int[]{0, 0, 0};
        Main.duplicatesZ(inventory);
        assertArrayEquals(new int[]{0, 0, 0}, inventory);
    }

    @Test
    public void testDuplicatesZ_case4() {
        int[] inventory = new int[]{};
        Main.duplicatesZ(inventory);
        assertArrayEquals(new int[]{}, inventory);
    }

    @Test
    public void testDuplicatesZ_case5() {
        int[] inventory = new int[]{1, 2, 3, 0, 0, 0};
        Main.duplicatesZ(inventory);
        assertArrayEquals(new int[]{1, 2, 3, 0, 0, 0}, inventory);
    }

    @Test
    public void testDuplicatesZ_case6() {
        int[] inventory = new int[]{1, 0, 2, 0, 3};
        Main.duplicatesZ(inventory);
        assertArrayEquals(new int[]{1, 0, 0, 2, 0}, inventory);
    }
}
```

### Conclusion:
This solution addresses the requirement of updating the inventory array in place by duplicating zeros, which simulates restocking, and shifting subsequent products to the right. It works efficiently even for edge cases, such as arrays with no zeros, arrays containing only zeros, and empty arrays.