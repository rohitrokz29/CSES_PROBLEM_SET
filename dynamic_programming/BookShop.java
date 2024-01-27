import java.util.*;
public class BookShop {
    static long func(int i,int x,int h[], int s[]){
        if(x==0)return 0;
        if(i==s.length)return 0;
        long ans=0;
        if(x>=h[i]){
           ans=Math.max(ans,func(i+1, x-h[i], h, s)+s[i]);
        }
        ans=Math.max(ans,func(i+1, x, h, s));
        return ans;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int x=in.nextInt();
        int h[]=new int[n];
        int s[]=new int[n];
        for(int i=0;i<n;i++)h[i]=in.nextInt();
        for(int i=0;i<n;i++)s[i]=in.nextInt();
        int maxPages[][]=new int[x+1][n+1];
        ArrayList<ArrayList<Integer>> maxpage=new ArrayList<>();
        for(int i=0;i<=n;i++){
            ArrayList<Integer> arr=new ArrayList<>();
            for(int j=0;j<=x;j++){
                arr.add(0);
            }
            maxpage.add(arr);
        } 
        for(int i=1;i<=n;i++){
            for(int j=0;j<=x;j++){
                int t=0;
                if(j>h[i-1]){
                    t=Math.max(t,maxpage.get(i-1).get(j-h[i-1])+s[i-1]);
                }
                t=Math.max(t,maxpage.get(i-1).get(j));
                maxpage.get(i).set(j,t);
            }
        }
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=x;j++){
        //         if(j>=h[i-1]){
        //             maxPages[j][i]=Math.max(maxPages[j][i],maxPages[j-h[i-1]][i-1]+s[i-1]);
        //         }
        //         maxPages[j][i]=Math.max(maxPages[j][i],maxPages[j][i-1]);
        //     }
        // }
        System.out.println(maxpage.get(n).get(x));
        in.close();
    }
}