package MODUL_5;

public class LinkedList {
    // variabel head dan tail adalah variabel yang merpesentasikan posisi data
    // head merepresentasikan data pertama dan tail merepresentasikan data terakhir
    Node head, tail, current;
    // method addYear adalah method yang befungsi untuk menambah data linked list dan didalam linked list terdapat graph
    public void addYear(int year, Graph graph) {
        // Node baru adalah objek yang berisi data baru yang akan di input dalam linked list
        Node baru = new Node(year, graph);
        // line dibawah merupakan pengkondisian dimana jika nilai head adalah null maka nilai head dan tail
        // akan menjadi nilai baru pada method yang dijalankan
        if (head == null) {
            head = tail = baru;
        } else {
            // line dibawah merupakan pengkondisian yang dijalankan jika kondisi diatas tidak terpenuhi
            // nilai tail.next akan menjadi nilai baru dan nilai baru yang menunjuk ke pointer sebelumnya
            // akan menjadi nilai tail, setelah itu nilai tail yang baru akan menjadi nilai baru dan pointer
            // setelahnya akan menunjuk kosong atau null
            tail.next = baru;
            baru.prev = tail;
            tail = baru;
            tail.next = null;
        }
    }
    // method printList adalah method yang berfungsi untuk menampilkan data dalam linked list
    public void printList() {
        // inisialisasi current dengan nilai head
        current = head;
        // melakukan perulangan untuk menjalankan linked list
        while (current != null) {
            System.out.println("\nTahun " + current.year);
            current.graph.DFSprint();
            // line dibawah adalah untuk menjalankan list
            current = current.next;
        }
    }

    public void BFSSearch(String search) {
        System.out.println("\nCari: " + search);
        current = head;
        // line dibawah merupakan kondisi perulangan dimana jika nilai current tidak bernilai kosong atau null
        // maka akan menjalankan ......
        while (current != null) {
            current.graph.BFSSearch(search, current);
            // kondisi dibawah merupakan pengondisian dimana jika nilai current.next tidak sama dengan null
            // maka nilai current.next.found akan menjadi nilai current.found
            // if (current.next != null) {
            //    current.next.found = current.found;
            // }
            current = current.next;
        }
    }
}
