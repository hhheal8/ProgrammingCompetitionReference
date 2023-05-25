public class App {

    public static boolean validPalindrome(String val) {

        if(val.isEmpty()) {
            return false;
        }

        int start = 0;
        int last = val.length() - 1;

        while(start <= last) {

            char currFirst = val.charAt(start);
            char currLast = val.charAt(last);

            if(!Character.isLetterOrDigit(currFirst)) {
                ++start;
            }
            else if(!Character.isLetterOrDigit(currLast)) {
                --last;
            }
            else {
                if(Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                ++start;
                --last;
            }

        }

        return true;

    }

    public static void main(String[] args) throws Exception {
        System.out.println(validPalindrome("tapat"));
    }
}
