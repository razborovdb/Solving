package learn01.training.recursion.factorial;

public class Factorial {
    public static void main(String[] args) {
        //720
        System.out.println(solution(6));
    }
    public static int solution(int n) {
        if (n < 2) return 1;
        return n * solution(n-1);
    }
}
