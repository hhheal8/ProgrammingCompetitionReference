
public class App {

    public static int singleNumber(int[] vals) {

        int answer = 0;

        for(int i = 0; i < vals.length; ++i) {
            answer = answer ^ vals[i];
        }

        return answer;

    }

    public static void main(String[] args) throws Exception {
        int[] vals = new int[] {1, 2, 2, 4, 1, 4, 7, 8, 8};
        System.out.println(singleNumber(vals));
    }
}
