package Respon_Modul_5;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.insertVertex("A");
        graph.insertVertex("B");
        graph.insertVertex("C");
        graph.insertVertex("D");
        graph.insertVertex("E");
        graph.insertVertex("F");
        graph.insertVertex("G");
        graph.insertVertex("H");
        graph.insertEdge("A", "C");
        graph.insertEdge("B", "A");
        graph.insertEdge("B", "H");
        graph.insertEdge("C", "B");
        graph.insertEdge("C", "E");
        graph.insertEdge("D", "A");
        graph.insertEdge("D", "F");
        graph.insertEdge("E", "D");
        graph.insertEdge("E", "F");
        graph.insertEdge("F", "G");
        graph.insertEdge("G", "H");
        graph.insertEdge("H", "C");
        System.out.println("=====[Adjency List dari setiap Vertex]=====");
        graph.printEdge();
        System.out.println("=====[Tampilan hasil berdasarkan DFS]=====");
        graph.DFS("A");
        System.out.println();
        System.out.println("=====[Tampilan hasil berdasarkan BFS]=====");
        graph.BFS("A");



    }
}
