// 1897. Redistribute Characters to Make All Strings Equal
// You are given an array of strings words (0-indexed).
// In one operation, pick two distinct indices i and j, where words[i] is a non-empty string, and move any character from words[i] to any position in words[j].
// Return true if you can make every string in words equal using any number of operations, and false otherwise.
// https://leetcode.com/problems/redistribute-characters-to-make-all-strings-equal/

class Solution {
    public boolean makeEqual(String[] words) {
         int[] fre = new int[26];

        for(int i=0;i<words.length;i++){
            String w = words[i];

            for(int j=0;j<w.length();j++){
                char ch = w.charAt(j);
                int idx = (int)(ch-'a');

                fre[idx]=fre[idx]+1;
            }
        }

        for(int i=0;i<26;i++){

            if(fre[i] % words.length!=0){
                return false;
            }
        }
        return true ;
    }
}
