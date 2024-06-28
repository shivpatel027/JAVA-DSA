import java.util.Scanner;

public class initialization {
    public static void largestNum(int matrix[][]) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                if(matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println(largest);
    }

    public static void smallestNum(int matrix[][]) {
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                if(matrix[i][j] < smallest) {
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println(smallest);
    }

    public static boolean search(int matrix[][], int key) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                    System.out.println("fouded at cell (" + i + ", " + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = 3, m = 3;

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //output
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        search(matrix, 5);
        largestNum(matrix);
        smallestNum(matrix);
    }    
}
