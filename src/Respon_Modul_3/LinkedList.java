package Respon_Modul_3;

public class LinkedList {
    private class Node {
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
        }
    }

    Node head;
    Node tail;

    int size = 0;
    public void addLast (int value){
        Node data = new Node(value);
        if(isEmpty()){
            head = tail = data;
        }else {
            tail.next = data;
            data.prev = tail;
            tail = data;
            tail.next = null;
            head.prev = null;
        }
        size++;
    }

    public void BbSort() {
        Node temp = head;
        Node nextTemp= null;
        for(int i = 0; i < size; i ++){
            nextTemp = temp.next;
            for (int j = i + 1; j < size; j++){
                if(temp.data > nextTemp.data){
                    swap(temp, nextTemp);
                }
                nextTemp = nextTemp.next;
            }
            temp = temp.next;
        }
    }

    public void InsSort() {
        Node temp = head;
        Node nextTemp = null;

        while (temp != tail) {
            nextTemp = temp.next;
            if (temp.data < nextTemp.data) {
                swap(temp, nextTemp);
                while (temp.prev != null) {
                    if (temp.data > temp.prev.data) {
                        swap(temp, temp.prev);
                    }
                    temp = temp.prev;
                }
            }
            temp = temp.next;
        }
    }
    public void swap(Node value_1, Node value_2) {
        int temp;
        temp = value_1.data;
        value_1.data = value_2.data;
        value_2.data = temp;
    }

    boolean isEmpty(){
        return head == null && tail == null;
    }

    public int H_grade(){
        Node temp = head;
        int highGrade = 0;
        for(int i = 0; i < size; i++){
            if(temp.data >= highGrade){
                highGrade = temp.data;
            }
            temp = temp.next;
        }
        return highGrade;
    }

    public int L_Grade(){
        Node temp = head;
        int lowGrade = 999;
        for(int i = 0; i < size; i++){
            if(temp.data <= lowGrade){
                lowGrade = temp.data;
            }
            temp = temp.next;
        }
        return lowGrade;
    }

    public void SqlSearch(int data){
        Node current = head;
        while(current != null){
            if(current.data == data){
                System.out.println(current.data);
                return;
            }
            current = current.next;
        }
    }

    public Node dotMid(Node first, Node last) {
        if (first == null) {
            return null;
        }
        Node run = first;
        Node faster = first.next;
        while (faster != last) {
            faster = faster.next;
            if (faster != last) {
                run = run.next;
                faster = faster.next;
            }
        }
        return run;
    }

    public void binarySearch(LinkedList list, int find) {
        Node start = list.head;
        Node end = null;

        while(end != start){
            Node mid = dotMid(start, end);
            if (mid.data == find){
                System.out.println(mid.data);
                return;
            }
            else if (mid.data <= find){
                start = mid.next;
            }
            else {
                end = mid;
            }
        }
    }


    void display(LinkedList list){
        Node current = list.head;
        while (current != null){
            if (current.next == null){
                System.out.print(current.data);
            }else{
                System.out.print(current.data + " -> ");
            }
            current = current.next;
        }
    }

    public void line(){
        System.out.println("-----------------------------------------");
    }
}
