package learningMethod;

public class ReplaceAllExample {
    /**
     * "regex" это цифра или буква которую хотим заменить,
     * "replacement" это цифра или буква на которую хотим заменить
     */

    public static void main(String[] args) {


        String java = "Строки являются очень важной 111 составляющей java";

        String result = java.replaceAll("С","b");
        System.out.println(result);
    }
}
