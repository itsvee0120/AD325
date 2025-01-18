import java.util.Set;
import java.util.HashSet;

public class Main {

    public static int counting(String[] animals){
        if(animals == null || animals.length == 0){
            throw new IllegalArgumentException("Animals array is empty");
        }

        int count = 0;
        Set <String> checker = new HashSet<>();
        checker.add("lion");
        checker.add("deer");
        checker.add("elephant");
        checker.add("horse");
        checker.add("dog");
        checker.add("cat");

        for(String animal : animals){
            if(checker.contains(animal)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        try{

            String[] animals1 = new String[]{"lion", "monkey", "deer", "snake"};
            System.out.println("Counts = " + counting(animals1));

            String[] animals0 = new String[]{};
            System.out.println("Counts = " + counting(animals0));


        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }



    }
}

