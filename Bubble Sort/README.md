# Time Complexity Analysis of Bubble Sort:

### Worst-Case and Average-Case Complexity (O(n²)):

1. **Inner Loop Analysis**:
    - The **inner loop** of Bubble Sort compares adjacent elements and swaps them if they are out of order. On each pass of the outer loop, the largest unsorted element "bubbles up" to its correct position at the end of the array.
    - In the **worst-case scenario** (when the array is sorted in reverse order), the algorithm must compare and swap adjacent elements throughout the entire array. This results in the **inner loop** running approximately `n` times for each pass of the **outer loop**.

2. **Outer Loop Analysis**:
    - The **outer loop** iterates `n` times, where `n` is the size of the array.
    - During each pass, the range of elements to be compared decreases because the last `i` elements are already sorted and in their correct position.

3. **Comparisons and Swaps**:
    - In each pass, the **inner loop** performs about `n - i - 1` comparisons, where `i` is the current pass number (starting from 0).
    - For the **worst-case** (array in reverse order), every pass involves maximum comparisons and swaps. This results in roughly `n + (n-1) + (n-2) + ... + 1`, which sums to `(n(n-1))/2`, or **O(n²)** comparisons and swaps.

4. **Best-Case Scenario**:
    - In the **best-case scenario** (already sorted array), the optimized Bubble Sort terminates early due to the `swapped` flag. If no swaps are made in a complete pass, the algorithm exits early.
    - Without optimization, Bubble Sort would still perform `n(n-1)/2` comparisons, resulting in **O(n²)** time complexity even in the best case.

5. **Average-Case Scenario**:
    - On average, Bubble Sort will also perform **O(n²)** comparisons and swaps, as it will often require multiple passes through the array to bring all elements into their correct positions, with a mix of swaps on each pass.

Thus, **Bubble Sort** is typically **O(n²)** in both the average and worst-case scenarios due to the nested loops where each element is compared with all other elements.

---

### Space Complexity Analysis:

- **In-Place Sorting**:
    - Bubble Sort is an **in-place sorting algorithm**, meaning that it does not require additional memory or storage proportional to the size of the input array. It only uses a constant amount of extra space for variables like `swapped` and `temp` used during swaps.

- **Space Complexity**:
    - The space complexity of Bubble Sort is **O(1)** because it sorts the array by modifying it directly, without using any additional data structures. The only extra memory used is for the temporary variable needed for swapping elements, which does not depend on the size of the input array.

---

### Stability of Bubble Sort:

1. **Definition of Stability**:
    - A sorting algorithm is **stable** if it preserves the relative order of equal elements (i.e., if two elements are equal, their relative order in the sorted array remains unchanged from the original array).

2. **Stability of Bubble Sort**:
    - Bubble Sort is **stable** because it only swaps adjacent elements when they are out of order. If two elements are equal, they will not be swapped, meaning their relative order is preserved.

   For example, if we have an array `[(2, 'a'), (2, 'b')]`, the relative order of `2, 'a'` and `2, 'b'` will remain the same after sorting, as Bubble Sort does not swap them due to their equality.

3. **Why It's Stable**:
    - The algorithm works by comparing adjacent pairs of elements and swapping them only when they are out of order. When two elements are equal, the comparison `arr[j] > arr[j + 1]` will fail, and they will remain in the same order.

Thus, Bubble Sort maintains the stability of equal elements, ensuring that the original relative ordering is retained.

---

### Summary:

- **Time Complexity**:
    - **Best-case**: O(n) (with optimization).
    - **Worst-case and Average-case**: O(n²) due to nested comparisons and swaps.

- **Space Complexity**: O(1), as Bubble Sort operates in-place and uses constant extra space.

- **Stability**: Bubble Sort is a **stable sorting algorithm** because it maintains the relative order of equal elements.

In conclusion, while Bubble Sort has the advantage of being simple and stable, its **O(n²)** time complexity makes it inefficient for large datasets compared to more advanced algorithms like Merge Sort or Quick Sort, which typically have time complexities of **O(n log n)**.