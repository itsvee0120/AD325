# Text Editor

## Overview

This is a simple text editor implemented in Java. It allows users to perform basic text operations such as adding characters, deleting the last character, and undoing the last operation. The program operates through a command-line interface, where users can input commands to manipulate text.

## Features

- **Add Text**: Append a single character to the text.
- **Delete Text**: Remove the last character from the text.
- **Undo**: Revert the last operation (either an addition or deletion).
- **Display**: Show the current state of the text after every operation.
- **User Input**: Accept commands from the terminal to perform operations.

## How It Works

The program maintains a `StringBuilder` to store the current text and a `Stack<TextOperation>` to track operations for undo functionality.

### **TextOperation Class**

The `TextOperation` class represents an operation performed on the text. It contains:

- `OperationType` (ADD or DELETE)
- The character involved in the operation

### **TextEditor Class**

This class provides the main functionality:

- `addText(char character)`: Adds a character and records the operation.
- `deleteText()`: Deletes the last character and records the operation.
- `undoText()`: Undoes the last recorded operation.
- `display()`: Prints the current text.
- `startEditor()`: Starts an interactive loop where users can enter commands.

## Commands

- **`add <char>`** → Adds the specified character to the text.
- **`delete`** → Deletes the last character.
- **`undo`** → Undoes the last operation.
- **`exit`** → Exits the program.

## Usage

1. Compile and run the program.
2. Enter commands in the terminal.
3. Observe the changes to the text.

### **Example Session**

```
 Simple Text Editor
Command list: add <char>, delete, undo, exit.
 >> add H
Current text: H
 >> add i
Current text: Hi
 >> delete
Current text: H
 >> undo
Current text: Hi
 >> exit
Program will exit!
```

## Requirements

- Java Development Kit (JDK) installed
- Basic knowledge of Java and command-line usage

## How to Run

1. Clone the repo.
2. Open a terminal and navigate to the file location.
3. Compile the program:
   ```
   javac Main.java
   ```
4. Run the program:
   ```
   java Main
   ```
5. Enter commands as prompted.

## Future Improvements

- Implement redo functionality.
- Allow multi-character text input.
- Save and load text from a file.

This text editor provides a simple introduction to handling user input, stacks for undo functionality, and interactive terminal applications in Java.

