//lletcode problem number (66) Plus one 
class plusone {
    public int[] plusOne(int[] digits) {
       int  n=digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[]Newnumber=new int[n+1];
        Newnumber[0]=1;
        return Newnumber;
    }
}