package MODUL_5;

// Class dibawah merupakan class queue yag digunakan pada method BFS
public class Queue {
    // Class node merupakan simpul yang digunakan pada queue
    public class Node{
        // variabel dibawah digunakan untuk memberri nilai pada vertex
        Vertex value;
        // Method dibawah
        Node Next, Previous;
        Node(Vertex value){
            this.value=value;
        }
    }
    Node head, tail;

    public void enqueue(Vertex value){
        Node newNode = new Node (value);
        if (head == null){
            head = newNode;
            tail = newNode;
            head.Previous=null;
            tail.Next=null;
        }else if(!isAvalaible(value)){
            newNode.Next = head;
            head.Previous = newNode;
            head = newNode;
        }
    }
    public Vertex dequeue(){
        // line dibawah merupakan sebuah pengkondisian dimana jika kondisi kosong atau menggunakan method isEmpty
        // maka akan mengembalikan nilai kosong atau null
        if (head == null){
            return null;
        }else{
            Vertex temp = tail.value;
            if (tail.Previous!=null){
                tail=tail.Previous;
            }else{
                tail = null;
            }
            return temp;
        }
    }
    public Vertex peek(){
        return tail.value;
    }
    public void printAll(){
        Node current = head;
        while(current!=null){
            System.out.print(current.value.name+"["+current.value.visited+"], ");
            current=current.Next;
        }
    }
    public boolean isAvalaible(Vertex value){
        Node current = head;
        while (current!= null){
            if (current.value==value){
                return true;
            }
            current=current.Next;
        }
        return false;
    }


}
