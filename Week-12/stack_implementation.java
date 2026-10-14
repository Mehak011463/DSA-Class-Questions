class MyStack{
    private int[] stack;
    private int capacity;
    private int top;
    MyStack(int capacity){
        this.capacity=capacity;
        stack = new int[capacity];
        top = -1;
        
    }
    void push(int val){
        if(top==capacity-1){
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        stack[top]=val;
    }
    int pop(){
        if(top==-1){
            System.out.println("Stack Underflow");
            return -1;
        }
        int value = stack[top];
        top--;
        return value;
    }
    int peek(){
        if(top==-1){
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top];
    }
    boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }
    int size(){
        return top+1;
    }
    void display(){
        for(int i=0;i<=top;i++){
            System.out.println(stack[i]);
        }
    }

}


public class stack_implementation {
    public static void main(String[] args) {
        MyStack s = new MyStack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s.size());
        s.display();
        s.pop();
        s.pop();
        s.display();
        System.out.println(s.size());

    }
}
