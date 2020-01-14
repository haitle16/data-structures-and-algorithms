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

}