import java.util.Scanner;

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class Assignment11 {
    private String name;
    private int age;

    public Assignment11(String name, int age) throws AgeException {
        if (age < 18 || age >= 60) {
            throw new AgeException("Age should be between 18 and 60");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter age: ");
            int age = scanner.nextInt();

            Assignment11 person = new Assignment11(name, age);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        } catch (AgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter name and age.");
        } finally {
            scanner.close();
        }
    }
}
