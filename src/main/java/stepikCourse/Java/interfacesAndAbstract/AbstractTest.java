package stepikCourse.Java.interfacesAndAbstract;

public class AbstractTest {
    public static void main(String[] args) {
        Kvadrat k = new Kvadrat();
        k.perimetr();
        k.ploshad();
        Pryamougolnik p = new Pryamougolnik();
        p.perimetr();
        p.ploshad();
        Okrujnost o = new Okrujnost();
        o.perimetr();
        o.ploshad();


    }
}

abstract class Figura {
    int kolichestvoStoron;

    abstract void perimetr(); //абстрактные методы без тела

    abstract void ploshad();

    void showInfo() { //неабстрактные метод может быть в абстрактном классе
        System.out.println("Eto figura");
    }


}

class Kvadrat extends Figura {
    int kolichestvoStoron = 4;
    int storona1 = 10;

    public void perimetr() { //реализовали периметр с абстрактного класса
        System.out.println("Perimetr kvadrata = " + 4 * storona1);
    }

    public void ploshad() {
        System.out.println("Ploshad kvadrata = " + storona1 * storona1);

    }

}

class Pryamougolnik extends Figura {
    int kolichestvoStoron = 4;
    int storona1 = 8;
    int storona2 = 5;

    public void perimetr() { //реализовали периметр с абстрактного класса
        System.out.println("Perimetr pryamougolnika = " + 2 * (storona1 + storona2));
    }

    public void ploshad() {
        System.out.println("Ploshad pryamougolnika = " + storona1 * storona2);

    }

}

abstract class k extends Figura {

}

class Okrujnost extends Figura {

    int kolichestvoStoron = 4;
    int radius = 3;

    public void perimetr() { //реализовали периметр с абстрактного класса
        System.out.println("Perimetr okrujnosti = " + 2 * 3.14 * radius);
    }

    public void ploshad() {
        System.out.println("Ploshad okrujnosti = " + 3.14 * radius);

    }
}

/**
 * если наследуемый класс будет абстрактный то исчезнет ошибка компиляции
 */
abstract class Chetirechugolnik extends Figura {
    void def() {
        System.out.println("eto cheturechugolnick");
    }
}