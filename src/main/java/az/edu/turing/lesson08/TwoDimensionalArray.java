package az.edu.turing.lesson08;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        // one-dimensional array:
        int[] x = new int[]{1, 2, 3, 4, 5};
        for (int element : x) {
            System.out.print(element + " ");
        }
        System.out.println("\n---");

        // two-dimensional array:
        int[][] xy = new int[][]{
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12},
                {13, 14, 15}};

        System.out.println(xy[1][2]);
        System.out.println(xy[0][3]);
        System.out.println(xy.length);

        for (int i = 0; i < xy.length; i++) {
            for (int j = 0; j < xy[i].length; j++) {
                System.out.print(xy[i][j] + " ");
            }
            System.out.println();
        }
    }
}
