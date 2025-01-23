// 9. Palindrome Number
// Given an integer x, return true if x is a palindrome, and false otherwise.
// https://leetcode.com/problems/palindrome-number/


class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int num = x;
        int revNum = 0;
        while(num>0){
            int lastDigit = num%10;
            revNum = revNum*10+lastDigit;
            num = num/10;
        }
        if(revNum == x){
            return true;
        }else{
            return false;
        }
    }
}
