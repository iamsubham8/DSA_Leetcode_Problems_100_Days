// 1446. Consecutive Characters
// The power of the string is the maximum length of a non-empty substring that contains only one unique character.
// Given a string s, return the power of s.
// https://leetcode.com/problems/consecutive-characters/

class Solution {
    public int maxPower(String s) {
         int max = 1;
        int count = 1 ;

        for(int i=1 ;i<s.length();i++){
            char curr = s.charAt(i);
            char pre = s.charAt(i-1);

            if(curr==pre ){
                count++;
            }else{
                max = Math.max(max,count);
                count = 1 ;
            }
        }
         max = Math.max(max,count);
         return max ;
    }
}
