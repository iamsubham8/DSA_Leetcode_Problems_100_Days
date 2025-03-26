// 1491. Average Salary Excluding the Minimum and Maximum Salary
// You are given an array of unique integers salary where salary[i] is the salary of the ith employee.
// Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted.

// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/

class Solution {
    public double average(int[] salary) {
        int max = salary[0];
        int min = salary[0];
        int sum = salary[0];

        for(int i=1;i<salary.length;i++){

            if(max<salary[i]){
                max=salary[i];
            }

            if(min>salary[i]){
                min=salary[i];
            }

            sum = sum + salary[i];
        }

        sum = sum - min - max ;

        double ans = (double)sum/(salary.length-2);
        return ans ;
    }
}


