// Zoo.java
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals;
    private List<Zookeeper> zookeepers;
    private ZooManager zooManager;

    public Zoo() {
        animals = new ArrayList<>();
        zookeepers = new ArrayList<>();
        zooManager = new ZooManager("John Doe"); // Default manager for simplicity
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void addZookeeper(Zookeeper zookeeper) {
        zookeepers.add(zookeeper);
    }

    public void setZooManager(ZooManager zooManager) {
        this.zooManager = zooManager;
    }

    public void performAnimalActivities() {
        for (Animal animal : animals) {
            animal.makeSound();
            animal.performTrick();
            animal.feed();
            animal.sleep();
            animal.exercise();
            System.out.println("--------------");
        }
    }

    public void printFavoriteFoods() {
        for (Animal animal : animals) {
            if (animal.favoriteFoods.length > 0) {
                System.out.println(animal.name + "'s favorite food: " + animal.favoriteFoods[0]);
            } else {
                System.out.println(animal.name + " has no favorite food");
            }
        }
    }

    public void interactWithZookeepers() {
        for (Zookeeper zookeeper : zookeepers) {
            zookeeper.feedAnimal(animals.get(0)); // Feed the first animal for simplicity
            zookeeper.cleanCage(animals.get(1)); // Clean the cage of the second animal for simplicity
        }
    }

    public void announceToManager(String message) {
        zooManager.announce(message);
    }
}
