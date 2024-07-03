package BitManipulation;

public class setIthBit {
    public static int setIth(int n, int k) {
        int bitMask = 1<<k;
        return n|bitMask;
    }

    public static void main(String[] args) {
        System.out.println(setIth(10, 2));
    }
}
