package stepikCourse.Java.interfacesAndAbstract;

public class InterfaceTest5 {

}

interface I1 {
    static void avv() { //статический метод создали в интерфейсе
        System.out.println("eto static method avv");
    }
    void abc();
    default void ghi() {
        System.out.println("это метод ghi");
    }
    default void def() {
        System.out.println("это метод def");
    }
}
class Z2 implements I1 {
    public void abc() {System.out.println("это метод abc");}

    public static void main(String[] args) {
        /**
         * имплементировал методы из интерфейса
         * те методы default в которых есть тело,уже не перезапишешь
         */
        I1.avv();
        Z2 z = new Z2();
        z.abc();
        z.def();
        z.ghi();
    }
}