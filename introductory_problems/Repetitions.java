package introductory_problems;

import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String dna=in.nextLine();
        int ans=1;
        char prev=dna.charAt(0);
        int currLen=1;
        for(int i=1;i<dna.length();i++){
            if(dna.charAt(i)!=dna.charAt(i-1)){
                currLen=1;
            }
            else{
                currLen++;
            }
                ans=Math.max(ans,currLen);
                prev=dna.charAt(i);
        }
        System.out.println(ans);
        in.close();
    }
}
