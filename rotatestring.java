//leetcode (796) rotate string
class rotatestring {
    public boolean rotateString(String s, String goal) {
        int m=s.length();
        
        
        for(int i=0;i<m;i++){
             String s1=s.substring(i)+s.substring(0,i);
            if(areStringsEqual(s1,goal)){
               return true;
            }

        }
        return false;
    }
   public static boolean areStringsEqual(String s,String goal){
        if(s.length()!=goal.length())  return false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=goal.charAt(i)) return false;
           
        }
        return true;
    }
}
