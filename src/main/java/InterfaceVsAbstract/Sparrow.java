package InterfaceVsAbstract;

public class Sparrow extends Bird {
    /**
     * реализовали все методы абстрактного класса bird через гетеры и сеттеры в классе sparrow
     */

    @Override
    public void fly() {
        System.out.println("Лети птичка");
    }

    public static void main(String[] args) {
        Sparrow s = new Sparrow();
        s.setAge(22);
        System.out.println(s.getAge());
        s.setSpecies("Sparrow");
        s.getSpecies();

    }

}
