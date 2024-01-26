import java.util.*;
public class CoinCombinations2 {
    static int MOD=(int)(1e9+7);
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int sum=in.nextInt();
        int coins[]=new int[100];
        for (int i = 0; i < n; i++) {
            coins[i]=in.nextInt();
        }
        int dp[]=new int[(int)(1e6+3)];
        dp[0] = 1;
            for(int j=0;j<=sum;j++){
                for(int i=0;i<n;i++){
                    dp[j] += (j-coins[i] >= 0?dp[j-coins[i]]:0);
                    dp[j] %= MOD;
                }
            }
        
        System.out.println(dp[sum]);
        in.close();
        
    }
}

