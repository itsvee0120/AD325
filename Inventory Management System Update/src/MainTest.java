import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class MainTest {

    @Test
    public void testDuplicatesZ_case1() {
        // Test with an array containing zeros
        int[] inventory = new int[]{4, 0, 1, 3, 0, 2, 5, 0};
        Main.duplicatesZ(inventory);
        assertArrayEquals(new int[]{4,0,0,1,3,0,0,2}, inventory);
    }

    @Test
    public void testDuplicatesZ_case2() {
        // Test with an array containing no zeros
        int[] inventory = new int[]{3, 2, 1};
        Main.duplicatesZ(inventory);
        assertArrayEquals(new int[]{3, 2, 1}, inventory);
    }

    @Test
    public void testDuplicatesZ_case3() {
        // Test with an array containing only zeros
        int[] inventory = new int[]{0, 0, 0};
        Main.duplicatesZ(inventory);
        assertArrayEquals(new int[]{0, 0, 0}, inventory);
    }

    @Test
    public void testDuplicatesZ_case4() {
        // Test with an empty array
        int[] inventory = new int[]{};
        Main.duplicatesZ(inventory);
        assertArrayEquals(new int[]{}, inventory);
    }

    @Test
    public void testDuplicatesZ_case5() {
        // Test with array containing all zeros at the end
        int[] inventory = new int[]{1, 2, 3, 0, 0, 0};
        Main.duplicatesZ(inventory);
        assertArrayEquals(new int[]{1, 2, 3, 0, 0, 0}, inventory);
    }

    @Test
    public void testDuplicatesZ_case6() {
        // Test with array containing zeros in the middle
        int[] inventory = new int[]{1, 0, 2, 0, 3};
        Main.duplicatesZ(inventory);
        assertArrayEquals(new int[]{1, 0,  0, 2, 0}, inventory);
    }
}
