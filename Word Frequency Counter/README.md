# Word Frequency Counter

## Description
This Java program reads a block of text from the user and calculates the frequency of each word using a HashMap. The output is sorted alphabetically using a TreeMap.

## Features
- Reads multiple lines of input until the user types `exit`.
- Converts all words to lowercase for case-insensitive processing.
- Removes common punctuation marks.
- Uses a `HashMap` to store word frequencies.
- Uses a `TreeMap` to sort words alphabetically before printing.

## How to Use
1. Run the program.
2. Enter text lines in the console.
3. Type `exit` to finish input.
4. View the word frequency count displayed in sorted order.

## Example Input
```
Hello world! This is a test.
Hello again, world.
exit
```

## Example Output
```
Word: Frequency
again: 1
hello: 2
a: 1
is: 1
test: 1
this: 1
world: 2
```

## Complexity Analysis
- **Time Complexity:**
    - Processing input and splitting words: **O(n)**, where `n` is the number of characters in the input.
    - Inserting words into HashMap: **O(m)**, where `m` is the number of unique words.
    - Sorting words using TreeMap: **O(m log m)**.
    - Overall: **O(n + m log m)**.

- **Space Complexity:**
    - Storing words in HashMap: **O(m)**.
    - Storing words in TreeMap: **O(m)**.
    - Overall: **O(m)**.

