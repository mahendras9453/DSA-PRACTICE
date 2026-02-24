//leetcde (205)   isomorphic string
class isomorphucstring {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char c2 = t.charAt(i);

        
            if (mapS[c] != mapT[c2]) return false;

         
            mapS[c] = i + 1;
            mapT[c2] = i + 1;
        }
        return true;

    }
}