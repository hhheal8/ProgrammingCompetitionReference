import java.util.Arrays;

public class App {

    // difference of n - 21 and if n is greater than 21, return the double of absolute of n - 21 
    // expected output:
    // diff21(19) → 2
    // diff21(21) → 0
    // diff21(22) → 2
    // diff21(25) → 8

    public static int diff21(int n) {
        return n > 21 ? 2 * Math.abs(n - 21) : 21 - n;
    }

    public static void main(String[] args) throws Exception {
    
        System.out.println(diff21(19));
        System.out.println(diff21(21));
        System.out.println(diff21(22));
        System.out.println(diff21(25));

    }
}
