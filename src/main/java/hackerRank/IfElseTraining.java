package hackerRank;

import java.util.Scanner;

public class IfElseTraining {
    //Given an integer n perform the following conditional actions:
    //
    //If  is odd, print Weird
    //If  is even and in the inclusive range of  to , print Not Weird
    //If  is even and in the inclusive range of  to , print Weird
    //If  is even and greater than , print Not Weird
    //Complete the stub code provided in your editor to print whether, or not n is weird.
  public static void IfElse( int n) {
      if (n == 0) {
          System.out.println("Weird");
      }

      else {
          System.out.println("Not weird");
      }
  }
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        IfElse(501);
    }



 }
