public class CountSeven {

    public static void main(String[] args) {
        int[][] numbers = {
                { 4, 7, 8 },
                { 8, 8, 7 }
        };

        int count = 0;
        int target = 7;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                if (target == numbers[i][j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}