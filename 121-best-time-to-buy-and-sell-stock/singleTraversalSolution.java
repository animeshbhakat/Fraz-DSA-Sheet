class Solution {
    public int maxProfit(int[] prices) {
        int answer=0;
        int minEnding=prices[0];
        for(int i=1; i<prices.length; i++){
            answer = Math.max(answer, prices[i]- minEnding);
            minEnding = Math.min(minEnding, prices[i]);
        }
        return answer;
        
    }
}
