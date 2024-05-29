import java.util.Scanner;

public class Assignment11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a color code (R, B, G, O, Y, W): ");
        char colorCode = scanner.next().charAt(0);
        
        switch (colorCode) {
            case 'R':
                System.out.println("Red");
                break;
            case 'B':
                System.out.println("Blue");
                break;
            case 'G':
                System.out.println("Green");
                break;
            case 'O':
                System.out.println("Orange");
                break;
            case 'Y':
                System.out.println("Yellow");
                break;
            case 'W':
                System.out.println("White");
                break;
            default:
                System.out.println("Invalid Code");
                break;
        }
        
        scanner.close();
    }
}
