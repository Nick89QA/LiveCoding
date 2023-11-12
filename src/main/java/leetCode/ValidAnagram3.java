package leetCode;

import java.util.Arrays;

public class ValidAnagram3 {
    public boolean isAnagram(String k, String u) {
       k =  k.toLowerCase().replaceAll("/", "");//removed all characters and convert to lowercase
       u = u.toLowerCase().replaceAll("/", "");

        if (k.length() != u.length()){ // check that strings has the same length
            return false;
        }

        char[] kCharArray = k.toCharArray();//convert string in array of characters
        char[] uCharArray = u.toCharArray();


        return Arrays.equals(kCharArray,uCharArray);
    }

    public static void main(String[] args) {
        ValidAnagram3 v = new ValidAnagram3();
        System.out.println(v.isAnagram("dadadas", "sdadasd"));// not anagrams
        System.out.println(v.isAnagram("dad", "dad"));//anagrams


    }

}
