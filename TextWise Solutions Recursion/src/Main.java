public class Main {

    public static String reverse(String s){
        // Base Case
        if(s == null || s.length() <= 1){
            return s;
        }
        // Converting char Array
        char[] chars = s.toCharArray();
        // Call reverseHelper function
        reverseHelper(chars, 0, chars.length - 1);

        // Return string from chars array
        return new String(chars);

    }

    public static void reverseHelper(char[] chars, int start, int end){
        // Check the base case
        if(start >= end){
            return;
        }

        // Swap in-place 2 pointers
        char temp = chars[start];
        chars[start] = chars[end];
        chars[end] = temp;

        // Call helper function to decrement the end and increment start
        reverseHelper(chars, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String original = "hello";
        String reversed = reverse(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

        String original1 = "a";
        String reversed1 = reverse(original1);
        System.out.println("Original: " + original1);
        System.out.println("Reversed: " + reversed1);

        String original0 = "";
        String reversed0 = reverse(original0);
        System.out.println("Original: " + original0);
        System.out.println("Reversed: " + reversed0);

        String originalP = "madam";
        String reversedP = reverse(originalP);
        System.out.println("Original: " + originalP);
        System.out.println("Reversed: " + reversedP);


    }
}
