package Recursion;

public class porblem7 {
    public static int firstOcc(int[] arr, int key, int i) {
        if(i == arr.length) return -1;
        if(arr[i] == key) return i;

        return firstOcc(arr, key, i+1);
    }
    
    public static int lastOcc(int[] arr, int key, int i) {
        if(i == arr.length) return -1;
        
        int isFond = lastOcc(arr, key, i+1);
        if(isFond == -1 && arr[i] == key) return i;

        return isFond;
    }
    public static void main(String[] args) {
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println(firstOcc(arr, 5, 0));
        System.out.println(lastOcc(arr, 5, 0));
    }
}
