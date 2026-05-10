// leetcode(415) add two strings
class Solution {
    public String addStrings(String num1, String num2) {
        int p1= num1.length()-1;
          int p2= num2.length()-1;
          StringBuilder sb= new StringBuilder();
          int c=0;
          while(p1>=0 || p2>=0){
            int s=0,s1=0,s2=0;

            if(p1>=0){
                s1=num1.charAt(p1--)-48;
                 
            }
             if(p2>=0){
                s2=num2.charAt(p2--)-48;
                 
            }
            s=s1+s2+c;
            if(s>9){
                s=s%10;
                c=1;
            }
            else c=0;
           
             sb.append(s);
             
          }
          if(c==1)
             sb.append(1);
          return sb.reverse().toString();
    }
}