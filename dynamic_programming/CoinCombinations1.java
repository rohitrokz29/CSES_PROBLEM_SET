import java.util.*;
public class CoinCombinations1 {

    //+++++++++++++TLE + STACKOVERFLOW WITH REC+MEMO
    // static long findWays(int sum,Set<Integer> coins,long[]dp){
    //     if(sum==0) return 1;
    //     if(sum<0) return 0;
    //     if(dp[sum]!=-1)return dp[sum];
    //     long ans=0;
    //     for(int x:coins){
    //         ans+=findWays(sum-x, coins,dp);
    //     }
    //     return  dp[sum]=ans;
    // } 

    //++++++++++++++ITERATIVE DP+++++++++++++=
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int sum=in.nextInt();
        int []coins=new int[n];
        for(int i=0;i<n;i++){
            coins[i]=in.nextInt();
        }
        Arrays.sort(coins);
        long dp[]=new long[sum+1];
        dp[0]=1;
        for(int i=1;i<=sum;i++){
            for(int x:coins){
                if(x>i)break;
                dp[i]+=dp[i-x];
            }
            dp[i]=dp[i]%((int)(1e9+7));
        }
        System.out.println(dp[sum]);

        in.close();
    }
}