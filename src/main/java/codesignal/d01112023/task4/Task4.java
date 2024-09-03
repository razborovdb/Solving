package codesignal.d01112023.task4;

import java.util.HashMap;
import java.util.Map;

public class Task4 {
    static Map<Integer, Boolean> map = new HashMap<>();
    public static void main(String[] args) {
        // 4
        int[] nums = new int[] {-1, 18, 3, 1, 5};
        long startTime = System.currentTimeMillis();
        int result =  solution(nums);
        long endTime = System.currentTimeMillis();
        System.out.println("time = " + (endTime - startTime));
        System.out.println("result = " + result);
        System.out.println();

        // 6
        nums = new int[] {-2, -1, 0, 1, 2};
        startTime = System.currentTimeMillis();
        result =  solution(nums);
        endTime = System.currentTimeMillis();
        System.out.println("time = " + (endTime - startTime));
        System.out.println("result = " + result);
        System.out.println();

        //
        nums = new int[] {-2, -1, 0, 1, 2, -2, -1, 0, 1, 2, 500, 1234, 2345,4567,6543, -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, 500, 1234, 2345,4567,6543,
                -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, 500, 1234, 2345,4567,6543, -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, 500, 1234, 2345,4567,6543,
                -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, 500, 1234, 2345,4567,6543, -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, 500, 1234, 2345,4567,6543,
                -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, 500, 1234, 2345,4567,6543, -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, 500, 1234, 2345,4567,6543,
                -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, 500, 1234, 2345,4567,6543, -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, 500, 1234, 2345,4567,6543,
                -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, 500, 1234, 2345,4567,6543, -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, 500, 1234, 2345,4567,6543,
                -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, 500, 1234, 2345,4567,6543, -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, 500, 1234, 2345,4567,6543,
                -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, 500, 1234, 2345,4567,6543, -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, 500, 1234, 2345,4567,6543,
                -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, 500, 1234, 2345,4567,6543, -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, 500, 1234, 2345,4567,6543,
                -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, 500, 1234, 2345,4567,6543, -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, 500, 1234, 2345,4567,6543,
                -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, 500, 1234, 2345,4567,6543, -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, 500, 1234, 2345,4567,6543,
                -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, 500, 1234, 2345,4567,6543, -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, 500, 1234, 2345,4567,6543,
                -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, 500, 1234, 2345,4567,6543, -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, 500, 1234, 2345,4567,6543,
                -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, 500, 1234, 2345,4567,6543, -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, 500, 1234, 2345,4567,6543,
                -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, 500, 1234, 2345,4567,6543, -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, 500, 1234, 2345,4567,6543,
                -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, 500, 1234, 2345,4567,6543, -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, 500, 1234, 2345,4567,6543,
                -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, 500, 1234, 2345,4567,6543, -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, 500, 1234, 2345,4567,6543,
                -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, 500, 1234, 2345,4567,6543, -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, 500, 1234, 2345,4567,6543,
                -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, 500, 1234, 2345,4567,6543, -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, 500, 1234, 2345,4567,6543,
                -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, 500, 1234, 2345,4567,6543, -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, 500, 1234, 2345,4567,6543,
                -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, 500, 1234, 2345,4567,6543, -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, 500, 1234, 2345,4567,6543
        };
        startTime = System.currentTimeMillis();
        result =  solution(nums);
        endTime = System.currentTimeMillis();
        System.out.println("time = " + (endTime - startTime));
        System.out.println("result = " + result);
        System.out.println();

    }
    static int solution(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j=i; j < nums.length; j++) {
                if (check(nums[i]+nums[j])) {
                    result++;
                }
            }
        }

        return result;
    }

    static boolean check(int num) {
        if (num < 0) return false;
        //if (map.containsKey(num)) return map.get(num);
        int sqr = (int) Math.sqrt(num);
        if (sqr * sqr == num) {
            //map.put(num, true);
            return true;
        }
        //map.put(num, false);
        return false;
    }
}