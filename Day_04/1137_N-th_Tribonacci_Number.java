// 1137. N-th Tribonacci Number The Tribonacci sequence Tn is defined as follows:T0=0,T1=1,T2=1,and Tn+3=Tn+Tn+1+Tn+2 for n>=0. Given n,return the value of Tn.

class Solution {
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }else if(n==1 || n==2){
            return 1;
        }else{
            int firstTerm=0;
            int secondTerm=1;
            int thirdTerm=1;
            for(int i=1;i<=n;i++){
                int fourthTerm = firstTerm + secondTerm + thirdTerm;
                firstTerm = secondTerm;
                secondTerm = thirdTerm;
                thirdTerm = fourthTerm;
            }
            return firstTerm;
        }    
    }
}

