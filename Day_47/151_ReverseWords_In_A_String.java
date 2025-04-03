// 151. Reverse Words in a String
// Given an input string s, reverse the order of the words.
// A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
// Return a string of the words in reverse order concatenated by a single space.
// Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
// https://leetcode.com/problems/reverse-words-in-a-string/

class Solution {
    public String reverseWords(String s) {
      String[] arr = s.split("\\s+"); // split on the basis of spaces
      StringBuilder sb = new StringBuilder("");

      for(int i=arr.length-1;i>=0;i--){
          sb.append(arr[i] + " ");
      }

      // trim function --> remove trailing and leading spaces

      String ans = sb.toString();
      ans = ans.trim();
      return ans ;
    }
}

