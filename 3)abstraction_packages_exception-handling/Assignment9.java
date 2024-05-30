import java.util.Scanner;

class NegativeMarksException extends Exception {
    public NegativeMarksException(String message) {
        super(message);
    }
}

class MarksOutOfRangeException extends Exception {
    public MarksOutOfRangeException(String message) {
        super(message);
    }
}

public class Assignment9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the first student: ");
        String student1Name = scanner.nextLine();
        System.out.println("Enter the name of the second student: ");
        String student2Name = scanner.nextLine();

        int[][] marks = new int[2][3];
        for (int i = 0; i < 2; i++) {
            String studentName = (i == 0) ? student1Name : student2Name;
            System.out.println("\n" + studentName + "'s Marks:");
            for (int j = 0; j < 3; j++) {
                try {
                    System.out.println("Enter marks for subject " + (j + 1) + ": ");
                    marks[i][j] = Integer.parseInt(scanner.nextLine());
                    if (marks[i][j] < 0) {
                        throw new NegativeMarksException("Marks cannot be negative.");
                    } else if (marks[i][j] > 100) {
                        throw new MarksOutOfRangeException("Marks must be between 0 and 100.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number: ");
                    j--; // Re-prompt for the same subject
                } catch (NegativeMarksException e) {
                    System.out.println(e.getMessage());
                    j--; // Re-prompt for the same subject
                } catch (MarksOutOfRangeException e) {
                    System.out.println(e.getMessage());
                    j--; // Re-prompt for the same subject
                }
            }
        }

        for (int i = 0; i < 2; i++) {
            String studentName = (i == 0) ? student1Name : student2Name;
            int totalMarks = 0;
            for (int j = 0; j < 3; j++) {
                totalMarks += marks[i][j];
            }
            double averageMarks = (double) totalMarks / 3;
            System.out.println("\n" + studentName + "'s Average Marks: " + averageMarks);
        }

        scanner.close();
    }
}