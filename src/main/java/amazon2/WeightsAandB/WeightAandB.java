package amazon2.WeightsAandB;

import java.util.*;

public class WeightAandB {
    public static List<Integer> maxResult = new ArrayList<>();
    public static Integer maxSum = 0;

    public static void main(String[] args) {
//        Integer[] arr = {1, 1, 1, 1, 4, 4, 4, 7, 8};
        // output = [4,4,4,8]; which has sum 20
        Integer[] arr = {1, 1, 1, 1, 4, 4, 4, 7, 8};
        int[][] ans = solve (arr);
        //System.out.println(Arrays.deepToString(ans));

        List<Integer> list = mySolve(arr);
        System.out.println(list);
    }

    public static List<Integer> mySolve(Integer[] arr) {
        int sum = 0;
        for(int i: arr) {
            sum += i;
        }
        for (int i = 0; i < arr.length;i++) {
            int index = i;
            int max = arr[i];
            for (int j = i+1; j < arr.length;j++) {
                if(arr[j] > max) {
                    max = arr[j];
                    index = j;
                }
            }
            arr[index] = arr[i];
            arr[i] = max;
        }
        int target = sum / 2 + 1;

        int actualSum = 0;
        for(int i = 0; i < arr.length; i++) {

            mySolveRecursion(new ArrayList<>(), arr, i, 0, target);

        }
        return maxResult;
    }

    public static void mySolveRecursion(List<Integer> curResult, Integer[] arr, int index, int actualSum, int targetSum) {
        if (actualSum > targetSum) {

            if (actualSum > maxSum) {
                //System.out.println("maxSum = " + maxSum );
                //System.out.println("actualSum = " + actualSum );
                maxSum = actualSum;
                maxResult= new ArrayList<>(curResult);

                //System.out.println("size = " + maxResult.size());
            }
            return;
        }
        if (index >= arr.length ) {
            return;
        }
        curResult.add(arr[index]);
        actualSum += arr[index];
        for (int i = index+1; i < arr.length; i++) {
            mySolveRecursion(new ArrayList<>(curResult), arr, i, actualSum,targetSum);
        }
    }

    public static int[][] solve (Integer[] arr) {
        int sum = Arrays.stream(arr).mapToInt(o->o).sum();
        int target = sum / 2;
        TreeMap<Integer, Integer> sortedMap = new TreeMap<>();
        for (int tmp : arr) {
            sortedMap.put(tmp, sortedMap.getOrDefault(tmp, 0) + 1);
        }

        int i = 0;
        Pair[] pair = new Pair[sortedMap.size()];
        for (Map.Entry<Integer, Integer> tmp : sortedMap.entrySet()) {
            pair[i] = new Pair (tmp.getKey(), tmp.getValue());
            i++;
        }

        int n = sortedMap.size() - 1;
        List<Integer> list = new ArrayList<>();
        List<Pair1> result = new ArrayList<>();
        int[][] dp = new int[n][sum + 1];
        Pair1 ans = solve (n, 0, target + 1, list, pair, result);
        //System.out.println(result.get(0));

        int[] ls = new int[result.get(0).list.size()];
        for (int j = 0; j < result.get(0).list.size(); j++) {
            ls[j] = result.get(0).list.get(j);
        }

        int[][] newAns = new int[1][ls.length];
        newAns[0] = ls;
        return newAns;
    }

    public static Pair1 solve (int index, int target, int actualTarget, List<Integer> list, Pair[] pair, List<Pair1> result) {

        if (target >= actualTarget) {
            if (result.isEmpty()) {
                result.add(new Pair1 (target, list.size(), new ArrayList<>(list)));
                return new Pair1 (target, list.size(), new ArrayList<>(list));
            } else {
                Pair1 p = new Pair1 (target, list.size(), new ArrayList<>(list));
                if (p.count < result.get(0).count && p.sum >= actualTarget) {
                    result.set(0, p);
                    return p;
                } return result.get(0);
            }
        }

        if (index == 0) {
            int sum = list.stream().mapToInt(o->o).sum() + (pair[0].key * pair[0].count);
            int count = list.size() + pair[0].count;
            List<Integer> newList = new ArrayList<>(list);
            for (int i = 0; i < pair[0].count; i++) {
                newList.add(pair[0].key);
            }

            if (result.isEmpty()) {
                if (sum >= actualTarget) {
                    result.add(new Pair1 (sum, count, newList));
                    return new Pair1 (sum, count, newList);
                }
            } else {
                Pair1 p = new Pair1 (sum, count, new ArrayList<>(newList));
                if (p.count < result.get(0).count && p.sum >= actualTarget) {
                    result.set(0, p);
                    return p;
                } return result.get(0);
            }
        }

        for (int i = 0; i < pair[index].count; i++) {
            list.add(pair[index].key);
        }
        Pair1 take = solve (index - 1, target + (pair[index].key * pair[index].count), actualTarget, list, pair, result);
        for (int i = 0; i < pair[index].count; i++) {
            list.remove(list.size() - 1);
        }
        Pair1 notTake = solve (index - 1, target, actualTarget, list, pair, result);

        return (take.count == notTake.count && take.sum >= notTake.sum) ? take : notTake;
    }

    static class Pair1 {
        int sum, count;
        List<Integer> list;
        public Pair1 (int sum, int count, List<Integer> list) {
            this.sum = sum;
            this.count = count;
            this.list = list;
        }
    }

    static class Pair {
        int key, count;
        public Pair (int key, int count) {
            this.key = key;
            this.count = count;
        }
    }
}
