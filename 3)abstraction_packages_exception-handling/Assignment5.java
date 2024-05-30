class Vehicle {
    public int speed(){
        return 0;
    }
}

class Logan extends Vehicle {
    public int speed(){
        return 100;
    }
    public int gps(){
        return 0;
    }
}

class Ford extends Vehicle {
    public int speed(){
        return 120;
    }
    public int tempControl(){
        return 0;
    }
}

public class Assignment5 {
    public static void main(String[] args) {
        Logan logan = new Logan();
        System.out.println("Logan speed: " + logan.speed());
        System.out.println("Logan gps: " + logan.gps());

        Ford ford = new Ford();
        System.out.println("Ford speed: " + ford.speed());
        System.out.println("Ford tempControl: " + ford.tempControl());
    }
}