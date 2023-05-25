import java.util.Scanner;

public class App {

    public static boolean isPalindrome(int n) {

        String value = String.valueOf(n);

        StringBuilder reverseVal = new StringBuilder(value);

        return reverseVal.reverse().toString().equals(value);

    }


    public static boolean isPalindrome(String s) {

        String value = String.valueOf(s);

        StringBuilder reverseVal = new StringBuilder(value);

        return reverseVal.reverse().toString().equals(value);

    }

    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        int n = 1001;

        boolean result1 = isPalindrome(n);

        System.out.println(result1);

        String s = "1002";

        boolean result2 = isPalindrome(s);
        
        System.out.println(result2);
    }
}
