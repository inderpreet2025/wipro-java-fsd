import java.util.Random;

abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {
    @Override
    public String notice() {
        return "This is a First Class Compartment. Enjoy your journey!";
    }
}

class Ladies extends Compartment {
    @Override
    public String notice() {
        return "This is a Ladies Compartment. Please maintain decorum.";
    }
}

class General extends Compartment {
    @Override
    public String notice() {
        return "This is a General Compartment. Please travel safely.";
    }
}

class Luggage extends Compartment {
    @Override
    public String notice() {
        return "This is a Luggage Compartment. Please ensure your luggage is secure.";
    }
}

public class Assignment1 {
    public static void main(String[] args) {
        Compartment[] compartments = new Compartment[10];
        Random random = new Random();

        for (int i = 0; i < compartments.length; i++) {
            int compartmentType = random.nextInt(4) + 1;

            switch (compartmentType) {
                case 1:
                    compartments[i] = new FirstClass();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new General();
                    break;
                case 4:
                    compartments[i] = new Luggage();
                    break;
            }
        }

        for (Compartment compartment : compartments) {
            System.out.println(compartment.notice());
        }
    }
}