public class LenearSearch {

    public static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 6, 3, 9, 10 };
        int target = 10;
        System.out.println(linearSearch(arr, target));

    }
}