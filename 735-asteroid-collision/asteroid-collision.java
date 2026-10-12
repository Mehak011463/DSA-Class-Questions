class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> st = new Stack<>();
        for(int curr : asteroids){
            boolean alive = true;
            while(alive && !st.isEmpty() && st.peek()>0 && curr<0){

                if(st.peek()<Math.abs(curr)){
                    st.pop();
                }
                else if(st.peek() == Math.abs(curr)){
                    st.pop();
                    alive = false;
                }
                else{
                    alive = false;
                }

            }
            if(alive){
                st.push(curr);
            }
            
        }
        int[] ans = new int[st.size()];
        for(int i=0;i<st.size();i++){
            ans[i]=st.get(i);
        }
        return ans;
        
    }
}