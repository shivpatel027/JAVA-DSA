package DynamicProgramming;

public class countPaths {
    public static int paths(int rows, int cols) {
        int[] prevRow = new int[cols];

        for(int i = rows - 1; i >= 0; i--) {
            int[] currRow = new int[cols];
            currRow[cols - 1] = 1;
            for(int j = cols - 2; j >= 0; j--) {
                currRow[j] = currRow[j+1] + prevRow[j];
            }
            prevRow = currRow;
        }
        return prevRow[0];
    }

    public static void main(String[] args) {
        System.out.println(paths(3, 2));
    }
}
