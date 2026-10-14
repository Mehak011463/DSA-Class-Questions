class MyStack {
    private int[] stack;
    private int capacity;
    private int top;

    MyStack(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }

    void push(int val) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        top++;
        stack[top] = val;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int value = stack[top];
        top--;

        return value;
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return stack[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    int size() {
        return top + 1;
    }

    void display() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i]);
        }
    }
}


public class daily_temperatures {

    public static void main(String[] args) {

        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};

        int n = temperatures.length;

        int[] ans = new int[n];

        MyStack s = new MyStack(n);

        for (int i = 0; i < n; i++) {

            while (!s.isEmpty() &&
                   temperatures[i] > temperatures[s.peek()]) {

                int previousIndex = s.pop();

                ans[previousIndex] = i - previousIndex;
            }

            s.push(i);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}