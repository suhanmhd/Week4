package stack;

public class Stack {

    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }

    }

    public Node top=null;


    public void push(int data){
        Node newnode = new Node(data);

        if(top==null){
            top=newnode;
        }
        else{
            newnode.next=top;
            top=newnode;
        }

    }

    public void pop(){

        if(top==null){
            System.out.println("Stack is under flow");
            return;

        }
        else{
            top=top.next;

        }

    }

    public  void display(){
        Node temp = top;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.display();
        stack.pop();
       stack.display();
    }

}
