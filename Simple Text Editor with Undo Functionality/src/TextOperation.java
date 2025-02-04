public class TextOperation {

    // Picking type of operation
    enum OperationType{ ADD, DELETE};

    // initialized constructor w variables
    private OperationType type;
    private char character; // text editor takes character

    // TO DO: Constructor to initialized type and char (parameter type & char)
    public TextOperation(OperationType type, char character){
        this.type = type;
        this.character = character;
    }

    // method to get type
    public OperationType getType(){
        return type;
    }

    // method to get character
    public char getCharacter(){
        return character;
    }

}

