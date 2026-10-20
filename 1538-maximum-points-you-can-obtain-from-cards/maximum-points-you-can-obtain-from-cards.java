class Solution {
    public int maxScore(int[] cardScore, int k) {
        //your code goes here
        
        int sum =0;
        for(int i=0;i<k;i++){

            sum+=cardScore[i];

        }
        int maxScore = sum;
        for(int i=0;i<k;i++){
            sum-=cardScore[k-1-i];
            sum+=cardScore[cardScore.length-1-i];
            
            maxScore = Math.max(maxScore,sum);
        }
        return maxScore;
    }
}