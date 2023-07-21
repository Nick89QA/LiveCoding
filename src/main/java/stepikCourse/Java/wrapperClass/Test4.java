package stepikCourse.Java.wrapperClass;

public class Test4 {

    public static void main(String[] args) {
        Test4 t = new Test4();
        t.abc(44);
        System.out.println(t.getName());
    }

    void abc (int i) {
        System.out.println("int " + i);
    }

    void abc ( byte i ) {
        System.out.println("byte" + i );
    }

    String getName() {
        return "Nick";
    }
}
