package MODUL_4;

// class main merupakan class yang berisi method main yang digunakan untuk menjalankan seluruh program code yang dipanggil kedalam main
public class Main {
    public static void main(String[] args) {

        // line dibawah merupakan pembuatan object "obj" gunanya agar dapat mengakses
        // method method yang berada pada class method.java
        BasicBinaryTree obj = new BasicBinaryTree();
        // pembuatan node root sebagai data pertama pada obj relationShip keluarga
        obj.addNode(null, "DAUS");
        // pengisian data "putri" dengan patokan parentnya adalah "daus" dengan
        // memanggil method addNode
        obj.addNode("DAUS", "PUTRI");
        // pengisian data "daden" dengan patokan parentnya adalah "daus" dengan
        // memanggil method addNode
        obj.addNode("DAUS", "DADEN");
        // pengisian data "ari" dengan patokan parentnya adalah "putri" dengan memanggil
        // method addNode
        obj.addNode("PUTRI", "ARI");
        // pengisian data "lilul" dengan patokan parentnya adalah "putri" dengan
        // memanggil method addNode
        obj.addNode("PUTRI", "LILUL");
        // pengisian data "arsan" dengan patokan parentnya adalah "daden" dengan
        // memanggil method addNode
        obj.addNode("DADEN", "ARSAN");
        // pengisian data "jidan" dengan patokan parentnya adalah "daden" dengan
        // memanggil method addNode
        obj.addNode("DADEN", "JIDAN");
        // pengisian data "uno" dengan patokan parentnya adalah "ari" dengan memanggil
        // method addNode
        obj.addNode("ARI", "UNO");
        // pengisian data "shafa" dengan patokan parentnya adalah "ari" dengan memanggil
        // method addNode
        obj.addNode("ARI", "SHAFA");
        // pengisian data "diaz" dengan patokan parentnya adalah "lilul" dengan
        // memanggil method addNode
        obj.addNode("LILUL", "DIAZ");
        // pengisian data "melki" dengan patokan parentnya adalah "lilul" dengan
        // memanggil method addNode
        obj.addNode("LILUL", "MELKI");
        // pengisian data "mahen" dengan patokan parentnya adalah "arsan" dengan
        // memanggil method addNode
        obj.addNode("ARSAN", "MAHEN");
        // pengisian data "alita" dengan patokan parentnya adalah "arsan" dengan
        // memanggil method addNode
        obj.addNode("ARSAN", "ALITA");
        // pengisian data "rozaki" dengan patokan parentnya adalah "jidan" dengan
        // memanggil method addNode
        obj.addNode("JIDAN", "ROZAKI");
        // pengisian data "agung" dengan patokan parentnya adalah "jidan" dengan
        // memanggil method addNode
        obj.addNode("JIDAN", "AGUNG");
        // tampilan ini digunakan sebagai penanda bahwa tampilan berikutnya merupakan
        // hubungan antar node satu dengan yang lainnya
        System.out.println("\nHUBUNGAN\n");
        // pmencari hubungan keluarga antara "putri" dengan "daus" dengan memanggil
        // method relationShip
        obj.relationShip("PUTRI", "DAUS");
        // pmencari hubungan keluarga antara "shafa" dengan "daus" dengan memanggil
        // method relationShip
        obj.relationShip("SHAFA", "DAUS");
        // pmencari hubungan keluarga antara "mahen" dengan "alita" dengan memanggil
        // method relationShip
        obj.relationShip("MAHEN", "ALITA");
        // pmencari hubungan keluarga antara "mahen" dengan "uno" dengan memanggil
        // method relationShip
        obj.relationShip("MAHEN", "UNO");
        // pmencari hubungan keluarga antara "lilul" dengan "daus" dengan memanggil
        // method relationShip
        obj.relationShip("LILUL", "DAUS");
        // pmencari hubungan keluarga antara "melki" dengan "daden" dengan memanggil
        // method relationShip
        obj.relationShip("MELKI", "DADEN");
        // pmencari hubungan keluarga antara "rozaki" dengan "arsan" dengan memanggil
        // method relationShip
        obj.relationShip("ROZAKI", "ARSAN");
        // pmencari hubungan keluarga antara "rozaki" dengan "ari" dengan memanggil
        // method relationShip
        obj.relationShip("ROZAKI", "ARI");
        // pmencari hubungan keluarga antara "diaz" dengan "agung" dengan memanggil
        // method relationShip
        obj.relationShip("DIAZ", "AGUNG");
        //tampilan ini digunakan sebagai penanda bahwa tampilan berikutnya merupakan tampilan data secara inorder
        System.out.println("\n=== PRINT IN ORDER ===\n");
        // menampilkan semua data node secara in order menggunakan method PrintInOrder
        obj.inOrderPrint(obj.root);

    }
}
