package InterfaceVsAbstract;

public class Eagle implements Flyable {
    @Override
    public void fly() {
        System.out.println(" Я лечу ");
    }

    public static void main(String[] args) {
        Eagle e = new Eagle();
        e.fly();
    }
}