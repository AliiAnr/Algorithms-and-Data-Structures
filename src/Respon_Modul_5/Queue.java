package Respon_Modul_5;

public class Queue {
    public class Node{
        Vertex value;
        Node Next;
        Node Previous;
        Node(Vertex value){
            this.value=value;
        }
    }
    Node Head;
    Node Tail;

    public boolean isEmpty(){
        return (Tail == null);
    }
    public void enqueue(Vertex value){
        Node newNode = new Node (value);
        if (isEmpty()){
            Head = newNode;
            Tail = newNode;
            Head.Previous=null;
            Tail.Next=null;
        }else if(!isAvalaible(value)){
            newNode.Next = Head;
            Head.Previous=newNode;
            Head=newNode;
        }
    }
    public Vertex dequeue(){
        if (isEmpty()){
            return null;
        }else{
            Vertex temp = Tail.value;
            if (Tail.Previous!=null){
                Tail=Tail.Previous;
            }else{
                Head = Tail = null;
            }
            return temp;
        }
    }

    public boolean isAvalaible(Vertex value){
        Node current = Head;
        while (current!= null){
            if (current.value==value){
                return true;
            }
            current=current.Next;
        }
        return false;
    }


}
