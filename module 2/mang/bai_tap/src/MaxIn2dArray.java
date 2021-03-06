import java.util.*;

public class MaxIn2dArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input length of matrix");
        int length = scanner.nextInt();
        int[][] array = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.println("input for row " + (i+1) + " and column " + (j+1));
                int value = scanner.nextInt();
                array[i][j] = value;
            }
        }
//        int[][] arr = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
        int max = findMax(array);
        System.out.println("the max value is " + max);
    }
    public static int findMax(int[][] arr) {
        int max = arr[0][0];
        for (int[] i : arr) {
            for (int j : i) {
                if (j > max) max = j;
            }
        }
        return max;
    }
}
