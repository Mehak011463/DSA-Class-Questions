

public class queue1 {

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.display();
        q.dequeue();
        q.display();
        q.peek();
    }

    }

class Queue{
        int[] arr;
        int rear;
        int front;
        int size;
        Queue(int size){
            this.size=size;
            arr=new int[size];
            front =-1;
            rear=-1;
        }
        void enqueue(int val){
            if(rear==size-1){
                System.out.println("Queue Overflow");
                return;
            }
            if(front == -1){
                front = 0;
                
            }
            rear++;
            arr[rear]=val;
            System.out.println(val+" inserted");
        }
        void dequeue(){
            if(front == -1 || front > rear){
                System.out.println("Stack Underflow");
                return ;
            }
            System.out.println(arr[front]+" removed");
            front++;

            
        }
        void peek(){
            if(front == -1 || front>rear){
                System.out.println("Queue is Empty");
                return;
            }
            System.out.println(arr[front]);

        }
        void display(){
            if(front == -1 || front>rear){
                System.out.println("Queue is Empty");
                return;
            }
            for(int i=front;i<=rear;i++){
                System.out.println(arr[i]);
            }
        }
    }