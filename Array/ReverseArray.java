public class ReverseArray {
    public static void reverseArray(int numb[]) {
        int first = 0, last = numb.length - 1;
        
        while(first < last) {
            int temp = numb[last];
            numb[last] = numb[first];
            numb[first] = temp;
            first++;
            last--;
        }

        System.out.println(numb);
    }
    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10};
        reverseArray(num);
        for(int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
