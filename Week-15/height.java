import java.util.*;
public class height {
    static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data=data;

        }

    }
    static int calculateHeight(Node root){
        if(root == null){
            return 0;

        }
        int leftHeight = calculateHeight(root.left);
        int rightHeight = calculateHeight(root.right);
        return 1+Math.max(leftHeight,rightHeight);
    }
    public static void main(String[] args) {

        Node root =new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(50);
        root.left.right = new Node(60);
        root.right.left = new Node(70);
        root.right.right = new Node(80);
        System.out.println(calculateHeight(root));
        
    }
}
