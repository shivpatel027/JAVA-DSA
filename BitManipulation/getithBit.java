package BitManipulation;

public class getithBit {
    public static int getIthBit(int n, int k) {
        int bitMask = 1<<k;
        if((n & bitMask) == 0) {
            return 0;
        } else 
            return 1;
    } 
    public static void main(String[] args) {
        System.out.println(getIthBit(10, 3));
    }
}
