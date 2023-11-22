package hackerRank.IntToString;

public class Example {

    public static void main(String[] args) {
        String number = "42";

        try {
           int n = Integer.parseInt(number);
                System.out.println("Норм так");

        }catch (NumberFormatException e) {
            System.out.println(" не получилось " + e.getMessage());
        }

    }
}
