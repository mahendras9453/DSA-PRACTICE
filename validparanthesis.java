//leetcode problem(1021) valid parenthesis
class validparanthesis {
    public String removeOuterParentheses(String s) {
        int count=1,x=1;
        String s1=new String();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') count++;
            else count--;
            if(count==1){
                s1+=s.substring(x,i);
                x=i+2;
            }
        }
        return s1;
    }
}
