package amazon2.combinationsum;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

// previous solve
//    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
//        List<List<Integer>> result = new ArrayList<>();
//        permutation(0, candidates, target, new ArrayList<Integer>(), result);
//        return result;
//    }
//    public static void permutation(int index, int[] candidates, int target, List<Integer> current, List<List<Integer>> result) {
//        if (target < 0) return;
//        if (target == 0) {
//            result.add(new ArrayList<>(current));
//            return;
//        }
//        for (int i = index; i < candidates.length; i++) {
//            current.add(candidates[i]);
//            permutation(i, candidates, target - candidates[i], current, result);
//            current.remove(current.size() - 1);
//        }
//    }

    public static void main(String[] args) {
        // [[2,2,3],[7]]
        int candidates[] = {2,3,6,7};
        List<List<Integer>> result = combinationSum(candidates, 7);

        for (List<Integer> list: result) {
            for(int i : list) {
                System.out.print(i + "; ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        permutation(result, new ArrayList<Integer>(), candidates, 0, target);
        return result;
    }

    public static void permutation(List<List<Integer>> result, List<Integer> cur, int[] candidates, int start, int target) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            result.add(new ArrayList<>(cur));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            cur.add(candidates[i]);
            permutation(result, cur, candidates, i, target - candidates[i]);
            cur.remove(cur.size() - 1);
        }
    }


}
