
//leetcode problem (1614) max nested depth of the parenthsis
class maxnestdepth {
    public int maxDepth(String s) {
       int cd=0, maxd=0;
       for(char c : s.toCharArray()){
        if(c=='('){
            cd++;
            maxd=Math.max(maxd,cd);

        }
        else if( c==')') cd--;
       }
       return maxd;
    }
}