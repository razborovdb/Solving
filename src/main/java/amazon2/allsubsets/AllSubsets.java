package amazon2.allsubsets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class AllSubsets {
     public static void get_all_subsets(List<List<Integer>> result, List<Integer> cur, Integer[] vals, int start) {
         result.add(cur);
         for (int i = start; i < vals.length; i++) {
             cur.add(vals[i]);
             get_all_subsets(result, new ArrayList<>(cur), vals, i+1);
             cur.remove(cur.size()-1);
         }
     }
    public static void main(String[] args) {
        Integer[] myints = new Integer[] {8,13,3};

        List<List<Integer>> result = new ArrayList<>();

        get_all_subsets(result, new ArrayList<Integer>(), myints, 0);


        for (List<Integer> l: result) {

            for(int i: l) {
                System.out.print(" " + i);
            }
            System.out.println();
        }
    }
}
