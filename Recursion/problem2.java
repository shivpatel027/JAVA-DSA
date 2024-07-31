package Recursion;

public class problem2 {
    public static void printAsc(int n) {
        if(n == 1) {
            System.out.print(n + " ");
            return;
        }

        printAsc(n-1);
        System.out.print(n+ " ");
    }
    public static void main(String[] args) {
        printAsc(10);
    }
}
