// leetcode(1009)  complement of base 10 integer
class Solution {
    public int bitwiseComplement(int n) {
        if(n==0){
            return 1;
        }

        int[] binary=new int[32];
        int index=0;
        while(n>0){
            binary[index]=n%2;
            n=n/2;
            index++;


        }
        int[] rev=new int[32];
        for(int i=0;i<binary.length;i++){
            if(binary[i]==0){
                rev[i]=1;
            }
            else{
                rev[i]=0;
            }
        }
         int dnum=0;
         int power=0;
         for (int i = 0; i < index; i++) {
            dnum += rev[i] * (int)Math.pow(2, power);
            power++;
        }
      return dnum;
      
    }
}
