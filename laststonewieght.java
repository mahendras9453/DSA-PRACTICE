// leetcode 1046 Last stone weight 
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxheap= new PriorityQueue<>((a,b) -> b-a);
        for(int stone : stones){
            maxheap.add(stone);
        }
         while(maxheap.size()>1){
            int y= maxheap.poll();
            int  x= maxheap.poll();
            if(x!=y){
                maxheap.add(y-x);
            }

         }
         return maxheap.isEmpty() ?  0 : maxheap.poll();
    }
}