package Polymorphizm;

public class Dancer {
    String name;
    int age;

   public Dancer(String name, int age) {
       this.age = age;
       this.name = name;
   }

    public static void main(String[] args) {
        Dancer d1 = new Dancer("Nick", 22);
        Dancer d2 = new Dancer("Kate", 12);
        Dancer d3 = new Dancer("Kyk", 25);
    }

}
