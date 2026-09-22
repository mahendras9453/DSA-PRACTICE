// leetcode 1061 Lexographically smallest string
class Solution {
    public char dfs(HashMap<Character,List<Character>> map,char ch,boolean[] visited){
       
        visited[ch-'a']= true;
        char minchar= ch;
        if(map.containsKey(ch)){
       for(char next : map.get(ch)){
        if(visited[next-'a']==false){
            minchar= (char)Math.min(minchar,dfs(map,next,visited));
        }

       }
        }
       return minchar;
    }
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        int n= s1.length();
        HashMap<Character,List<Character>> map= new HashMap<>();
      
        for(int i=0;i<n;i++){
            char u=s1.charAt(i);
            char v=s2.charAt(i);
            map.putIfAbsent(u,new ArrayList<>());
            map.putIfAbsent(v,new ArrayList<>());
            map.get(u).add(v);
             map.get(v).add(u);
        }
        StringBuilder sb= new StringBuilder();
        for(int j=0;j<baseStr.length();j++){
              boolean[] visited= new boolean[26];
            char ch=baseStr.charAt(j);
            
            char minchar=dfs(map,ch,visited);
            sb.append(minchar);
        }
        return sb.toString();
    }
}