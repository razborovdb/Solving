package amazon2.subsets;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        // [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
        int arr[] = {1,2,3};
        List<List<Integer>> result = new ArrayList<>();
        subsets(result, new ArrayList<Integer>(), arr, 0);

        for (List<Integer> list: result) {
            for(int i : list) {
                System.out.print(i + "; ");
            }
            System.out.println();
        }
    }

    public static void subsets(List<List<Integer>> result, List<Integer> cur, int[] arr, int start) {
        result.add(cur);
        for (int i = start; i < arr.length; i++) {
            cur.add(arr[i]);
            subsets(result, new ArrayList<>(cur), arr,i+1);
            cur.remove(cur.size() - 1);
        }
    }


}
