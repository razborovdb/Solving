package amazon2.combinations;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

    // previous solve
//    public static List<List<Integer>> combine(int n, int k) {
//        List<List<Integer>> result = new ArrayList<>();
//        permutation(n, k, 1, new ArrayList<>(), result);
//        return result;
//    }
//
//    public static void permutation(int n, int k, int index, List<Integer> current, List<List<Integer>> result) {
//        if (k == current.size()) {
//            result.add(new ArrayList<>(current));
//            return;
//        }
//        for (int i = index; i <= n; i++) {
//            current.add(i);
//            permutation(n, k, i+1, current, result);
//            current.remove(current.size() - 1);
//        }
//    }


    public static void main(String[] args) {
        // [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]

        List<List<Integer>> result = combine(4, 2);

        for (List<Integer> list: result) {
            for(int i : list) {
                System.out.print(i + "; ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        permutation(result, new ArrayList<Integer>(), 1, n, k);
        return result;
    }

    public static void permutation(List<List<Integer>> result, List<Integer> cur, int start, int n, int k) {
        if (cur.size() == k) {
            result.add(new ArrayList<>(cur));
            return;
        }
        for (int i = start; i <= n; i++) {
            cur.add(i);
            permutation(result, cur, i+1, n, k);
            cur.remove(cur.size() - 1);
        }
    }
}
