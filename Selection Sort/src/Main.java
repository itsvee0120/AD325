public class Main {
    public static void selectionSort(int[] array){
        int n = array.length;

        for(int i = 0; i < n; i++){
           int maxIdx = i;

           for(int j = i + 1; j < n; j++){
               if(array[j] > array[maxIdx]){
                   maxIdx = j;
               }
           }

        int k = array[maxIdx];
           while(maxIdx > i){
               array[maxIdx] = array[maxIdx - 1];
               maxIdx --;
           }
           array[i] = k;
        }

    }

    public static void display(int[] array){
        for(int i : array){
            System.out.print( i + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        int[][] tests ={

       // A randomly generated array of integers.
                {9, 1, 4, 6, 3},
       // An array already sorted in ascending order
                {1, 2, 3, 4, 5, 6},
        //An array sorted in descending order.
                {6, 5, 4, 3, 2, 1},
       // An array with all elements being the same.
                {1, 1, 1, 1},
       // An empty array and an array with one element (edge cases).
                {5},
                {},
    };

        for(int i = 0; i < tests.length; i++){
            System.out.print(" Test case # " + (i + 1) + " : ");
            selectionSort(tests[i]);
            display(tests[i]);
        }

    }
}