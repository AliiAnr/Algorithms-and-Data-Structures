package MODUL_5;

public class Vertex {
    // Vertex di bawah digunakan untuk menunjuk vertex setelah dan sebelumnya
    Vertex next, prev;
    // Edge dibawah digunakan untuk menentukan head, tail, dan curr pada Edge
    Edge edgeHead, edgeTail, currEdge;
    // variabel dibawah digunakan untuk menyimpan nama dari vertex dan item-item pada vertex
    String name,item[];
    // Variabel dibawah digunakan untuk menentukan kondisi ketika melakukan DFS pada method graph
    boolean visited = false;
    // Method dibawah merupakan method yang digunakan untuk mengisi nama dan item pada tiap vertex
    public Vertex(String name, String item[]) {
        this.name = name;
        this.item = item;
    }

    // Method dibawah digunakan untuk menentukan vertex yang ditunjuk oleh suatu vertex
    public void setEdge(Vertex to) {
        // Membuat objek baru dengan isi sebuah vertex
        Edge newEdge = new Edge(to);
        // Kondisi jikan head sama dengan null maka edge baru menjadi head dan tail
        if (edgeHead == null) {
            edgeHead = edgeTail = newEdge;
            // Kondisi jika head tidak sama dengan null, maka data baru ditambah setelah tail
        } else {
            edgeTail.next = newEdge;
            newEdge.prev = edgeTail;
            edgeTail = newEdge;
            edgeTail.next = null;
        }
    }

    // Method dibawah digunakan untuk menampilkan edge yang terdapat pada vertex
    public void printEdge(){
        currEdge = edgeHead;
        while(currEdge != null){
            System.out.println(currEdge.to.name);
            currEdge = currEdge.next;
        }
    }
}