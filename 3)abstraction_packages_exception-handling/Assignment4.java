class Main {

    public abstract static class Vehicle {
        public abstract String getModelName();
        public abstract String getRegistrationNumber();
        public abstract String getOwnerName();
    }

    public static class Hero extends Vehicle{
        
        @Override
        public String getModelName() {
            return "Hero";
        }

        @Override
        public String getRegistrationNumber() {
            return "HR12345";
        }

        @Override
        public String getOwnerName() {
            return "John Doe";
        }

        public int getSpeed() {
            return 60; // Returns the current speed of the vehicle.
        }

        public void radio() {
            // provides facility to control the radio device
            System.out.println("Radio is playing");
        }
    }

    public static class Honda extends Vehicle{
        
        @Override
        public String getModelName() {
            return "Honda";
        }

        @Override
        public String getRegistrationNumber() {
            return "HN12345";
        }

        @Override
        public String getOwnerName() {
            return "Jane Doe";
        }

        public int getSpeed() {
            return 80; // Returns the current speed of the vehicle.
        }

        public void cdplayer() {
            // provides facility to control the cd player device 
            System.out.println("CD player is playing");
        }
    }

    public static void main(String[] args) {
        Hero hero = new Hero();
        System.out.println("Model Name: " + hero.getModelName());
        System.out.println("Registration Number: " + hero.getRegistrationNumber());
        System.out.println("Owner Name: " + hero.getOwnerName());
        System.out.println("Speed: " + hero.getSpeed());
        hero.radio();

        Honda honda = new Honda();
        System.out.println("Model Name: " + honda.getModelName());
        System.out.println("Registration Number: " + honda.getRegistrationNumber());
        System.out.println("Owner Name: " + honda.getOwnerName());
        System.out.println("Speed: " + honda.getSpeed());
        honda.cdplayer();
    }
}
public class Assignment4 {

    public abstract static class Vehicle {
        public abstract String getModelName();
        public abstract String getRegistrationNumber();
        public abstract String getOwnerName();
    }

    public static class Hero extends Vehicle{
        
        @Override
        public String getModelName() {
            return "Hero";
        }

        @Override
        public String getRegistrationNumber() {
            return "HR12345";
        }

        @Override
        public String getOwnerName() {
            return "John Doe";
        }

        public int getSpeed() {
            return 60; // Returns the current speed of the vehicle.
        }

        public void radio() {
            // provides facility to control the radio device
            System.out.println("Radio is playing");
        }
    }

    public static class Honda extends Vehicle{
        
        @Override
        public String getModelName() {
            return "Honda";
        }

        @Override
        public String getRegistrationNumber() {
            return "HN12345";
        }

        @Override
        public String getOwnerName() {
            return "Jane Doe";
        }

        public int getSpeed() {
            return 80; // Returns the current speed of the vehicle.
        }

        public void cdplayer() {
            // provides facility to control the cd player device 
            System.out.println("CD player is playing");
        }
    }

    public static void main(String[] args) {
        Hero hero = new Hero();
        System.out.println("Model Name: " + hero.getModelName());
        System.out.println("Registration Number: " + hero.getRegistrationNumber());
        System.out.println("Owner Name: " + hero.getOwnerName());
        System.out.println("Speed: " + hero.getSpeed());
        hero.radio();

        Honda honda = new Honda();
        System.out.println("Model Name: " + honda.getModelName());
        System.out.println("Registration Number: " + honda.getRegistrationNumber());
        System.out.println("Owner Name: " + honda.getOwnerName());
        System.out.println("Speed: " + honda.getSpeed());
        honda.cdplayer();
    }
}