import java.util.*;
public class lec8Stack{
    // //(a).Using LinkedList
    //Step2-create Node
    // public static class Node{
    //     int data;
    //     Node next;
    //     Node(int data){
    //         this.data=data;
    //         next=null;
    //     }
    // }
    // //Step3-create stack
    // public static class Stack{
    //     public static Node head;
    //     //Step4-create isEmpty()
    //     public static boolean isEmpty(){
    //         return head==null;
    //     }
    //     //Step5-create push()
    //     public static void push(int data){
    //         Node newNode = new Node(data);
    //         if(isEmpty()){
    //             head=newNode;
    //             return;
    //         }
    //         newNode.next=head;
    //         head=newNode;
    //     }
    //     //Step6-create pop()
    //     public static int pop(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         int top=head.data;
    //         head=head.next;
    //         return top;
    //     }
    //     //Step7-create peek()
    //     public static int peek(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         return head.data;
    //     }
    // }
    // //Step1-create main
    // public static void main(String args[]){
    //     Stack stk = new Stack();
    //     stk.push(53);
    //     stk.push(5);
    //     stk.push(3);
    //     while(!stk.isEmpty()){
    //         System.out.println(stk.peek());
    //         stk.pop();
    //     }
    // }


    //(b).Using ArrayList
    //Step2-create stack
//     public static class Stack{
//         static ArrayList<Integer> stk = new ArrayList<>();
//         //Step3-create isEmpty()
//         public static boolean isEmpty(){
//             return stk.size()==0;
//         }
//         //Step4-create push()
//         public static void push(int data){
//             stk.add(data);
//         }
//         //Step5-create pop()
//         public static int pop(){
//             int top=stk.get(stk.size()-1);
//             stk.remove(stk.size()-1);
//             return top;
//         }
//         //Step6-create peek()
//         public static int peek(){
//             return stk.get(stk.size()-1);
//         }
//     }
    
//     //Step1-create main
//     public static void main(String args[]){
//         Stack stk = new Stack();
//             stk.push(53);
//             stk.push(34);
//             stk.push(3);
//             while(!stk.isEmpty()){
//                 System.out.println(stk.peek());
//                 stk.pop();
//             }
//     }
    //(c)Using collection frameworks
    // public static void main(String args[]){
    //     Stack<Integer> stk = new Stack(); //just create Stack
    //         stk.push(53);
    //         stk.push(4);
    //         stk.push(3);
    //         while(!stk.isEmpty()){
    //             System.out.println(stk.peek());
    //             stk.pop();
    //         }
    // }

    //Q1-Push at bottom of satck
    // public static void pushAtbottom(int data,Stack<Integer> stk){
    //     if(stk.isEmpty()){
    //         stk.push(data);
    //         return;
    //     }
    //     int top=stk.pop();
    //     pushAtbottom(data, stk);
    //     stk.push(top);
    // }
    // public static void main(String args[]){
    //     Stack<Integer> stk = new Stack(); //just create Stack
    //         stk.push(53);
    //         stk.push(4);
    //         stk.push(3);
    //         pushAtbottom(543, stk);
    //         stk.push(658);
    //         while(!stk.isEmpty()){
    //             System.out.println(stk.peek());
    //             stk.pop();
    //         }
    // }

    //Q2-Reverse a stack
    public static void pushAtbottom(int data,Stack<Integer> stk){
        if(stk.isEmpty()){
            stk.push(data);
            return;
        }
        int top=stk.pop();
        pushAtbottom(data, stk);
        stk.push(top);
    }
    public static void reverseStack(Stack<Integer> stk){
        if(stk.isEmpty()){
            return;
        }
        int top = stk.pop();
        reverseStack(stk);
        pushAtbottom(top, stk);
    }
    public static void main(String args[]){
        Stack<Integer> stk = new Stack(); //just create Stack
            stk.push(53);
            stk.push(4);
            stk.push(3);
            stk.push(658);
            System.out.println("AFTER REVERSE");
            reverseStack(stk);
            while(!stk.isEmpty()){
                System.out.println(stk.peek());
                stk.pop();
            }
    }
}