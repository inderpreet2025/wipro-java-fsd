class Fruit {
    String name;
    String taste;
    String size;

    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    public void eat() {
        System.out.println("The " + name + " tastes " + taste);
    }
}

class Apple extends Fruit {
    public Apple(String name, String taste, String size) {
        super(name, taste, size);
    }

    @Override
    public void eat() {
        System.out.println("The apple tastes " + taste);
    }
}

class Orange extends Fruit {
    public Orange(String name, String taste, String size) {
        super(name, taste, size);
    }

    @Override
    public void eat() {
        System.out.println("The orange tastes " + taste);
    }
}

public class Assignment6 {
    public static void main(String[] args) {
        Fruit fruit = new Fruit("Generic Fruit", "Sweet", "Medium");
        fruit.eat();

        Apple apple = new Apple("Apple", "Sweet and Crisp", "Small");
        apple.eat();

        Orange orange = new Orange("Orange", "Citrusy", "Medium");
        orange.eat();
    }
}
