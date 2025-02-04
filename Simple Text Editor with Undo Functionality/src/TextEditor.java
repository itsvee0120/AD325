import java.util.Scanner;
import java.util.Stack;

public class TextEditor {

    /* TODO: declare a String Builder call text to add text declare Stack<TextOperation> undoStack;*/
    private StringBuilder text;
    private Stack<TextOperation> undoStack;

    // Constructor to initialized variables
    public TextEditor() {
        this.text = new StringBuilder();
        this.undoStack = new Stack<>();
    }

    /* TODO: make a public method add text (using append to add to the last index in char array) */
    public void addText(char character) {
        // append
        text.append(character);
        // undoStack.push(type, char)
        undoStack.push(new TextOperation(TextOperation.OperationType.ADD, character));

        display();
    }


    /* TODO: Delete function */
    public void deleteText() {
        // check length of text => if 0 => mess: nothing to delete
        if (text.length() > 0) {
            // store delete candidate char character = text.charAt(text.length() - 1)
            char character = text.charAt(text.length() - 1);
            // text.deleteCharAt(text.length() - 1)
            text.deleteCharAt(text.length() - 1);

            // use temp, undoStack.push(type (Delete), character)
            undoStack.push(new TextOperation(TextOperation.OperationType.DELETE, character));

            display();
        } else {
            System.out.println("Nothing to delete.");
        }
    }


    /* TODO: Undo */
    public void undoText() {
        //check if the undo stack id empty =>? if it is -> message: nothing to undo
        if (!undoStack.isEmpty()) {
            //  create variable lastOperation from type TextOperation = undoStack.pop();
            TextOperation lastOperation = undoStack.pop();
            // if method check type operation => if ADD then deleteCharAt(text.length() -1)
            if (lastOperation.getType() == TextOperation.OperationType.ADD) {
                text.deleteCharAt(text.length() - 1);
            } else if (lastOperation.getType() == TextOperation.OperationType.DELETE) {
                //else if type = DELETE => append (lastOperation.getCharacter)
                text.append(lastOperation.getCharacter());
            }
            display();
        }
        else {
            // else => message nothing to undo
            System.out.println("Nothing to undo.");
        }
    }

    /*TODO: diplay() */
    public void display() {
        System.out.println("Current text: " + text);
    }


    /*TODO: terminal inout for user*/
    public void startEditor() {
        //declare Scanner to get keyboard input System.in
        Scanner scanner = new Scanner(System.in);
        // declare String command
        String command;

        // Title of the text Editor
        System.out.println(" Simple Text Editor ");
        // Command list (add <char>, delete, undo, exit
        System.out.println("Command list: add <char>, delete, undo, exit.");

        while (true) {
            //Mark where the user can input command
            System.out.print(" >> ");
            // initiate scanner.trim();
            command = scanner.nextLine().trim();

            if (command.startsWith("add ")) {
                // check if command.length() == 5 => addText(command.charAt(4))
                if (command.length() == 5) {
                    addText((command.charAt(4)));
                }  // else command does nor start with add  => message Invalid input
                else {
                    System.out.println("Invalid input.");
                }
            }
            //else if(command.equals("delete")
            else if (command.equals("delete")) {
                deleteText();
            }
            // else if (command.equals("undo")
            else if (command.equals("undo")) {
                undoText();
            }
            //else if(command.equals("exit")
            else if (command.equals("exit")) {
                // tell the user the program will stop running
                System.out.println("Program will exit!");
                break;
            } else {
                System.out.println("Unknown command. Use the command list!");
            }
        }

    }
}