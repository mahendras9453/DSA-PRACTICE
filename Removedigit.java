// atcoder problem remove digit
import java.util.*;
 
public class Main {
  static int[] dp;
  public static int solve(int num ){
 if(num==0) return 0;
 
 if(dp[num]!=-1) return dp[num];
 
int maxdigit=Integer.MIN_VALUE;
int temp= num;
while (temp>0) {
            int d=temp % 10;
            if (d>maxdigit) {
                maxdigit = d;
            }
            temp=temp / 10;
        }
 
 return dp[num]= 1+ solve(num- maxdigit);
  }
 
  
    public static void main(String[] args) {
     Scanner sc= new Scanner (System.in);
    
     int num=sc.nextInt();
      dp= new int[num+1];
      Arrays.fill(dp,-1);
     System.out.println(solve(num));
 
    }
}