public class Assignment31 {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 1, 4};
        int[] arr2 = {1, 4, 2, 4};
        int[] arr3 = {1, 1};
        int[] arr4 = {2, 5, 6, 7};

        System.out.println(only14(arr1));
        System.out.println(only14(arr2));
        System.out.println(only14(arr3));
        System.out.println(only14(arr4));
    }

    public static boolean only14(int[] arr) {
        for (int num : arr) {
            if (num != 1 && num != 4) {
                return false;
            }
        }
        return true;
    }
}