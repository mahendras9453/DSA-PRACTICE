//leetcode (8)  string to integer
class stringtoint {
    public int myAtoi(String s) {
       int i = 0, sign = 1, n = s.length();
        long res = 0;

     
        while (i<n && s.charAt(i) == ' ') i++;

      
        if (i<n && (s.charAt(i) == '+' || s.charAt(i) == '-'))
            sign = (s.charAt(i++) == '-') ? -1 : 1;

        
        while (i < n && Character.isDigit(s.charAt(i))) {
            res = res * 10 + (s.charAt(i++) - '0');
            if (res * sign <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if (res * sign >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
        }

        return (int)(res * sign);
    }
}