class Solution {
    public int[] nextSmallerElement(int[] heights){

        int n = heights.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
               ans[i]=n;
            }
            else{
                ans[i]=st.peek();
            }
            st.push(i);
        }
        return ans;

    }
        public int[] prevSmallerElement(int[] heights){

        int n = heights.length;
        int[] ans1 = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
               ans1[i]=-1;
            }
            else{
                ans1[i]=st.peek();
            }
            st.push(i);
        }
        return ans1;

    }
    public int largestRectangleArea(int[] heights) {

         int n = heights.length;
         int[] next = nextSmallerElement(heights);
         int[] prev = prevSmallerElement(heights);
         int maxArea = 0;
         for(int i=0;i<n;i++){
            int length = heights[i];
            int width = next[i]-prev[i]-1;
            int area = length*width;
            maxArea = Math.max(maxArea,area);

         }
         return maxArea;
        
    }
}