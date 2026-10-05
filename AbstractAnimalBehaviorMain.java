// 9. Abstract Animal Eat and Sleep
abstract class Animal {
    public abstract void eat();
    public abstract void sleep();
}

class Lion extends Animal {
    @Override
    public void eat() {
        System.out.println("Lion eats meat and prey.");
    }

    @Override
    public void sleep() {
        System.out.println("Lion sleeps up to 20 hours a day in shady grass.");
    }
}

class Tiger extends Animal {
    @Override
    public void eat() {
        System.out.println("Tiger hunts and eats wild boars and deer.");
    }

    @Override
    public void sleep() {
        System.out.println("Tiger sleeps after long solitary hunts.");
    }
}

class Deer extends Animal {
    @Override
    public void eat() {
        System.out.println("Deer eats grass, leaves, and plants.");
    }

    @Override
    public void sleep() {
        System.out.println("Deer sleeps lightly in dense forest foliage.");
    }
}

public class AbstractAnimalBehaviorMain {
    public static void main(String[] args) {
        Animal[] animals = { new Lion(), new Tiger(), new Deer() };

        for (Animal animal : animals) {
            animal.eat();
            animal.sleep();
            System.out.println("---------------------------------");
        }
    }
}
