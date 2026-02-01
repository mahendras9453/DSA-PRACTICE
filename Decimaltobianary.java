// Decimal to binary
import java.util.Scanner;
public class Decimaltobianary {
    public static void main(String[] args) {
        System.out.println("Enter any number to conert it into Binary");
        Scanner scn =new Scanner(System.in);
        int num=scn.nextInt();
        int[] binary=new int[32];
        int index=0;
        while(num>0){
            binary[index]=num%2;
            num=num/2;
            index++;


        }
        for(int i=index-1;i>=0;i--){
            System.out.print(binary[i]);
        }



        
    }
    
}
