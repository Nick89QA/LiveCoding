package hackerRank.IntToString;

import java.security.Permission;
import java.util.Scanner;

public class Solution {

    /**
     * распарсить строку в число с диапазоном  -100 и до 100
     */



    public static void main(String[] args) {

        DoNotTerminate.forbidExit();

        try {
            Scanner in = new Scanner(System.in);

            int n = in.nextInt();
            in.close();

            String s = String.valueOf(n);

            if (n == Integer.parseInt(s)) { //указываем диапазон в котором будет сообщение good job
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}


class DoNotTerminate {
    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1;
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }

}
