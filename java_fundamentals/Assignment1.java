public class Assignment1 {
    public static void main(String[] args) {
        if (args.length!= 2) {
            System.out.println("Please provide two command line arguments.");
            return;
        }

        String companyName = args[0];
        String location = args[1];

        System.out.println(companyName + " Technologies " + location);
    }
}