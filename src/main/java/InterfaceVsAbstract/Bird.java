package InterfaceVsAbstract;

public abstract class Bird {
    /**
     * в абстрактном классе создали private переменные brand абстрактный метод
     * а также создали гетеры brand сетеры для этих пересенных
     * brand смогли это все реализовать в классе Sparrow
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

