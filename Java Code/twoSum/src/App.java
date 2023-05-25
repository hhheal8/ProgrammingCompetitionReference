import java.util.Map;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

public class App {

    public static int[] twoSum(int[] vals, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < vals.length; ++i) {
            if(map.containsKey(target - vals[i])) {
                return new int[] {map.get(target - vals[i]), i};
            }
            map.put(vals[i], i);
        }

        return new int[] {-1, -1};


    }


    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        int[] vals = {2, 4, 9, 1, 5};

        System.out.print("Input target: ");
        int target = input.nextInt();

        int[] result = twoSum(vals, target);
        // System.out.println(Arrays.toString(result));

        for(int i = 0; i != result.length; ++i) {
            System.out.print("[" + result[i] + "]");
        }
        


    }
}
