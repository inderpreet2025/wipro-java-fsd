import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        scanner.close();
        
        System.out.print("Enter the character to be counted: ");
        char characterToCount = scanner.nextLine().charAt(0);
        
        int count = 0;
        
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int c;
            while ((c = reader.read()) != -1) {
                if (Character.toLowerCase((char)c) == Character.toLowerCase(characterToCount)) {
                    count++;
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
            return;
        }
        
        System.out.println("File '" + fileName + "' has " + count + " instances of letter '" + characterToCount + "'.");
    }
}
