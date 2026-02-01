import java.util.Scanner;
public class sumuntilonedigit {
    public static void main(String[] args) {
        Scanner scn =new Scanner (System.in);
        long num=scn.nextLong();
        Long sum=0l;
        int temp=0;
        while(num>10){
           sum+=num%10;
           num=num/10;
           
               
            
        }

        while(sum!=0){
         temp+=sum%10;
          sum=sum/10;
        }
         
       
        System.out.println("sum of digit   "+ temp);

    }
    
}
