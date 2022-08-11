import sun.font.TrueTypeFont;

import java.util.*;
public class To {
    static int check(String s1,String s2,int n1,int n2,int dp[][]){
        if (n1<0 || n2<0 )
            return 0;
        else if(dp[n2][n1]!=-1)
            return dp[n1-1][n2-1];
        else if (s1.charAt(n1)==s2.charAt(n2)){
            return dp[n2][n1]=1+check(s1,s2,n1-1,n2-1,dp);
        }
        else{
            return check(s1,s2,n1-1,n2,dp);
        }

    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        String mainString=inp.nextLine();
        String searchString=inp.nextLine();
        int len1=mainString.length()-1;
        int len2=searchString.length()-1;
        int i=len1;
        int j=len2;
        while (i>-1 && j>-1){
           if (mainString.charAt(i)==searchString.charAt(j)){
               i--;
               j--;
           }
           else{
               i--;
           }}
           if (j==-1){
               System.out.println("Exists");
           }
           else{
               System.out.println("Not Exists");
           }
    }
}
