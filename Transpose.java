public class Transpose {
    public static void main(String[] args) {
        int nums[][] = {
                { 7, 8, 9 },
                { 4, 5, 6 }
        };

        int[][] transpose = new int[nums[0].length][nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                transpose[j][i] = nums[i][j];
            }
        }

        // Transpose Matrix
        System.out.println("Transpose Matrix");

        for (int i = 0; i < nums[0].length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

    }
}
