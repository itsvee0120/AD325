# Selection Sort Implementation and Analysis

## Introduction
This document presents an implementation of the Selection Sort algorithm in Java, along with a set of test cases to validate its correctness. The report also includes an analysis of the algorithm's time and space complexity, an assessment of its stability, and enhancements made to improve its behavior.

---

## Implementation
The Selection Sort algorithm sorts an array by repeatedly selecting the largest element from the unsorted portion and moving it to its correct position.

### **Code Implementation (Descending Order)**
```java
public class Main {
    public static void selectionSort(int[] array){
        int n = array.length;

        for(int i = 0; i < n; i++){
           int maxIdx = i;

           for(int j = i + 1; j < n; j++){
               if(array[j] > array[maxIdx]){
                   maxIdx = j;
               }
           }

           int k = array[maxIdx];
           while(maxIdx > i){
               array[maxIdx] = array[maxIdx - 1];
               maxIdx --;
           }
           array[i] = k;
        }
    }

    public static void display(int[] array){
        for(int i : array){
            System.out.print( i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[][] tests ={
       // A randomly generated array of integers.
                {9, 1, 4, 6, 3},
       // An array already sorted in ascending order
                {1, 2, 3, 4, 5, 6},
        //An array sorted in descending order.
                {6, 5, 4, 3, 2, 1},
       // An array with all elements being the same.
                {1, 1, 1, 1},
       // An empty array and an array with one element (edge cases).
                {5},
                {},
    };

        for(int i = 0; i < tests.length; i++){
            System.out.print(" Test case # " + (i + 1) + " : ");
            selectionSort(tests[i]);
            display(tests[i]);
        }
    }
}
```

---

## **Test Cases and Results**

| Test Case | Input Array | Expected Output | Observations |
|-----------|------------|----------------|--------------|
| 1 | {9, 1, 4, 6, 3} | {9, 6, 4, 3, 1} | Correctly sorted in descending order. |
| 2 | {1, 2, 3, 4, 5, 6} | {6, 5, 4, 3, 2, 1} | Reverse order successfully sorted. |
| 3 | {6, 5, 4, 3, 2, 1} | {6, 5, 4, 3, 2, 1} | Already sorted, remains unchanged. |
| 4 | {1, 1, 1, 1} | {1, 1, 1, 1} | Identical elements remain in the same order. |
| 5 | {} | {} | Empty array remains empty. |
| 6 | {5} | {5} | Single-element array remains unchanged. |

---

## **Time and Space Complexity Analysis**

### **Time Complexity:**
- **Best, Average, and Worst Case:** O(n²) due to the nested loops.
- The inner loop always runs (n-1) + (n-2) + ... + 1 times, resulting in approximately **n² / 2** comparisons.
- **Selection Sort does not adapt to an already sorted array.**

### **Space Complexity:**
- **O(1) (constant space)** since sorting happens in place with no extra memory allocation.

---

## **Stability Analysis and Enhancements**

### **Stability**
- Selection Sort is **not stable** because shifting elements can move identical elements out of their original order.
- Example: Sorting `{5, 3, 3', 2, 1}` could result in `{5, 3', 3, 2, 1}` instead of maintaining the original order of `3` and `3'`.

### **Modification for Ascending Order**
To sort in ascending order, we modify the condition:
```java
if (array[j] < array[minIdx]) {
    minIdx = j;
}
```

---

## **Final Observations**
1. **Selection Sort is simple but inefficient for large datasets** due to its O(n²) complexity.
2. **In-place sorting makes it memory-efficient (O(1) space).**
3. **It is unstable when swapping but can be made stable using shifting instead.**
4. **Sorting order (ascending/descending) is easily modified by changing the comparison condition.**

**Overall, Selection Sort is best suited for small datasets or when minimal memory usage is required.**

---


