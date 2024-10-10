package learn01.training.interviewquestions.factorial;

public class Factorial {



    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int n) {
        if (n <= 1) return 1;
        return factorial(n-1) * n;
    }
}
