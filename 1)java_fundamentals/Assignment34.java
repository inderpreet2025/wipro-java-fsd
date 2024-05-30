public class Assignment34 {
    public static void main(String[] args) {
        if (args.length != 9) {
            System.out.println("Please enter 9 integer numbers");
            return;
        }
        int[][] array = new int[3][3];
        int i = 0;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                array[row][col] = Integer.parseInt(args[i++]);
            }
        }
        System.out.println("The given array is : ");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }
        int max = array[0][0];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (array[row][col] > max) {
                    max = array[row][col];
                }
            }
        }
        System.out.println("The biggest number in the given array is " + max);
    }
}