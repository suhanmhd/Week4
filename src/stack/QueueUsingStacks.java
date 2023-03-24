package stack;
import java.util.HashSet;
import java.util.Stack;

public class QueueUsingStacks {

    private  Stack<Integer>stack1 = new Stack<>();
    private Stack<Integer>stack2 = new Stack<>();

        public  void Enqueue(int data){
            stack1.push(data);
        }

        public int dequeue(){
            if(stack2.isEmpty()&&stack1.isEmpty()){
                System.out.println("empty");
                return -1;
            }
            if(stack2.isEmpty()){
                while (!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }

            }
            return stack2.pop();
        }


    public static void main(String[] args) {
        QueueUsingStacks obj = new QueueUsingStacks();
        obj.Enqueue(10);
//        obj.Enqueue(12);
//        obj.Enqueue(14);
        System.out.println(obj.dequeue());
        System.out.println(obj.dequeue());

        HashSet<Character>set = new HashSet<Character>();

    }



}
