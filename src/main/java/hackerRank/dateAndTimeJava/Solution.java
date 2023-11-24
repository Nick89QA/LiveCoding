package hackerRank.dateAndTimeJava;

/**
 * вывести дату и время использую библиотеку LocalDate
 */

import java.io.*;
import java.time.LocalDate;

class Result {


    public static String findDay(int month, int day, int year ) {

        LocalDate localDate = LocalDate.of(year, month, day);
        return localDate.getDayOfWeek().name();
    }
}






public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}