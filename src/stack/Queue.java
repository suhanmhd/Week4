package stack;

public class Queue {
    public  int size;
    Queue(){
        this.size=0;

    }

    public  class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public Node front;
    public Node rear;


//    public void enqueue(int data){
//        Node newnode = new Node(data);
//        if(rear==null){
//            front=rear=newnode;
//            return;
//        }
//        else{
//            rear.next=newnode;
//            rear=newnode;
//        }
//    }


    public void enqueue(int data){

        Node newnode = new Node(data);
        if(rear==null){
            front=rear=newnode;
            size++;
            return;

        }
        else{
            rear.next=newnode;

            rear=newnode;
            size++;
            int k=size;
            while (k>1){
                rear.next=front;
                front=front.next;
                rear=rear.next;
                rear.next=null;
                k--;
            }
        }
    }


    public void dequeue(){
        if(front==null){
            System.out.println("Queue is empty:");
            return;
        }
        else{
            front = front.next;
        }
        if(front==null){
            rear=null;
        }
    }

    public void display(){
        Node temp=front;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.display();
        System.out.println();
        queue.dequeue();
        queue.dequeue();
        queue.display();

    }
}
