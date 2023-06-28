package learningMethod;

public class ReplaceAllExample {
    /**
     * "regex" это цифра или буква которую хотим заменить,
     * "replacement" это цифра или буква на которую хотим заменить
     */


    /**
     * Метод который убирает и возвращает пробелы и другие знаки
     */
    public static String isPalindrome(String s) {
        return s.replaceAll("\\W", "");
    }

    public static void main(String[] args) {
        String answer =  isPalindrome("fdsf, ,sf sdf,  s,f sf,, s");
        System.out.println(answer);



        String java = "Строки являются очень важной 111 составляющей java";

        String result = java.replaceAll("С","b"); //заменяем С на b
        System.out.println(result);
    }
}
