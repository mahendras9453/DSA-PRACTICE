// leetcode 2124  check if all A's Appears before all B's
class Solution {
    public boolean checkString(String s) {
        boolean a=true;
        int index=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b'){
                index=i;
                break;
            }
        }
        if(index==-1) return true;
        for(int i=index;i<s.length();i++){
            if(s.charAt(i)=='a') {
                a=false;
                break;
            }
        }
        
        return a;
    }
}