# TextWise Solutions: String Reversal Feature for ContentOptimizer

## Project Overview
TextWise Solutions is enhancing "ContentOptimizer," their flagship content analysis tool, by integrating a string reversal feature. This new capability is critical for developing advanced algorithms that analyze sentence structures and recommend stylistic improvements.

To achieve this, the feature is implemented using **recursion**, aligning with the company’s commitment to fostering technical excellence and innovative problem-solving approaches.

---

## Objectives
The implementation of the string reversal functionality serves multiple purposes:
1. **Educational Value**
    - Introduces and reinforces the understanding of recursive algorithms among team members and new hires.
    - Encourages the exploration of fundamental computer science concepts, fostering a culture of continuous learning.

2. **Code Readability and Maintainability**
    - Recursion offers a clean and elegant solution, ensuring that the implementation is both understandable and maintainable.

3. **Algorithmic Efficiency**
    - Recursive solutions can be an effective way to handle complex text processing tasks, especially those involving nested structures.

---

## Technical Requirements
The string reversal function adheres to the following guidelines:
- **Implementation**: The reversal must be implemented using recursion.
- **Functionality**: Handles edge cases, such as empty strings and single-character strings, ensuring robust behavior.

---

## Implementation
The project includes the following key components:

### 1. **Main Class**
Contains the `reverse` method, which uses recursion to reverse a string, and the `reverseHelper` method, a helper function for the recursive logic.

### 2. **Unit Tests**
JUnit tests validate the functionality of the string reversal feature, including handling edge cases such as empty strings, single-character strings, and palindromes.

---

## Code Snippet
### Main Class
```java
public class Main {

    public static String reverse(String s){
        if (s == null || s.length() <= 1) {
            return s;
        }
        char[] chars = s.toCharArray();
        reverseHelper(chars, 0, chars.length - 1);
        return new String(chars);
    }

    public static void reverseHelper(char[] chars, int start, int end){
        if (start >= end) {
            return;
        }
        char temp = chars[start];
        chars[start] = chars[end];
        chars[end] = temp;
        reverseHelper(chars, start + 1, end - 1);
    }
}
```  

### Unit Tests
```java
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testReverse(){
        assertEquals("olleh", Main.reverse("hello"));
    }

    @Test
    public void testReverseSingle(){
        assertEquals("a", Main.reverse("a"));
    }

    @Test
    public void testReverseEmpty(){
        assertEquals("", Main.reverse(""));
    }

    @Test
    public void testReversePalindrome(){
        assertEquals("madam", Main.reverse("madam"));
    }
}
```  

---

## How to Run
1. Clone the repository.
2. Compile and run the `Main` class to test the functionality manually.
3. Run the JUnit tests using your preferred IDE or build tool (e.g., IntelliJ IDEA, Eclipse, or Maven) to validate all test cases.

---

## Sample Output
```text
Original: hello  
Reversed: olleh  

Original: a  
Reversed: a  

Original:   
Reversed:   

Original: madam  
Reversed: madam  
```  

---

## Conclusion
This feature demonstrates the ability to apply recursive algorithms effectively in solving practical problems, reinforcing the team's technical expertise. By implementing the string reversal functionality, TextWise Solutions strengthens its ContentOptimizer tool, paving the way for advanced text manipulation capabilities.  