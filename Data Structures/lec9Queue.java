import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class lec9Queue{
    //1.Queue using Array
    //step2-create stack class
    // static class Queue{
    //     static int arr[];
    //     static int size;
    //     static int rear=-1;
    //     Queue(int size){
    //         this.size = size;
    //         arr = new int[size];
    //     }       
    //     //step3-create isEmpty()
    //     public static boolean isEmpty(){
    //         return rear==-1;
    //     }
    //     //step4-create isFull()
    //     public static boolean isFull(){
    //         return rear==size-1;
    //     }
    //     //step5-create enqueue(Add) O(1)
    //     public static void add(int data){
    //         if(isFull()){
    //             System.out.println("OVERFLOW");
    //             return;
    //         }
    //         rear++;
    //         arr[rear] = data;
    //     }
    //     //step6-create dequeue(Remove) O(n)
    //     public static int remove(){
    //         if(isEmpty()){
    //             System.out.println("EMPTY");
    //             return -1;
    //         }
    //         int front = arr[0];
    //         for(int i=0;i<rear;i++){
    //             arr[i]=arr[i+1];
    //         }
    //         rear--;
    //         return front;
    //     }
    //     //step7-create front(Peek) O(n)
    //     public static int peek(){
    //         if(isEmpty()){
    //             System.out.println("EMPTY");
    //             return -1;
    //         }
    //         return arr[0];
    //     }
    // }

    //2.Circular Queue using Array
    // static class Queue{
    //     static int arr[];
    //     static int size;
    //     static int rear=-1;
    //     static int front=-1;
    //     Queue(int size){
    //         this.size = size;
    //         arr = new int[size];
    //     }       
    //     //step3-create isEmpty()
    //     public static boolean isEmpty(){
    //         return rear==-1 && front==-1;
    //     }
    //     //step4-create isFull()
    //     public static boolean isFull(){
    //         return (rear+1)%size == front;
    //     }
    //     //step5-create enqueue(Add) O(1)
    //     public static void add(int data){
    //         if(isFull()){
    //             System.out.println("OVERFLOW");
    //             return;
    //         }
    //         //if it's the 1st element
    //         if(front == -1) {
    //             front = 0;
    //         }
    //         rear = rear+1%size;
    //         arr[rear] = data;
    //     }
    //     //step6-create dequeue(Remove) O(1)
    //     public static int remove(){
    //         if(isEmpty()){
    //             System.out.println("EMPTY");
    //             return -1;
    //         }
    //         int result = arr[front];
    //         //if only 1 element is present
    //         if(front == rear) {
    //           front = rear = -1;
    //         } else {
    //             front = (front+1)%size;
    //         }
    //         return result;
    //     }
    //     //step7-create front(Peek) O(1)
    //     public static int peek(){
    //         if(isEmpty()){
    //             System.out.println("EMPTY");
    //             return -1;
    //         }
    //         return arr[front];
    //     }
    // }

    //3.Queue using LinkedList
    // static class Node{
    //     int data;
    //     Node next;
    //     Node(int data){
    //         this.data=data;
    //         next=null;
    //     }
    // }
    // static class Queue{
    //     static Node head=null;
    //     static Node tail=null;
    //     //step3-create isEmpty()
    //     public static boolean isEmpty(){
    //         return head==null && tail==null;
    //     }
    //     //step4-create enqueue(Add)
    //     public static void add(int data){
    //         Node newNode = new Node(data);
    //         if(isEmpty()){
    //             tail=head=newNode;
    //         }else{
    //             tail.next=newNode;
    //             tail=newNode;
    //         }
    //     }
    //     //step5-create dequeue(remove)
    //     public static int remove(){
    //         if(isEmpty()){
    //             System.out.println("EMPTY");
    //             return -1;
    //         }
    //         int front = head.data;
    //         //single node
    //         if(head==tail){
    //             tail=null;
    //         }
    //         head=head.next;
    //         return front;
    //     }

    //     //step6-create front (peek)
    //     public static int peek(){
    //         if(isEmpty()){
    //             System.out.println("EMPTY");
    //             return -1;
    //         }
    //         return head.data;
    //     }
    // // }
    // // //step1-create main
    // public static void main(String args[]){
    //     Queue q = new Queue();
    //     q.add(1);
    //     q.add(2);
    //     q.add(3);
    //     q.add(4);
    //     q.add(5);
    //     while(!q.isEmpty()){
    //         System.out.println(q.peek());
    //         q.remove();
    //     }
    // }

    //4.Using java collection frameworks
    // public static void main(String args[]){
    //     // Queue<Integer> q = new LinkedList<>(); //note:-using linkedlist we create a simple queue
    //     Queue<Integer> q = new ArrayDeque(); //note:-using ArrayDeque we create a dequeu circular queue
    //     q.add(6);
    //     q.add(4);
    //     q.add(5);
    //     q.add(7);
    //     q.remove();
    //     while(!q.isEmpty()){
    //         System.out.println(q.peek());
    //         q.remove();
    //     }
    // }

    //5.implement queue using two stacks
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());                
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public static int remove(){
            return s1.pop();
        }
        public static int peek(){
            return s1.peek();
        }
    }
    public static void main(String args[]){
        Queue q = new Queue();
        q.add(6);
        q.add(4);
        q.add(5);
        q.add(7);
        q.remove();
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}