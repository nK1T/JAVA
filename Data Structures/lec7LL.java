class lec7LL{
    Node head;
    private int size=0;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    //1.add at first
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    //2.add at last
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node curr = head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
    }

    //3.print list
    public void printList(){
        if(head==null){
            System.out.println("EMPTY LIST");
            return;
        }
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("null");
    }

    //4.remove from first
    public void removeFirst(){
        if(head==null){
            System.out.println("EMPTY LIST");
            return;
        }
        size--;
        head=head.next;
    }

    //5.remove last
    public void removeLast(){
        if(head==null){
            System.out.println("empty list");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node lastNode=head.next;
        Node slastNode = head;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            slastNode=slastNode.next;
        }
        slastNode.next=null;
    }

    //6.get size
    public void getSize(){
        System.out.println(size);;
    }

    //7.reverse a list
    public void reverseList(){
        if(head==null && head.next==null){
            return;
        }
        Node prev=head;
        Node curr=head.next;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head.next=null;
        head=prev;

    }
    
    public static void main(String args[]){
        lec7LL list = new lec7LL();
        list.addFirst("hello");
        list.addLast("friends");
        list.addLast("gm");
        list.addFirst("1");
        list.printList();
        list.getSize();
        list.removeFirst();
        list.printList();
        list.getSize();
        list.removeLast();
        list.printList();
        list.getSize();
        list.reverseList();
        list.printList();
    }
}