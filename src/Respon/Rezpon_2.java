package Respon;

import java.util.NoSuchElementException;

public class Rezpon_2 {
    private class Node {
        int item;
        Node next;

        Node(int item){
            this.item = item;
        }
    }

    Node head;
    Node tail;
    int big = 0;
    int size = 0;
    void push(int value) {
        if(isEmpty()) head = tail = new Node(value);
        else {
            Node data = new Node(value);
            data.next = head;
            head = data;
        }
        size++;
    }

    void enQueue(int value){
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

    public void merge(Rezpon_2 data, Rezpon_2 data2){
        Sort();
        tail.next = data.head;
        Sort();
        data.tail.next = data2.head;
        Sort();

    }
    public void Sort(){
        Node curr;
        Node temp;
        int save;

        curr=head;
        temp = curr.next;

        if(head==null){
            System.out.print("Data Kosong");
        }
        else{
            while(curr.next!=null){
                if(temp.item<curr.item){
                    save =curr.item;
                    curr.item=temp.item;
                    temp.item=save;
                }
                if(temp.next!=null){
                    temp=temp.next;
                }
                curr=curr.next;

            }
        }
    }

    void display(Rezpon_2 list){
        if(isEmpty()) throw  new NoSuchElementException();
        Node data = list.head;
        while(true){
            if(data != null) {
                if (data.next == null) {
                    System.out.print(data.item);
                } else {
                    System.out.print(data.item + " --> ");
                }
            }else{
                System.out.println();
                break;
            }
            data = data.next;
        }
    }

    void length(Rezpon_2 node, Rezpon_2 node_2, Rezpon_2 node_3){
        int temp = node.size + node_2.size + node_3.size;
        System.out.println("LENGTH = " + temp);
    }

    private boolean isEmpty(){
        return (head == null && tail == null);
    }

}
