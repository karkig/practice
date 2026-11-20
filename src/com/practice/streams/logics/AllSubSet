import java.util.ArrayList;
import java.util.List;

public class AllSubSet {
    public static List<List<Integer>> suset(int[] nums) {
        List<Integer> current = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, current, result);
        return result;
    }

    private static void backtrack(int[] nums, int start ,
                                  List<Integer> current,
                                  List<List<Integer>> result) {

        result.add(new ArrayList<>(current));

        for (int i = start; i < nums.length; i++) {

            current.add(nums[i]);
            backtrack(nums, i+1, current, result);
            current.remove(current.size() - 1);
        }


    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> all = suset(nums);
        System.out.println("Count = " + all.size());   // Count = 6
        all.forEach(System.out::println);
    }
}
