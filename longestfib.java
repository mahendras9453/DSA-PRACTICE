// leetcode problem(873) lentgh of longest fibnocci sequence
import java.util.*;
import java.util.HashSet;
class longestfib {
    
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        Set<Integer> set= new HashSet<>();
        for(int e : arr){
            set.add(e);
        }
        int max=arr[n-1];
        int maxlength =0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int newsum= arr[i] +arr[j];
                int prevsum=arr[j];
                int count=2;
                while(newsum<= max && set.contains(newsum)){
                    int temp=newsum;
                    newsum=newsum + prevsum;
                    prevsum= temp;
                    count++;
                }
                maxlength =Math.max(maxlength,count);
            }
        }
        return maxlength >2 ? maxlength : 0;
    }
}