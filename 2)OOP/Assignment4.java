class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Bird extends Animal {
    @Override
    public void eat() {
        System.out.println("Bird is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Bird is sleeping");
    }

    public void fly() {
        System.out.println("Bird is flying");
    }
}

public class Assignment4 {
    public static void main(String[] args) {
        // Create an instance of Animal and invoke methods
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();

        // Create an instance of Bird and invoke methods
        Bird bird = new Bird();
        bird.eat();
        bird.sleep();
        bird.fly();
    }
}
