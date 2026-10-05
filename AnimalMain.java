// 1. Animal and Cat Override
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        // Overridden to bark as per specification
        System.out.println("Cat says: Bark!");
    }
}

public class AnimalMain {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Cat myCat = new Cat();

        myAnimal.makeSound();
        myCat.makeSound();
    }
}
