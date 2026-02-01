// code to convert the binary number to decimal
import java.util.*;
public class binarytodecimal {
    public static void main(String[] args) {
        System.out.println("Enter any binary number ");
        Scanner scn=new Scanner(System.in);
        long bnum=scn.nextLong();
        long dnum=0l;
        long count=0l;
        while(bnum>0){
            long d=bnum % 10;
            
            dnum+= d*(Math.pow(2, count));
            bnum=bnum/10;
            count++;
        }

        System.out.println(dnum);
    }
    
}
