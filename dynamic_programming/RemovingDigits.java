import java.util.*;

public class RemovingDigits {
    //+++++++++++++++++++GREEDY+++++++++++++++++++

    // public static void main(String[] args) {
    // Scanner in=new Scanner(System.in);
    // int n=in.nextInt();
    // int ans=0;
    // while(n!=0){
    // int x=n;
    // int maxDigi=-1;
    // while(x!=0){
    // maxDigi=Math.max(maxDigi,x%10);
    // x=x/10;
    // }
    // n-=maxDigi;
    // ans++;
    // }
    // System.out.println(ans);
    // in.close();
    // }

//+++++++++++++RECURSINON+++++++++++++
    // static int getMinSteps(int n){
    //     if(n==0) return 0;
    //     int k=n;
    //     int ans=Integer.MAX_VALUE;
    //     while(k!=0){
    //         ans=Math.min(ans,getMinSteps(n-(k%10))+1);
    //         k=k/10;
    //     }
    //     return ans;
    // }

    //+++++++++++++++++++DP++++++++++++++
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        int n=in.nextInt();
        int minSteps[]=new int[n+1];
        Arrays.fill(minSteps,(int)1e9+7);
        minSteps[0]=0;
        for(int i=1;i<=n;i++){
            for(int j=i;j>0;j=j/10){
                if(i>=j%10){
                    minSteps[i]=Math.min(minSteps[i],minSteps[i-j%10]);
                }
            }
            minSteps[i]++;
        }
        System.out.println(minSteps[n]);
        in.close();
    }
}
