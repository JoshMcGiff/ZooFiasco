public class SeniorZookeeper {
    private String name;

    public SeniorZookeeper(String name) {
        this.name = name;
    }

    public void feedAnimal(Animal animal) {
        System.out.println(name + " is feeding " + animal.name);
    }

    public void cleanCage(Animal animal) {
        System.out.println(name + " is cleaning " + animal.type + "'s cage");
    }

    public void giveMedicine(Animal animal) {
        System.out.println(name + " is giving medicine to " + animal.type);
    }
}
