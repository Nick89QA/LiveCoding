package leetCode;

import java.util.Arrays;

public class ValidAnagram2 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }

        char[] sCharArray = s.toCharArray();//масив чаров равен s
        char[] tCharArray = t.toCharArray();//масив чаров равен t
        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);

        return Arrays.equals(sCharArray, tCharArray);
    }

    public static void main(String[] args) {
        ValidAnagram2 a =  new ValidAnagram2();
        a.isAnagram("fsdfssfsfsfs","ffsfsfss");
    }

}
