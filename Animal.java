// Animal.java
public class Animal {
    public String name;
    public String type;
    public String[] favoriteFoods;

    public Animal(String name, String type, String[] favoriteFoods) {
        this.name = name;
        this.type = type;
        this.favoriteFoods = favoriteFoods;
    }

    public void makeSound() {
        switch (type) {
            case "Lion":
                System.out.println("Roar!");
                break;
            case "Monkey":
                System.out.println("Ooh ooh ah ah!");
                break;
            case "Elephant":
                System.out.println("Trumpet!");
                break;
            default:
                System.out.println("Unknown animal type");
        }
    }

    public void performTrick() {
        if ("Monkey".equals(type)) {
            System.out.println("Performs somersault");
        } else {
            System.out.println("No trick available");
        }
    }

    public void feed() {
        System.out.println("Feeding " + name + " with " + favoriteFoods[0]);
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }

    public void exercise() {
        if ("Elephant".equals(type)) {
            System.out.println("Elephant is lifting weights");
        } else {
            System.out.println("No exercise available");
        }
    }
}
