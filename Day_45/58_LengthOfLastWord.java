// 58. Length of Last Word
// Given a string s consisting of words and spaces, return the length of the last word in the string.
// A word is a maximal substring consisting of non-space characters only.
// https://leetcode.com/problems/length-of-last-word/

class Solution {
    public int lengthOfLastWord(String s) {
          int count = 0 ;

       for(int i=s.length()-1;i>=0;i--){

           char ch = s.charAt(i);

           if(ch!=' '){
               count++;
           }else if ( count!=0){
               break;
           }

       }

       return count ;
    }
}


