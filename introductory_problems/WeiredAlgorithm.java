package introductory_problems;
import java.io.*;
import java.util.*;
public class WeiredAlgorithm{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        long ans=n;
        while(ans!=1){
            System.out.print(ans+" ");
            if(ans%2==0){
                ans/=2;
            }
            else{
                ans=ans*3+1;
            }
        }
        System.out.print(ans+" ");

        in.close();
    }
}