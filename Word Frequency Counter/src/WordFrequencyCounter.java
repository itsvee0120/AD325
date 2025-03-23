import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> wordCountMap = new HashMap<>();

        System.out.println("Enter a sentence(type 'exit' to finish input):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            input = input.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", "");
            String[] words = input.split("\\s+");

            for (String word : words) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }
        scanner.close();

        TreeMap<String, Integer> sortedMap = new TreeMap<>(wordCountMap);

        System.out.println("\nWord Frequency");
        for(Map.Entry<String, Integer> entry : sortedMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}