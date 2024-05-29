public class Assignment9 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java InterestCalculator <gender> <age>");
            return;
        }

        String gender = args[0];
        int age;
        
        try {
            age = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Age must be an integer");
            return;
        }

        double interest = calculateInterest(gender, age);
        if (interest != -1) {
            System.out.println("The percentage of interest is " + interest + "%");
        } else {
            System.out.println("Invalid age range or gender");
        }
    }

    private static double calculateInterest(String gender, int age) {
        if (gender.equalsIgnoreCase("Female")) {
            if (age >= 1 && age <= 58) {
                return 8.2;
            } else if (age >= 59 && age <= 100) {
                return 9.2;
            }
        } else if (gender.equalsIgnoreCase("Male")) {
            if (age >= 1 && age <= 58) {
                return 8.4;
            } else if (age >= 59 && age <= 100) {
                return 10.5;
            }
        }
        return -1;
    }
}
