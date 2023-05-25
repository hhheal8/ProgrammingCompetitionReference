import java.util.Arrays;

public class App {

    public static String longestCommonPrefix(String[] vals) {

        StringBuilder answer = new StringBuilder();

        Arrays.sort(vals);

        String first = vals[0];
        String last = vals[vals.length - 1];

        for(int i = 0; i < Math.min(first.length(), last.length()); ++i) {

            if(first.charAt(i) != last.charAt(i)) {
                return answer.toString();
            }
            answer.append(first.charAt(i));

        }

        return answer.toString();

    }

    public static void main(String[] args) throws Exception {
        
        String[] vals = new String[] { "flower", "flight", "flown" };

        System.out.println(longestCommonPrefix(vals));

    }
}
