// leetcode problem(258) add digit unit it becomes one digit
class adddigit {
    public int addDigits(int num) {
        if(num==0){
            return 0;
            
        }
        else if(num%9==0){
            return 9;
        }
        else {
            return num%9;
        }
    }
}