public class JuniorZookeeper {
    private String name;

    public JuniorZookeeper(String name) {
        this.name = name;
    }

    public void feedAnimal(Animal animal) {
        System.out.println(name + " is feeding " + animal.name);
    }

    public void cleanCage(Animal animal) {
        System.out.println(name + " is cleaning " + animal.type + "'s cage");
    }
}
