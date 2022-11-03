package MODUL_3;

public class Fun {
    private class Node {
        Node next;
        Node prev;
        String Nama;
        int harga;
        int stok;

        Node(String Nama, int harga, int stok) {
            this.Nama = Nama;
            this.harga = harga;
            this.stok = stok;
        }
    }

    Node first;
    Node last;

    int size = 0;

    void insertLast(String nama, int harga, int stok){
        // linked list kosong
        if (isEmpty()){
            first = last = new Node(nama, harga, stok);
        }
        // linked list nya udah ada elemen
        else {
            var node = new Node(nama, harga, stok);
            last.next = node;
            node.prev = last;
            last = node;
        }
        size++;
    }


    void bubbleSort(){
        Node current = first;
       for ( int i = 0; i < size - 1; i++){
            for (int j = i + 1; i < size; j++ ){


                }
            }
        }



    private boolean isEmpty(){
        return (first == null && last == null);
    }



}
