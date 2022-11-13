package Respon_Modul_2;

public class Respon {
    Node head, tail;
    public void enqueue(String data){
        if(isEmpty()) head = tail = new Node(data);
        else{
            Node node = new Node(data);
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    public void setPlace(String nama){
        Node current = head;
        Node node = new Node(nama);
        while(current != null){
            if(current.priority != true){
                if(current == head){
                    node.next = head;
                    head.prev = node;
                    head =  node;
                    node.priority = true;
                    return;
                }
                else{
                    node.next = current;
                    node.prev = current.prev;
                    current.prev.next = node;
                    current.prev = node;
                    node.priority = true;
                    return;
                }
            }
            current = current.next;
        }
    }

    public void priority(String data){
        Node current = head;
        while (current != null){
            if(data.equals(current.nama)){
                String temp = current.nama;
                if(current == head){
                    return;
                }
                else{
                    if(current.next == null){
                        current = null;
                    } else{
                        current.prev.next = current.next;
                        current.next.prev = current.prev;
                    }
                }
                setPlace(temp);
                return;
            }
            current = current.next;
        }
    }


    public boolean isEmpty(){
        return (head == null && tail == null);
    }

    public void display(){
        Node current = head;
        while(current != null){
            if (current.next == null){
                System.out.print(current.nama);
            }
            else{
                System.out.print(current.nama + " - ");
            }
            current = current.next;
        }
        System.out.println(" ");
    }
}

