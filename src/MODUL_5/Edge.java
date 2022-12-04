package MODUL_5;
// class Edge adalah class yang berfungsi untuk melakuka proses penyambungan 2 vertex
public class Edge {
    Edge next, prev;
    Vertex to;
    // Edge merupakan constractor untuk menginisialisasi nilai dari variabel to dengan parameter
    public Edge(Vertex to) {
        this.to = to;
    }
}
