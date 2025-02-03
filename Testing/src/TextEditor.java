import java.util.Stack;
import java.util.Scanner;

public class TextEditor {
    private String content; // Current content of the editor
    private Stack<String> undoStack; // Stack to hold undo actions
    private Stack<String> redoStack; // Stack to hold redo actions
    private Scanner scanner; // Scanner to read user input

    public TextEditor() {
        this.content = ""; // Initialize with empty content
        this.undoStack = new Stack<>();
        this.redoStack = new Stack<>();
        this.scanner = new Scanner(System.in);
    }

    // Set new content and push the current state to undo stack
    public void setContent(String newContent) {
        undoStack.push(this.content); // Save the current state for undo
        this.content = newContent; // Update the content
        redoStack.clear(); // Clear redo stack when a new change is made
    }

    // Add new content (append) to the current content
    public void addContent(String newText) {
        undoStack.push(this.content); // Save the current state for undo
        this.content += newText; // Append new text to the content
        redoStack.clear(); // Clear redo stack when a new change is made
    }

    // Undo the last change
    public void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(this.content); // Push the current state to redo stack
            this.content = undoStack.pop(); // Revert to the last state from undo stack
        } else {
            System.out.println("Nothing to undo.");
        }
    }

    // Redo the last undone change
    public void redo() {
        if (!redoStack.isEmpty()) {
            undoStack.push(this.content); // Push the current state to undo stack
            this.content = redoStack.pop(); // Restore the last undone state
        } else {
            System.out.println("Nothing to redo.");
        }
    }

    // Display current content
    public void displayContent() {
        System.out.println("Current Content: " + this.content);
    }

    // Get user input for the editor
    public String getUserInput() {
        System.out.println("Enter text to append to the content (type 'exit' to quit): ");
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        // Initial welcome message and instructions
        System.out.println("Welcome to the Text Editor!");
        editor.displayContent(); // Display initial empty content

        // Infinite loop to keep accepting user input until 'exit' is typed
        while (true) {
            // Get user input
            String input = editor.getUserInput();

            // Exit the loop if the user types 'exit'
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            // Add the input text to the content
            editor.addContent(input);
            editor.displayContent(); // Display updated content

            // Ask if the user wants to undo or redo
            System.out.println("Would you like to undo, redo, or continue adding text?");
            System.out.println("Enter 'undo' to undo, 'redo' to redo, or press Enter to continue:");
            String action = editor.scanner.nextLine();

            if (action.equalsIgnoreCase("undo")) {
                editor.undo();
                editor.displayContent(); // Display content after undo
            } else if (action.equalsIgnoreCase("redo")) {
                editor.redo();
                editor.displayContent(); // Display content after redo
            }
        }

        // Final message when user exits the editor
        System.out.println("Thank you for using the Text Editor!");
    }
}
