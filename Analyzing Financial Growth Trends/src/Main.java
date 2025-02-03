import java.util.Arrays;

public class Main {

    public static int[] compute(int[] gP){
        if(gP.length == 0 || gP == null ){
            throw new IllegalArgumentException("Empty Array");
        }

        for(int j = 0; j < gP.length; j++){
            if(gP[j] != 0){
                gP[j] = gP[j] * gP[j];
            }
        }

        int[] result = new int[gP.length];
        int start = 0, end = gP.length - 1;
        int i = result.length - 1;

        while(start <= end){
            if(gP[start] > gP[end]){
                result[i--] = gP[start++];
            }else{
                result[i--] = gP[end--];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        try {
            int[] gp = new int[]{-5, -2, 0, 3, 10};
            System.out.println(Arrays.toString(compute(gp)));

            int[] gp1 = new int[]{2, 2, 2};
            System.out.println(Arrays.toString(compute(gp1)));

            int[] gp0 = new int[]{};
            System.out.println(Arrays.toString(compute(gp0)));
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}
