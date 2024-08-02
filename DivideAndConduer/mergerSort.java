package DivideAndConduer;

public class mergerSort {
    public static void mergeSort(int array[], int l, int r) 
    {
        if (l < r) 
        {
            int m = l + (r - l) / 2;
            mergeSort(array,l,m);
            mergeSort(array,m+1,r);
    
            merge(array,l,m,r);
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        mergerSort(arr);
    }
}
