package MODUL_2;

import java.util.NoSuchElementException;

public class Stack<T> {
    private class Node<T> {
        T value;
        Node<T> next;
        Node<T> prev;
        Node(T value){
            this.value = value;
        }
    }

    Node<T> head;
    Node<T> tail;

    void push(T value){
        Node<T> node = new Node<>(value);
        if (isEmpty()){
            head = tail = node;
        }
        else{
            node.next = head;
            head.prev = node;
            head = node;
        }
        tail.next = null;
        head.prev = null;
    }

    public void locate(T value){
        Node<T> current = head;
        Node<T> temp;
        while (current != null){
            if (current.value == value){
                System.out.println("Berhasil mendapatkan dan merubah current dengan objek");
                while(current != null){
                    if(current.value != value){
                        temp = current;
                        temp = temp.next;
                    }
                        current = current.prev;
                }
                return;
            }
            current = current.next;
        }
    }

    void display(Stack<T> list){
        if(isEmpty()) throw  new NoSuchElementException();
        Node<T> data = list.head;
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
