package Recursion;

public class problem6 {
    public static boolean sorted(int[] n, int i) {
        if(i == n.length - 1) return true;

        if(n[i] > n[i + 1]) return false;

        return sorted(n, i+1);
    }
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4};
        System.out.println(sorted(n, 0));
    }
}
