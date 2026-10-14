import java.util.*;

public class stringPalindrome {

    public static void main(String[] args) {
        String s = "madam";
        Deque<Character> dq = new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            dq.addFirst(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while(!dq.isEmpty()){
            sb.append(dq.removeFirst());
        }
        String original = s;
        String reversed = sb.toString();
        if(original.equals(reversed)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
    
}
