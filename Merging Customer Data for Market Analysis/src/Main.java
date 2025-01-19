import java.util.Arrays;

public class Main {

    public static int[] merging(int[] customerData1, int[] customerData2, int m, int n){

        int i =  m -1;
        int j = n -1;
        int f = (m + n) -1;

        while(i >= 0 && j >= 0){
            if(customerData1[i] > customerData2[j]){
                customerData1[f--] = customerData1[i--];
            } else{
                customerData1[f--] = customerData2[j--];
            }
        }

        while(j >= 0){
            customerData1[f--] = customerData2[j--];
        }

        return customerData1;
    }

    public static void main(String[] args) {

        int[] customerData1 = new int[]{101,104,107,0,0};
        int m = 3;
        int[] customerData2 = new int[]{102,105};
        int n = 2;

        System.out.println("Final Array: "+ Arrays.toString(merging(customerData1, customerData2,  m,  n)));


        int[] customerData3 = new int[]{103};
        int m1 = 1;
        int[] customerData4 = new int[]{};
        int n1 = 0;

        System.out.println("Final Array: "+ Arrays.toString(merging(customerData3, customerData4,  m1,  n1)));
    }
}