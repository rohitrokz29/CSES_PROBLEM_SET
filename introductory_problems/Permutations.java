package introductory_problems;

import java.util.*;
import java.io.*;

public class Permutations {
    

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n==1) System.out.println(1);
        else if(n<4) System.out.println("NO SOLUTION");
        else if(n==4) System.out.println("2 4 1 3");    
        else{
            for(int i=1;i<=n;i+=2) System.out.print(i+" ");
            for(int  i=2;i<=n;i+=2){
                System.out.print(i);
                if(i+2<=n)System.out.print(" ");
            }
        }

     

        in.close();
    }
}
