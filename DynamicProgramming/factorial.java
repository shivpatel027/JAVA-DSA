package DynamicProgramming;

public class factorial {
    public static int fib(int n) {
        if(n <= 1) 
            return n;

        int[] dp = {0, 1};
        int i = 2;
        while (i <= n) {
            int temp = dp[1];
            dp[1] = dp[0] + dp[1];
            dp[0] = temp;
            i++;
        }

        return dp[1];
    }
    
    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
