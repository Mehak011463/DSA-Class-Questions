class Solution {
    public int longestOnes(int[] nums, int k) {

        int maxLength = 0;
        int left =0;
        int zeros = 0;
        for(int right = 0;right<nums.length;right++){
            if(nums[right]==0){
                zeros++;
            }
            while(zeros>k){
                 if(nums[left]==0){
                    zeros--;
                 }
                 left++;
            }
            int length = right-left+1;
            maxLength = Math.max(maxLength,length);
        }
        return maxLength;
        
    }
}