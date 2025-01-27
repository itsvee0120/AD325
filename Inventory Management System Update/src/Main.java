import java.util.Arrays;

public class Main {

    public static void duplicatesZ(int[] inventory){
        int zeroes = 0;
        int len = inventory.length;

        // 1st for loop => zeroes count
        for(int i : inventory){
            if(i == 0){
                zeroes++;
            }
        }

        // 2nd for loop => computing
        for(int i = len - 1; i >= 0; i--){
            //1st check point => is i + z in bound
            if(i + zeroes < len){
                inventory[i + zeroes] = inventory[i];
            }

            //2nd check point => check for 0 at i
            if(inventory[i] == 0){
                zeroes--;

                //3rd checkpoint => check again if i + z is in bound
                if(i + zeroes < len){
                    inventory[i + zeroes] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] inventory1 = new int[]{4,0,1,3,0,2,5,0};
        duplicatesZ(inventory1);
        System.out.println(Arrays.toString(inventory1));

        int[] inventory2 = new int[]{3,2,1};
        duplicatesZ(inventory2);
        System.out.println(Arrays.toString(inventory2));

        int[] inventory0 = new int[]{0, 0, 0};
        duplicatesZ(inventory0);
        System.out.println(Arrays.toString(inventory0));

        int[] inventory = new int[]{};
        duplicatesZ(inventory);
        System.out.println(Arrays.toString(inventory));


    }
}