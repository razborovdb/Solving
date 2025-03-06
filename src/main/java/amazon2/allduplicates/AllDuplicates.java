package amazon2.allduplicates;

import java.util.*;

public class AllDuplicates {
    public static void main(String[] args) {
        int[] nums = new int[] {4,3,2,7,8,2,3,1};

        List<Integer> list = findDuplicates(nums);

        for (int i : list) {
            System.out.print(i + ", ");
        }
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i] < 0 ? -nums[i] : nums[i];
            if (nums[n-1] < 0) {
                result.add(n);
            } else {
                nums[n - 1] = -nums[n - 1];
            }
        }
        return result;
    }
}
