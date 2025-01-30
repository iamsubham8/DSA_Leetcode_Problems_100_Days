// 1464. Maximum Product of Two Elements in an Array
// Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).
 
class Solution {
    
    public int maxProduct(int[] nums) {
        int smax = -1;
        int max = -1;

        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                smax = max;
                max = nums[i];
            }
            else if(smax<nums[i]){
                smax = nums[i];
            }
        }
        int ans = (max-1)*(smax-1);
        return ans;
    }
}
