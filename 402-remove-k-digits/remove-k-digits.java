class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        for(char digit : num.toCharArray()){
            while(!stack.isEmpty() && k>0 && stack.peek()>digit){
                stack.pop();
                k--;
            }
            stack.push(digit);
        }
        while(k>0){
            stack.pop();
            k--;
        }
        StringBuilder res = new StringBuilder();
        for(char digit : stack){
            res.append(digit);
        }
        int i=0;
        while(i<res.length() && res.charAt(i)=='0'){
            i++;
        }
        res=res.delete(0,i);
        if(res.length()==0){
            return "0";
        } 
        return res.toString();
    }
}