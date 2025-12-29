class whileloop {
    public int reverse(int x) {
        int d,reverse=0;
        while(x!=0){
            d=x%10;
            if(reverse>Integer.MAX_VALUE/10 || reverse<Integer.MIN_VALUE/10){
                return 0;
            }
            reverse=(reverse*10)+d;
            x=x/10;
        }
        return reverse;   
    }
}