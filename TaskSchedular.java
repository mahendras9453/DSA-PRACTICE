// leetcode (621)   Task Schedular
import java.util.*;
class Solution {
    
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character, Integer> map= new HashMap<>();
        for(char task : tasks){
            map.put(task ,map.getOrDefault(task,0)+1);

        }
        PriorityQueue<Integer> maxheap= new PriorityQueue<>((a,b) -> b-a);
        maxheap.addAll(map.values());
        int time=0;
        while(!maxheap.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            for(int i=0;i<n+1;i++){
                if(!maxheap.isEmpty()){
                    temp.add(maxheap.poll());
                }
            }
            for(int freq : temp){
                if(--freq>0){
                    maxheap.add(freq);
                }
            }
            time+=maxheap.isEmpty() ? temp.size() : n+1;
        }
        return time;
    }
}