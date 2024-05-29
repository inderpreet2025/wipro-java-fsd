import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the input file name: ");
        String inputFileName = scanner.nextLine();
        
        System.out.print("Enter the output file name: ");
        String outputFileName = scanner.nextLine();
        scanner.close();
        
        try (FileInputStream inputStream = new FileInputStream(inputFileName);
             FileOutputStream outputStream = new FileOutputStream(outputFileName)) {
             
            int byteContent;
            while ((byteContent = inputStream.read()) != -1) {
                outputStream.write(byteContent);
            }
            
            System.out.println("File is copied.");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file: " + e.getMessage());
        }
    }
}
