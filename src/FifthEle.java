import  java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head;
    Node temp=null;
    void addNode(int data){
        if (head==null){
            head=new Node(data);
            temp=head;
        }
        else{
            temp.next=new Node(data);
            temp=temp.next;
        }
    }
}

public class FifthEle {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        LinkedList ll=new LinkedList();
        while (true){
            int d=inp.nextInt();
            if (d>-1)
                    ll.addNode(d);
            else
                break;
        }
        int n=inp.nextInt();
       int i=0;
       Node ptr1=ll.head;
       Node ptr2=ll.head;
        while (i<n){
            if (ptr2==null)
                break;
            ptr2=ptr2.next;
            i++;
        }
        if (ptr2==null)
            System.out.print("Length of Linked List is less than given nth length");
        else {
            while (ptr2 != null) {
                ptr1 = ptr1.next;
                ptr2 = ptr2.next;
            }
            System.out.print(ptr1.data);
        }
    }
}
