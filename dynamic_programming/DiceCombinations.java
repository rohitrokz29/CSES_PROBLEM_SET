import java.io.*;
import java.util.*;

public class DiceCombinations {
	static int MOD=(int)(1e9+7);

    //TLE WITH REC+MEMO
    // static long findCombo(int n,long[]dp){
	// 	if(n==0) return 1;
	// 	if(n<0) return 0;
	// 	if(dp[n]!=-1) return dp[n];
	// 	long ans=0;
	// 	int j=1;
	// 	while(j<=6 && n>=j){
	// 		ans+=findCombo(n-j,dp);
	// 		j++;
	// 	}
	// 	return dp[n]= (ans%MOD);
	// }
	public static void main(String[] args) throws IOException {
		Scanner in=new Scanner(System.in);
			int  n=in.nextInt();
			long dp[]=new long[n+1];
			dp[0]=1;
			for(int i=0;i<=n;i++){
				int j=1;
				while(j<=6 &&i-j>=0 ){
					dp[i]+=dp[i-j];
					j++;
				}
				dp[i]=(dp[i]%MOD);
			}
			System.out.println(dp[n]);
		in.close();
	}
}
