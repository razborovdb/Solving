package learn01.training.interviewquestions.missingnumber;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {
        int[] array = new int[] {3,4,5,6,7,8,10,9,1};

        System.out.println(missingNumbers(array));
    }

    public static int missingNumbers(int[] nums) {
        return (nums.length+1) * (nums.length+2) / 2 - Arrays.stream(nums).sum();
    }
}
