// leetcode 93  Restore ip address
class Solution {
    public static List<String> result= new ArrayList<>();
    public static boolean isvalid(String s){
        if(s.length()>1 &&s.charAt(0)=='0') return false;
        int num=Integer.parseInt(s);
        return num<=255;
    }
    public static void solve(String s, int idx, int parts, String sb){
        if(idx== s.length() && parts==4){
         result.add(sb.substring(0,sb.length()-1));
            return;
            
        }
       //  if (parts >= 4) return;
        if(idx+1<=s.length()&&  isvalid(s.substring(idx, idx + 1))){
        solve(s,idx+1,parts+1,sb+s.substring(idx,idx+1)+ ".");
        }
        if(idx+2<=s.length() && isvalid(s.substring(idx,idx+2))) solve(s,idx+2,parts+1,sb+s.substring(idx,idx+2)+ ".");
         if(idx+3<=s.length() && isvalid(s.substring(idx,idx+3)))  solve(s,idx+3,parts+1,sb+s.substring(idx,idx+3)+ ".");

        
    }
    public List<String> restoreIpAddresses(String s) {
        result.clear();

      String sb="";
        solve(s,0,0,sb);
        return result;

        
    }
}