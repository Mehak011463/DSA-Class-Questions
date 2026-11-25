class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                st.push(c);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                int top = st.peek();
                if(c==')' && top=='('){
                    st.pop();
                }
                else if(c=='}' && top=='{'){
                    st.pop();
                }
                else if(c==']' && top=='['){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        return st.isEmpty();
        
    }
}