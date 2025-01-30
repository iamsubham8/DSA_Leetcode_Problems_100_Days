// 989. Add to Array-Form of Integer
// The array-form of an integer num is an array representing its digits in left to right order.
// •	For example, for num = 1321, the array form is [1,3,2,1].
// Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.



class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<Integer>();
        int p = num.length-1;
        int carry = 0;

        while(p>=0 || k>0){
            int numValue = 0;
            
            if(p>=0){
                numValue = num[p];
            }

            int d = k%10; // last digits of k
            int sum = numValue + d + carry;

            int digit = sum%10;
            carry = sum/10;

            ans.add(digit);
            
            p--; // shifting the pointer
            k=k/10; // removing last ditgit from k
        }


        if(carry>0){
            ans.add(carry);
        }

        Collections.reverse(ans);
        return ans;
    }
}
