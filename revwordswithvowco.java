// leetcode(3775 )/reverse-words-with-same-vowel-coun
class Solution {
    public String reverseWords(String s) {
       String[] words = s.split(" ");
        int targetCount = countVowels(words[0]);

        for (int i=1; i< words.length; i++) {
            if (countVowels(words[i]) == targetCount) {
                words[i]= new StringBuilder(words[i]).reverse().toString();
            }
        }

        return String.join(" ", words);
    }

    private int countVowels(String word) {
        int count = 0;
        for (char c: word.toCharArray()) {
            if ("aeiou".indexOf(c) !=-1) {
                count++;
            }
        }
        return count;
 
    }
}
