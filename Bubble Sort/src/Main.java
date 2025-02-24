public class Main {
    public static int[] bubbleSort(int[] array){
        int n = array.length;
        for(int i = 0; i < n; i++){
            boolean swapped = false;
            for(int j = 0; j < n - 1; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
           if(!swapped){
               break;
           }
        }
        return array;
    }

    public static void display(int[] array){
        for(int num : array){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Test Case 1: Random array of integers
        int[] arr1 = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original: ");
        display(arr1);
        System.out.println("Sorted: ");
        display(bubbleSort(arr1));

        // Test Case 2: Already sorted array in ascending order
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println("\nOriginal: ");
        display(arr2);
        System.out.println("Sorted: ");
        display(bubbleSort(arr2));

        // Test Case 3: Array sorted in descending order (worst-case scenario)
        int[] arr3 = {5, 4, 3, 2, 1};
        System.out.println("\nOriginal: ");
        display(arr3);
        System.out.println("Sorted: ");
        display(bubbleSort(arr3));

        // Test Case 4: Array where all elements are identical
        int[] arr4 = {7, 7, 7, 7, 7};
        System.out.println("\nOriginal: ");
        display(arr4);
        System.out.println("Sorted: ");
        display(bubbleSort(arr4));

        // Test Case 5: Edge case - empty array
        int[] arr5 = {};
        System.out.println("\nOriginal: ");
        display(arr5);
        System.out.println("Sorted: ");
        display(bubbleSort(arr5));

        // Test Case 6: Edge case - single-element array
        int[] arr6 = {10};
        System.out.println("\nOriginal: ");
        display(arr6);
        System.out.println("Sorted: ");
        display(bubbleSort(arr6));
    }
}