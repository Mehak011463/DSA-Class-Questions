import java.util.ArrayDeque;
import java.util.Deque;

public class reverseString {
    public static void main(String[] args) {

        String s = "Hello";
        Deque<Character> dq = new ArrayDeque<>();
        for(int i=0;i<s.length();i++){

            dq.addFirst(s.charAt(i));

        }
        StringBuilder res = new StringBuilder();
        while(!dq.isEmpty()){
            res.append(dq.removeFirst());
        }
        System.out.println("Original "+s);
        System.out.println("reversed "+res);
        
    }
}
