package Respon_Modul_5;

public class Stack {
    private class Node{
        Vertex value;
        Node next;
        Node(Vertex value){
            this.value = value;
        }
    }

    Node head;
    Node tail;

    public void push(Vertex value){
        Node newNode = new Node(value);
        if(isEmpty()){
            head = tail = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
    }

    public Vertex pop() {
        if (isEmpty()) {
            return null;
        } else {
            Node popItem = head;
            if (head.next != null) {
                head = head.next;
            } else {
                head = tail = null;
            }
            return popItem.value;
        }
    }

    public boolean isEmpty(){
        return (head == null && tail == null);
    }
}
