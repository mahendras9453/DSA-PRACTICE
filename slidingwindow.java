import java.util.*;

public class slidingwindow {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter the size of the array");
        int n=sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
         System.out.println(" enter the value of k");
        int k=sc.nextInt();
        int sum=0;
        for(int i=0; i<k ;i++){

            sum+=arr[i];
          
        }
       System.out.println(sum);
        for(int i=k;i<arr.length;i++){
            sum+=arr[i]-arr[i-k];
            System.out.println(sum);
        }

    }
    
}
