package introductory_problems;

import java.io.*;
import java.util.*;
/**
 * MissingNumer
 */
public class MissingNumer {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n-1;i++){
            int x=in.nextInt();
            set.add(x);
        }        
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                System.out.println(i);
                break;
            }
        }
        in.close();
    }
}