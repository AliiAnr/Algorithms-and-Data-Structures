package Respon;

import java.util.NoSuchElementException;

public class Rezpon {
    private class Node{
        Object value;
        int item;
        Node next;
        Node(Object value){
            this.value = value;
        }
    }
    Node head;
    Node tail;
    int size = 0;
    void push(Object value) {
        if(isEmpty()) head = tail = new Node(value);
        else {
            Node data = new Node(value);
            data.next = head;
            head = data;
        }
        size++;
    }

    void enQueue(Object value){
        if(isEmpty()) head = tail = new Node(value);
        else {
            Node data = new Node(value);
            tail.next = data;
            tail = data;
        }
        size++;
    }

    void deleteHead(){
        head = head.next;
        size--;
    }

    void deleteTail(){
        if(isEmpty()) throw new NoSuchElementException();
        if(head == tail){
            head = tail = null;
        } else{
            Node current = getPrevious(tail);
            tail = current;
            tail.next = null;
        }
        size--;
    }

    Node getPrevious(Node data){
        Node current = head;
        while(current != null){
            if(current.next == data) return current;
            else {
                current = current.next;
            }
        }
        return null;
    }

    public void SortBig (){
        Node temp, temp2;
        temp = head;
        int s;
        for(int i=0; i<size; i++) {
            temp2 = temp.next;
//            d++;
            for(int j=i+1;j<size;j++) {
                if(temp.item<temp2.item) {
                    s = temp2.item;
                    temp2.item = temp.item;
                    temp.item = s;

                }
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
    }

    void display(Rezpon list){
        if(isEmpty()) throw  new NoSuchElementException();
        Node data = list.head;
        while(true){
            if(data != null) {
                if (data.next == null) {
                    System.out.print(data.value);
                } else {
                    System.out.print(data.value + " --> ");
                }
            }else{
                System.out.println();
                break;
            }
            data = data.next;
        }
    }

    private boolean isEmpty(){
        return (head == null && tail == null);
    }


}
