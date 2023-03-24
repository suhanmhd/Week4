package sorting;

public class MergeList {
    public class ListNode {

        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }
        public ListNode head = null;



        public void add(int data){
            ListNode temp=head;
            ListNode newnode = new ListNode(data);

            if (head==null){
                head=newnode;
            }
            else {
                while (temp.next!=null){
                    temp=temp.next;
                }
                temp.next=newnode;
            }
        }

    public  void display(){
        ListNode temp=head;

        while (temp!=null){
            System.out.print(temp.data+">>");
            temp=temp.next;
        }
    }


    public ListNode sortList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        // if(head==null ||head.next==null){
        //     return head;
        // }


        // ListNode temp=null;
        // ListNode fast = head;
        // ListNode slow = head;
        //     while(fast!=null && fast.next!=null){
        //         temp=slow;
        //     fast=fast.next.next;
        //     slow=slow.next;
        // }
        // temp.next=null;


        ListNode mid =middle(head);

        ListNode left =sortList(head);
        ListNode right = sortList(mid);




        return merge(left,right);
    }


    public ListNode middle(ListNode head){
        ListNode fast=head;
        ListNode slow = head;
        ListNode temp = null;

        while(fast!=null && fast.next!=null){
            temp=slow;
            fast=fast.next.next;
            slow=slow.next;
        }

        temp.next=null;
        return slow;
    }


    ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                tail.next = list1;
                list1 = list1.next;

            } else {
                tail.next = list2;
                list2 = list2.next;

            }
            tail = tail.next;
        }
        tail.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;
    }
      public void mergecall(){
            ListNode sorted=sortList(head);
            while (sorted!=null){
                System.out.println(sorted.data);
                sorted=sorted.next;
            }

      }


    public static void main(String[] args) {
        MergeList list=new MergeList();
        list.add(10);
        list.add(67);
        list.add(3);
        list.add(22);
        list.add(11);
        list.add(1);



        list.display();
//        ListNode ls = list.sortList(list.head);
//        list.display();
        list.mergecall();

    }

}
