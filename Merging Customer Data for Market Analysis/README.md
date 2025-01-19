# Merging Two Sorted Arrays

## Overview
This program demonstrates how to merge two sorted arrays into a single sorted array. The merging process is performed in place for the first array, assuming it has enough space to hold all elements from both arrays.

## Key Features
- **In-place merging:** Merges the elements of the second array into the first array without using extra space.
- **Sorted input:** Assumes the input arrays are already sorted in ascending order.

## How It Works
1. The `merging` method uses three pointers:
    - `i` for traversing the valid elements in `customerData1` (starting from the end of valid elements).
    - `j` for traversing `customerData2` (starting from the end).
    - `f` for placing merged elements in `customerData1` from the end of the array.

2. Elements are compared from the ends of the arrays, and the larger one is placed in the current position pointed to by `f`.

3. If any elements remain in `customerData2` after the first loop, they are copied directly into `customerData1`.

## Example Usage
### Input:
1. `customerData1 = [101, 104, 107, 0, 0]`, `m = 3`
2. `customerData2 = [102, 105]`, `n = 2`

### Output:
```
Final Array: [101, 102, 104, 105, 107]
```

### Input:
1. `customerData1 = [103]`, `m = 1`
2. `customerData2 = []`, `n = 0`

### Output:
```
Final Array: [103]
```

## How to Run
1. Compile and run the `Main` class in any Java IDE or via the command line.
2. The output will display the final merged arrays for the provided test cases.

## Code Explanation
```java
import java.util.Arrays;

public class Main {

    public static int[] merging(int[] customerData1, int[] customerData2, int m, int n){

        int i =  m -1;
        int j = n -1;
        int f = (m + n) -1;

        while(i >= 0 && j >= 0){
            if(customerData1[i] > customerData2[j]){
                customerData1[f--] = customerData1[i--];
            } else{
                customerData1[f--] = customerData2[j--];
            }
        }

        while(j >= 0){
            customerData1[f--] = customerData2[j--];
        }

        return customerData1;
    }

    public static void main(String[] args) {

        int[] customerData1 = new int[]{101,104,107,0,0};
        int m = 3;
        int[] customerData2 = new int[]{102,105};
        int n = 2;

        System.out.println("Final Array: "+ Arrays.toString(merging(customerData1, customerData2,  m,  n)));


        int[] customerData3 = new int[]{103};
        int m1 = 1;
        int[] customerData4 = new int[]{};
        int n1 = 0;

        System.out.println("Final Array: "+ Arrays.toString(merging(customerData3, customerData4,  m1,  n1)));
    }
}
```

## Prerequisites
- Arrays must be sorted before merging.

## Possible Enhancements
- Extend functionality to handle unsorted input by sorting the arrays first.
- Add error handling for edge cases, such as null inputs. The code Assuming that `customerData1 and int m < 0`
