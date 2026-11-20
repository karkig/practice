import java.util.*;

public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        List<Integer> current = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, used, current, result);
        return result;
    }

    private static void backtrack(int[] nums, boolean[] used,
                                  List<Integer> current,
                                  List<List<Integer>> result) {

        if (nums.length == current.size()) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (used[i]) continue;
            used[i] = true;
            current.add(nums[i]);
            backtrack(nums, used, current, result);
            current.remove(current.size() - 1);
            used[i] = false;

        }


    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3,4,5,6};
        List<List<Integer>> all = permute(nums);
        System.out.println("Count = " + all.size());   // Count = 6
        all.forEach(System.out::println);
    }
}
