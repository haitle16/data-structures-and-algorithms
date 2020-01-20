package linkedList;

import java.io.*;
import java.util.StringJoiner;

public class LinkedList {
    // head of linked list
    Node head;

    class Node {
        String value;
        Node next;
        // Constructor
        Node(String n) {
            value = n;
            next = null;
        }
    }

    public void insert(String value){
        Node node = new Node(value);
        if (this.head == null) {
        this.head = node;
        return;
        }else {
            node.next = this.head;
            this.head = node;
        }

    }

    public boolean includes(String value){
//        Node node = new Node(value);
        if(this.head == null) return false;
        Node currentNode = head;
        while(currentNode.next != null){
            if(currentNode.value == value || currentNode.next.value == value) return true;
            currentNode = currentNode.next;
        }
        return false;
    }

    public String toString(){
        if(head == null){
            return "The list is empty!";
        }
        StringJoiner resultStr = new StringJoiner(" } -> { ");
        Node currentNode = head;
        resultStr.add(currentNode.value);
        while(currentNode.next != null){
            resultStr.add(currentNode.next.value);
            currentNode = currentNode.next;
        }
        return "{ " + resultStr.toString() + " } -> NULL";
    }

    public void append(String value){
        Node node = new Node(value);
        if (this.head == null) {
            this.head = node;
            return;
        }
        // set next node equal null
        node.next = null;
        Node last = head;
        while (last.next != null) last = last.next;
        last.next = node;
        return;
    }

    public void insertBefore(String value, String newVal ){
        Node node = new Node(newVal);
        if (this.head == null) {
            this.head = node;
            return;
        }
        Node currentNode = this.head;
        while(currentNode.next != null){
            if(currentNode.next.value == value){
                node.next = currentNode.next;
                currentNode.next = node;
                return;
            }
            currentNode = currentNode.next;
        }
    }

    public void insertAfter(String value, String newVal ){
        Node node = new Node(newVal);
        if (this.head == null) {
            this.head = node;
            return;
        }
        Node currentNode = this.head;
        while(currentNode.next != null){
            if(currentNode.value == value){
                node.next = currentNode.next;
                currentNode.next = node;
                return;
            }
            currentNode = currentNode.next;
        }
    }

    public String kthFromEnd(int k){
        Node currentNode = this.head;
        Node last = this.head;
        int counter = 0;
        while(counter <= k-1){
            last = last.next;
            counter++;
        }
        while(last.next != null){
            currentNode = currentNode.next;
            last = last.next;
            counter++;
        }
        if(k > counter || k < 0) return "Exception!";
        return currentNode.value;
    }

//    public static LinkedList mergeLists(LinkedList one, LinkedList two){
//        Node temp = one.head;
//        while(one.head != null || two.head != null){
//            if(one.head == null) {
//                System.out.println("TWO HEAD"+two.head.value);
//                two.head = two.head.next;
//            }else if(two.head == null){
//                System.out.println("one HEAD"+one.head.value);
//                one.head = one.head.next;
//            }else {
//                Node oneTemp = one.head.next;
//                Node twoTemp = two.head.next;
//                one.head.next = two.head;
//                two.head.next = oneTemp;
//                one.head = oneTemp;;
//                two.head = twoTemp;
//            }
//        }
//        one.head = temp;
//        return one;
//    }

    // using recursive to merge LinkedList
    public static LinkedList mergeLists(LinkedList list1, LinkedList list2){
        list1.head = mergeNodes(list1.head, list2.head);
        return list1;
    }

    public static Node mergeNodes(Node head1, Node head2){
        if(head1 == null){
            return head2;
        } else {
            head1.next= mergeNodes(head2, head1.next);
            return head1;
        }
    }

}
