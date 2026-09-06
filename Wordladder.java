// leetcode 127 wordladder
class Solution {
    public List<String> getneighbours(String word,HashSet<String> set){
         List<String> neighbours= new ArrayList<>();
         for(int i=0;i<word.length();i++){
            for(char ch='a';ch<='z';ch++){
                String newword= word.substring(0,i)+ ch + word.substring(i+1,word.length());
                if(set.contains(newword)){
                    neighbours.add(newword);
                }
            }
         }
         return neighbours;
    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set= new HashSet<>(wordList);
        if(!set.contains(endWord)) return 0;
        Queue<String> q= new LinkedList<>();
        q.offer(beginWord);
        if(set.contains(beginWord)){
            set.remove(beginWord);
        }
        int level=1;
        while(!q.isEmpty()){
            int currh=q.size();
            
            for(int i=0;i<currh;i++){
                String node= q.poll();
                if(node.equals(endWord)) return level;
                List<String> neighbours= getneighbours(node,set);
                for(String word : neighbours){
                    if(set.contains(word)){
                        q.offer(word);
                        set.remove(word);
                    }
                }


            }
            level++;
        }

        return 0;
    }
}