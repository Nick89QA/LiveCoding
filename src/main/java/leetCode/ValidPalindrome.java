package leetCode;

/**
 * Фраза является палиндромом,если после преобразования всех прописных букв в строчные
 * и удаления всех не буквенно-цифровых символов она читается одинаково вперед и назад.
 * Буквенно-цифровые символы включают буквы и цифры. Учитывая строку s, вернуть true,
 * если это палиндром, или false в противном случае.
 */

class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        String s1 = ""; // создали пустую строку
        boolean b = false; // инициализация переменной для возврата переменной
        s = s.toLowerCase(); // приводим строку s в нижний регистр
        s = s.replace(" ", ""); //удаляем пробелы
        s = s.replaceAll("\\p{Punct}", "");//регулярка пунктуация
        for (int i = s.length() - 1; i >= 0; i--) {   /** выполняется цикл for который итерируется
         по символам обратном порядке, каждый символ добавляется в конец строки s1*/
            s1 = s1 + s.charAt(i);
            if (s.equals(s1)) { //если строка s1 равна s то true
                b = true;
            } else
                b = false;

        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("fddf"));


    }
}
