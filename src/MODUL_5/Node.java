package MODUL_5;

// Class node merupakan simpul yang terdapat pada double linked list
public class Node {
    // Method dibawah digunakan untuk melakukan pencarian pada BFS
    boolean found = false;
    // Variabel dibawah digunakan untuk menunjuk Node setelah dan sebelumnya
    Node next, prev;
    // Variabel dibawah digunakan untuk menentukan head, tail, dan curr pada simpul graph
    Graph graph, head, tail, currGraph;
    // Variabel dibawah digunakan untuk mengisi nilai tahun pada linked list
    int year;

    // Method dibawah digunakan untuk menentukan nilai tahun dan graph pada class Node
    public Node(int year, Graph graph) {
        this.year = year;
        this.graph = graph;
    }
}
