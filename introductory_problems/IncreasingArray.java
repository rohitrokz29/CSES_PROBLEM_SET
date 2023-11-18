package introductory_problems;

import java.util.Scanner;

public class IncreasingArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        long moves=0;
        int prev=0;
        for(int i=0;i<n;i++){
            if(arr[i]<prev){
                moves+=(prev-arr[i]);
                arr[i]=prev;
            }
            prev=arr[i];
        }
        System.out.println(moves);
        in.close();
    }
}
