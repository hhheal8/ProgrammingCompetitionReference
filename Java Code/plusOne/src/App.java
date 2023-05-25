import java.util.Arrays;

public class App {

    public static int[] plusOne(int[] digits) {

        for(int i = digits.length - 1; i >= 0; --i) {
            if(digits[i] < 9) {
                ++digits[i];
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;

        return digits;

    }

    public static void main(String[] args) throws Exception {
        int[] digits = new int[] { 4, 3, 2, 1 };
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
