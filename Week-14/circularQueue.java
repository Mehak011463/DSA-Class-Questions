import java.util.*;

public class circularQueue {

    static class Circular{
        int[] arr;
        int front, rear , size , capacity;
        Circular(int capacity){
            this.capacity=capacity;
            arr = new int[capacity];
            front = 0;
            rear = -1;
            size=0;
        }
        void enqueue(int val){
            if(size == capacity){
                System.out.println("Queue is full");
                return;
            }
            rear = (rear+1)%capacity;
            arr[rear]=val;
            size++;
            System.out.println("Inserted value "+val);
        }
        void deque(){
            if(size==0){
                System.out.println("Queue is Empty");
                return;
            }
            System.out.println("removed "+arr[front]);
            front = (front+1)%capacity;
            size--;
        }
        void display(){
            if(size==0){
                System.out.println("Queue is Empty");
                return;
            }
            System.out.println("Queue: ");
            for(int i=0;i<capacity;i++){
                int index = (front+i)%capacity;
                System.out.print(arr[index]+" ");
            }
        }
    }
    public static void main(String[] args) {

        Circular q = new Circular(4);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        
        q.display();
        q.deque();
        q.deque();
        q.enqueue(5);
        q.enqueue(6);
        q.display();
        q.deque();
        q.deque();
        q.deque();
        q.enqueue(7);
        q.enqueue(8);
        q.enqueue(9);
        q.display();
        
        
    }
}
