package hackerRank.InputOutputFormat;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {

    public static void main(String[] args) {

        try {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        Locale indiaLocale = new Locale("en", "IN");


                NumberFormat usa = NumberFormat.getCurrencyInstance(Locale.US);
                String us = usa.format(payment);

                NumberFormat ind = NumberFormat.getCurrencyInstance(indiaLocale);
                String india = ind.format(payment);

                NumberFormat franc = NumberFormat.getCurrencyInstance(Locale.FRANCE);
                String france = franc.format(payment);

                NumberFormat chin = NumberFormat.getCurrencyInstance(Locale.CHINA);
                String china = chin.format(payment);


                System.out.println("US: " + us);
                System.out.println("India " + india);
                System.out.println("China " + china);
                System.out.println("France " + france);


        } catch (Exception e) {
            System.out.println("----Incorrect format-----" + " " + e.getMessage());
        }

    }
}
