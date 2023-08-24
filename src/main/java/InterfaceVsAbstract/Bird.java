package InterfaceVsAbstract;

public abstract class Bird {
    /**
     * в абстрактном классе создали private переменные и абстрактный метод
     * а также создали гетеры и сетеры для этих пересенных
     * и смогли это все реализовать в классе Sparrow
     */
    private String species;
    private int age;

    public abstract void fly();


    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

