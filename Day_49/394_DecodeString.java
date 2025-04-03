// 394. Decode String
// Given an encoded string, return its decoded string.
// The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
// You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].
// The test cases are generated so that the length of the output will never exceed 105.
// https://leetcode.com/problems/decode-string/


class Solution {
    public String decodeString(String s) {
        Stack<Integer> numberStack = new Stack<>();
        Stack<String> mainStack = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch>='0' && ch<='9'){ // identifing it is a number
                int num = 0 ;

                while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9'){
                    num = num * 10  + (int)(s.charAt(i)-'0');
                    i++;
                }
                i--; // to maintain the loop variable
                numberStack.push(num);
            }else if ( ch != ']'){
                mainStack.push(ch + "");
            }else { // condition for ']'
                String str = "";
                while(!mainStack.peek().equals("[")){
                    str = mainStack.pop() + str ;
                }
                mainStack.pop();
                int repetationNumber = numberStack.pop();

                StringBuilder sb = new StringBuilder("") ;

                while(repetationNumber>0){
                    sb.append(str);
                    repetationNumber--;
                }

                 mainStack.push(sb.toString());
            }
        }

        StringBuilder ans = new StringBuilder("");

        while(mainStack.size()>0){
            ans.insert(0,mainStack.pop());
        }
        return ans.toString();
    }
}


