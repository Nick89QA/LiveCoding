package leetCode;

public class CompareString {
    //backspace String Compare

    public static void check() {
        String input = "Hello";
        for (int i = input.length() - 1; i >= 0; i--) {
            char currentChar = input.charAt(i);
            System.out.println(currentChar);
        }
    }

    public static void main(String[] args) {
        check();
    }

}
