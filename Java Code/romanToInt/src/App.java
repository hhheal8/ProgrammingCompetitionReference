import java.util.HashMap;
import java.util.Map;

public class App {

    public static String intToRoman(int number) {

        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] thousands = {"", "M", "MM", "MMM"};

        return thousands[number / 1000] + hundreds[(number % 1000) / 100] + tens[(number % 100) / 10] + ones[number % 10];

    }

    public static int romanToInt(String romanNumerals) {

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = map.get(romanNumerals.charAt(romanNumerals.length() - 1));

        for(int i = romanNumerals.length() - 2; i >= 0; --i) {

            if(map.get(romanNumerals.charAt(i)) < map.get(romanNumerals.charAt(i + 1))) {
                result -= map.get(romanNumerals.charAt(i));
            }
            else {
                result += map.get(romanNumerals.charAt(i));
            }

        }

        return result;


    }

    public static void main(String[] args) throws Exception {
        System.out.println(intToRoman(2023));
        System.out.println(romanToInt("MMXXIII"));
    }
    
}
