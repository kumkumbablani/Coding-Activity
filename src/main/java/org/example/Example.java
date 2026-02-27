package org.example;

public class Example {
    public static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void reverse(Node head){
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr = prev;
            prev = next;
        }
    }

    public static Node getMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //mid node
    }
    public static boolean isPalindrome(){
        //find mid
        Node mid = getMid(head);

        //reverse second half
        Node prev = null;
        Node curr = mid;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            curr = prev;
            prev = next;
        }
        Node left = head;
        Node right = prev;
        //compare left and right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(5);
        ll.addLast(4);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);
        ll.print();
        ll.reverse();
        ll.print();
        System.out.println(ll.checkPalindrome());
    }
}
