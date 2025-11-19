public class printSubArray {

    public static void subArray(int[] numbers) {
        int totalSubArray = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");

                }
                totalSubArray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total SubArrays: " + totalSubArray);
    }

    public static void main(String[] args) {
        int[] numbers = { 2, 4, 6, 8, 10 };
        subArray(numbers);

    }
}
