import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++ ){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void testInsertionSort(){
        int[][] testCases = {
            {3, 1, 4, 1, 5, 9, 2, 6, 5, 3},
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
            {9, 8, 7, 6, 5, 4, 3, 2, 1, 0},
            {1, 2, 3, 4, 5, 6, 7, 8, 0, 9}
        };

        for( int[] arr : testCases){
            int[] sortedArray = arr.clone();
            insertionSort(sortedArray);
            System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
            Arrays.sort(arr);
            assert Arrays.equals(sortedArray, arr) : "test failed for input: " + Arrays.toString(arr);

        }
        System.out.println("Test cases passed!");
    }

    public static void analysis(){
        int size = 1000;

        int[] sorted = new int[size];
        for(int i = 0; i < size; i++){
           sorted[i] = i;
        }


        int[] reveredArray = new int[size];
        for(int i = 0; i < size; i++){
            reveredArray[i] = size - i;
        }

        int[] randomArray = new int[size];
        for (int i = 0; i < size; i++){
            randomArray[i] = (int) (Math.random() * size);
        }

        String[] types = {"Sorted", "Reversed", "Random"};
        int index = 0;

        for(int[] arr : new int[][] {sorted, reveredArray, randomArray}){
            long startTime = System.nanoTime();
            insertionSort(arr.clone());
            long elapsedTime = System.nanoTime() - startTime;
            System.out.println( "Types: " + types[index++] + ", " + "Time Run: " + elapsedTime );
        }
    }

    static class Pair{
        int key;
        char value;

        Pair(int key, char value){
            this.key = key;
            this.value = value;
        }

        public String toString(){
            return ("( " + key + ", " + value + " )");
        }
    }

    public static void pairSort(Pair[] arr){
        for(int i = 1; i < arr.length; i++){
            Pair key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j].key > key.key){
                arr[j + 1] = arr[j];
                j--;
            }
        arr[j + 1]  = key;
        }
    }

    public static void testPair(){
        Pair[] arr = {
                new Pair(9, 'c'),
                new Pair(1, 'b'),
                new Pair(4, 'd'),
                new Pair(1, 'e'),
        };
        pairSort(arr);
        System.out.println("Stable: " + Arrays.toString(arr));
    }

    public static void main(String[] args){
        testInsertionSort();
        analysis();
        testPair();
    }
}