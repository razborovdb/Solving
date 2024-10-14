package learn01.training.interviewquestions.palindrom;

public class Palindrom {

    public static void main(String[] args) {
        boolean result = isPalindrome("ccabdbacc");
        System.out.println(result);
    }

    public static boolean isPalindrome(String s) {
        return (recursion(s, 0, s.length()-1));
    }

    public static boolean recursion(String s, int start, int end) {
        if (end <= start) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return recursion(s, start + 1, end - 1);
    }
}
