// leetcode (973)  Kth closest Points to origin
import java.util.*;
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int []> maxheap= new PriorityQueue<>(
            (a,b) -> distance(b)-distance(a)
        );

        for(int[] point : points){
            maxheap.add(point);
            if(maxheap.size()>k){
                maxheap.poll();
            }
        }
        int [][] arr= new int [k][2];
        for(int i=0;i<k;i++){
            arr[i]=maxheap.poll();
        }
        return  arr;
    }
    private int distance (int[] point ){
        return point[0]*point[0]+point[1]*point[1];
    }
}