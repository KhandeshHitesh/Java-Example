import  java.util.*;
class Node1{
    int data;
    Node1 next;
    Node1(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList1{
    Node1 head;
    Node1 temp=null;
    void addNode(int data){
        if (head==null){
            head=new Node1(data);
            temp=head;
        }
        else{
            temp.next=new Node1(data);
            temp=temp.next;
        }
    }
}

public class MidEle {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        LinkedList1 ll=new LinkedList1();
        int n=inp.nextInt();
        int i=0;
        while(i<n){
            ll.addNode(inp.nextInt());
            i=i+1;
        }
        if (n>2) {
            Node1 ptr1 = ll.head;
            Node1 ptr2 = ll.head;
            while (ptr2 != null && ptr2.next != null) {
                ptr1 = ptr1.next;
                ptr2 = ptr2.next.next;
            }
            System.out.println(ptr1.data);
        }
        else{
            System.out.print("less than 2 elements");
        }
    }
}
