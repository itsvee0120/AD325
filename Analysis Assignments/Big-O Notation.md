# Analyzing Time and Space Complexity
## Instructions:
**Code Analysis:** 
Below are several code snippets in your chosen language (Python or Java). For each snippet, perform the following tasks:


> determine the time complexity, explaining your reasoning step by step.  
> determine the space complexity, providing a rationale for your analysis.  
> suggest any possible improvements to reduce the complexity, if applicable.  
> submission: submit a document containing your analysis and explanations.  
> include any code modifications you propose to improve the algorithm's efficiency.
---


## My Analysis
### Snippet 1:
````python
def find_max(numbers):
    max_num = numbers[0]
    for num in numbers:  
        if num > max_num:
            max_num = num
    return max_num
````

| **Metric**         | **Complexity** |
|---------------------|----------------|
| **Time Complexity** | O(n)          |
| **Space Complexity**| O(1)          |

### Reasoning:
1. **Time Complexity** is O(n) since the function iterates through the `numbers` list once and making a
comparison for each element.
2. **Space Complexity** is O(1), the function uses a constant amount of space because it only 
stores the `max_num` variable, this holds true regardless of the input size

### Optimize Code
The `find_max` function for this specific snippet is already very optimal. We could, however utilized
the python built-in `max` function to find the largest number.
```` python
def find_max(numbers):
   return max(numbers)
````

With this function, the time and spcae complexity would be:

| **Metric**         | **Complexity** |
|---------------------|----------------|
| **Time Complexity** | O(n)          |
| **Space Complexity**| O(1)          |
 ---
### Snippet 2:
````java
void printPairs(int[] array) {
    for (int i = 0; i < array.length; i++) {
        for (int j = i + 1; j < array.length; j++) {
            System.out.println(array[i] + ", " + array[j]);
        }
    }
}
````

| **Metric**         | **Complexity** |
|---------------------|----------------|
| **Time Complexity** | O(n²)
|
| **Space Complexity**| O(1)           |

### Reasoning:
1. **Time Complexity** is **O(n²)** because the function iterates through the `array` twice in
a nested for loop:
- The outer loop runs n times, where n is the length of the array.
- For each iteration of the outer loop, the inner loop runs `n - i - 1` times, which decreases as `i` increases.
- Because it's in a nested loop format, the formula for time complexity is `(n * (n - 1)) / 2` = `O(n²)`
2. **Space Complexity** is O(1), The space complexity is O(1) since the 
function uses a constant amount of extra space, regardless of the size of the input array.

### Optimize Code

### First Approach:
Set a pointer `j` at position 0; use 1 for loop to reduce the run time to `O(n)`, for loop has index `i`
at position `j + 1`, incremented `j` everytime `i` incremented:
```` java
void printPairs(int[] array) {
int j = 0;
    for (int i = j + 1; i < array.length; i++) {
       System.out.println(array[i] + ", " + array[j]);
       j++;
    }
}
````

| **Metric**         | **Complexity** |
|---------------------|----------------|
| **Time Complexity** | O(n)          |
| **Space Complexity**| O(1)          |


### **Explanation:**

- **Time Complexity** is O(n) because the function iterates through the array only once. 
The outer loop runs from i = 1 to n - 1, and for each iteration, a constant amount of
work is done (printing the pair and incrementing j).

- **Space Complexity** is O(1) because the function only uses a constant amount of space.
The only additional variable declared is int j, regardless of the input size.

- **Trade-off:** While the function requires an additional pointer j to track the second
element in each pair, this approach allows for a linear O(n) time complexity, making it
more efficient than a nested loop solution with O(n²) time complexity.
 ---
### Second Approach:

```java
void printPairs(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {  // Iterate through the array until the second-to-last element
        System.out.println(array[i] + ", " + array[i + 1]);  // Print pair of elements
    }
}
```


| **Metric**         | **Complexity** |
|---------------------|----------------|
| **Time Complexity** | O(n)           |
| **Space Complexity**| O(1)           |


### **Explanation:**

- **Time Complexity** is **O(n)** because the function iterates through the array once. 
The loop runs from `i = 0` to `n - 2` (to avoid out-of-bounds errors when accessing `i + 1`),
and for each iteration, it prints a pair of elements. Each iteration performs a constant amount of work.

- **Space Complexity** is **O(1)** because the function only uses a constant amount of space for 
the loop variables. No additional data structures are used, regardless of the input size.

- **Trade-off:** This approach has linear time complexity **O(n)** because it avoids the nested loops
that would result in **O(n²)** complexity. It’s more efficient in terms of runtime and uses only a 
constant amount of additional space.


 ---