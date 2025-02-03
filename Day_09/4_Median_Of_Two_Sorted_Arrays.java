// 4. Median of Two Sorted Arrays
// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
// The overall run time complexity should be O(log (m+n)).
// https://leetcode.com/problems/median-of-two-sorted-arrays/description/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans = merge(nums1,nums2);
        
        if(ans.length % 2 ==0){
            double ans1 = (double) (ans[ans.length/2]+ ans[ans.length/2 - 1])/2;
            return ans1;
        }
        else{
            double ans1 = (double) (ans[ans.length/2]);
            return ans1;
        }
    }

    public int[] merge(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        while(p1<arr1.length || p2<arr2.length){
            int val1 = p1<arr1.length ? arr1[p1] : Integer.MAX_VALUE;
            int val2 = p2<arr2.length ? arr2[p2] : Integer.MAX_VALUE;
            
            if(val1<val2){
                arr3[p3] = val1;
                p1++;
            }
            else{
                arr3[p3] = val2;
                p2++;
            }
            p3++;
        }
        return arr3;
    }

}
