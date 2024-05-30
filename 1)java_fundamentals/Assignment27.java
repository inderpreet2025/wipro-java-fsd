public class Assignment27 {
    public static void main(String[] args) {
        int[] inputArray = {12, 34, 12, 45, 67, 89};

        int[] tempArray = new int[inputArray.length];
        int uniqueCount = 0;

        for (int i = 0; i < inputArray.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < uniqueCount; j++) {
                if (inputArray[i] == tempArray[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                tempArray[uniqueCount++] = inputArray[i];
            }
        }

        int[] outputArray = new int[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            outputArray[i] = tempArray[i];
        }

        for (int i = 0; i < outputArray.length - 1; i++) {
            for (int j = i + 1; j < outputArray.length; j++) {
                if (outputArray[i] > outputArray[j]) {
                    int temp = outputArray[i];
                    outputArray[i] = outputArray[j];
                    outputArray[j] = temp;
                }
            }
        }

        System.out.print("O/P: {");
        for (int i = 0; i < outputArray.length; i++) {
            System.out.print(outputArray[i]);
            if (i < outputArray.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("}");
    }
}
