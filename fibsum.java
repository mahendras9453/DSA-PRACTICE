// leetcode problem (509) using recursion
class fibsum {
    public int fib(int n) {
       
        return fibb(n);
    }
    private int fibb(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else return fibb(n-1)+fibb(n-2);
    }
}