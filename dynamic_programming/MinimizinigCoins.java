import java.util.*;
public class MinimizinigCoins {
   
   //++++++++++++++++++TLE WITH RECURSION+MEMO++++++++++++
    // static long minCoins(int sum,int []arr,long dp[]){
    //     if(sum==0)return dp[sum]= 0;
    //     if(sum<0 )return Integer.MAX_VALUE;
    //     if(dp[sum]!=-1)return dp[sum];
    //     long ans=Integer.MAX_VALUE;

    //     for(int x:arr){
    //         if(x>sum) break;
    //         ans=Math.min(ans,minCoins(sum-x, arr,dp)+1);
    //     }
    //     return dp[sum]= ans;
    // }
   
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        //++++++++ITERATIVE DP++++++++++++++++
        Arrays.sort(arr);
        long dp[]=new long[sum+1];
        dp[0]=0;

        for(int i=1;i<=sum;i++){
            long curr=Integer.MAX_VALUE;
            for(int x:arr){
                if(x>i)break;
                curr=Math.min(curr,dp[i-x]+1);
            }
            dp[i]=curr;
        }
        System.out.println((dp[sum]==Integer.MAX_VALUE)?-1:dp[sum]);
        in.close();
    }
}