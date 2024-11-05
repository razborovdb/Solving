package learn01.training.reversestring;

public class ReverseString {

    public static void main(String[] args) {
        String string = "I am a programmer";
        System.out.println(reverseString(string));
    }

    public static String reverseString(String s) {
        int start = 0;
        int end = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);
        while(start < end) {
            char c = sb.charAt(end);
            sb.setCharAt(end, sb.charAt(start));
            sb.setCharAt(start, c);
            start++;
            end--;
        }
        return sb.toString();
    }
}
