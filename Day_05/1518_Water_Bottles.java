// 1518. Water Bottles
// There are numBottles water bottles that are initially full of water. You can exchange numExchange empty water bottles from the market with one full water bottle.
// The operation of drinking a full water bottle turns it into an empty bottle.
// Given the two integers numBottles and numExchange, return the maximum number of water bottles you can drink.
 

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;

        while(numBottles>=numExchange){

            int newBottles = numBottles / numExchange;
            int remBottles =  numBottles % numExchange;
            ans = ans + newBottles;
            numBottles = newBottles + remBottles;
        }
        return ans;
    }
}

