import java.util.Scanner;

class InvalidCountryException extends Exception {
    public InvalidCountryException(String message) {
        super(message);
    }
}

public class Assignment10 {

    public static void registerUser(String username, String userCountry) throws InvalidCountryException {
        if (!userCountry.equals("India")) {
            throw new InvalidCountryException("User Outside India cannot be registered");
        } else {
            System.out.println("User registration done successfully");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username and country separated by comma: ");
        String input = scanner.nextLine();
        String[] parts = input.split(",");
        String username = parts[0].trim();
        String userCountry = parts[1].trim();

        try {
            registerUser(username, userCountry);
        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}