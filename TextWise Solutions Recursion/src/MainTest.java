import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest{

    @Test
    public void testReverse(){
        String original = "hello";
        String reversed ="olleh";
        assertEquals(reversed, Main.reverse(original));
    }

    @Test
    public void testReverseSingle(){
        String original = "a";
        String reversed ="a";
        assertEquals(reversed, Main.reverse(original));
    }

    @Test
    public void testReverseEmpty(){
        String original = "";
        String reversed ="";
        assertEquals(reversed, Main.reverse(original));
    }


    @Test
    public void testReversePalindrome(){
        String original = "madam";
        String reversed ="madam";
        assertEquals(reversed, Main.reverse(original));
    }

}