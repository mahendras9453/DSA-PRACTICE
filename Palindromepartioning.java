// leetcode 131 Palindrome partioniong
class Solution {
    static boolean ispalindrome(String s, int l,int h){
        while(l<h){
            if(s.charAt(l)!=s.charAt(h)) return false;
            l++;
            h--;
        }
        return true;
    }
    static void backtracking(String s, int idx,List<String> temp,List<List<String>> result){
        if(idx==s.length()){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=idx;i<s.length();i++){
            if(ispalindrome(s,idx,i)){
                temp.add(s.substring(idx,i+1));
                backtracking(s,i+1,temp,result);
                temp.remove(temp.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> result= new ArrayList<>();
        List<String> temp=new ArrayList<>();
        backtracking(s,0,temp,result);
        return result;


        
    }
}