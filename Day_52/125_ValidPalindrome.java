// Day – 52
// 125. Valid Palindrome
// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
// Given a string s, return true if it is a palindrome, or false otherwise.
// https://leetcode.com/problems/valid-palindrome/

class Solution {
    public boolean isPalindrome(String s) {
         if(s.length()==1){
            return true ;
        }

        StringBuilder sb = new StringBuilder("");

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if      (ch>='a' && ch<='z'){sb.append(ch);}
            else if ( ch>='A' && ch<='Z')
                {
                    ch = (char)(ch-'A'+'a');
                    sb.append(ch);
                }
            else if ( ch>='0' && ch<='9')
            {
                sb.append(ch);
            }
        }

        int start = 0 ;
        int end = sb.length()-1;

        while(start<end){
            int sChar = sb.charAt(start);
            int eChar = sb.charAt(end);
            if(sChar!=eChar){
                return false;
            }
            start++;
            end--;
        }

        return true ;    
    }
}

