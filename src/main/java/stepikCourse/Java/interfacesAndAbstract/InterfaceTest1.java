package stepikCourse.Java.interfacesAndAbstract;

/**
 * невозможно создать обьект интерфейса потому что это не класс
 * у интерфейса нет конструктора
 * методы не могут быть final так как они должны быть перезаписаны
 * если клас который имплементировал interface не перезаписал все методы то он должен быть abstract
 *
 */

public class InterfaceTest1 {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.pomosh();
        t.tushitPojar();
        Driver d = new Driver();
        d.pomosh();
        d.swim();
        d.tushitPojar();
        d.testForConstanta();
/**
 * 2 интерфейса ссылаются на один и тот же класс потому что он их имплементирует
 */
        Help_able h = new Driver();
        Swim_able s = new Driver();



    }

}
class Employee {
    double salary = 100;
    String name = "Nick";
    int age;
    int experience;
    void eat() {
        System.out.println("kushat");
    }
    void sleep() {
        System.out.println("Spat");
    }
}
  class Teacher extends Employee implements Help_able {
    int kolichestvoUchenikov;
    void uchit() {
        System.out.println("Uchit");
    }
     public void pomosh() {
        System.out.println("Uchitel okazivaet pomosh");
    }
    public void tushitPojar() {
        System.out.println("Uchitel tushit pojar");
    }
}

/**
 * в классе Driver происходит множественная имплементация интерфейсов но не затронуто extends
 */
 class Driver extends Employee implements Help_able, Swim_able, Test1 {
    String nazvanieMashini;
    void vodit() {
        System.out.println("Vodit");
    }
    void testForConstanta(){
        System.out.println(a);
    }

     @Override
     public void pomosh() {
         System.out.println("Driver okazuvaet pomosh");
     }

     @Override
     public void tushitPojar() {
         System.out.println("Driver tushit pojar");

     }

     @Override
     public void swim() {
         System.out.println("Driver plavaet");
     }
 }

 interface Help_able{
    void pomosh();
    void tushitPojar();
 }

 interface Swim_able{
    void swim();
 }

 interface Test1 {
     int a = 10;
 }

