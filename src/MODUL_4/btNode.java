package MODUL_4;
// class Node merupakan class yang digunakan untuk merepresentasikan tiap Node yang di list
public class btNode {

        // variabel left merupakan variabel yang berfungsi untuk menunjuk child node sebelah kiri pada tre
        // variabel right merupakan variabel yang berfungsi untuk menunjuk child node sebelah kanan pada tre
        btNode left, right, parentChild;
        // object nama merupakan variabel yang di gunakan untuk menginputan nama orang yang akan di simpan dalam tree
        Object nama;
        // int level merupakan variabel yang digunakan untuk menentukan level node
        int level;
        // Constructor Node adalah method yang berfungsi untuk menginisialisasi variabel- variabel instans yang akan dimiliki oleh objek.
        public btNode(Object nama, int level) {
            this.nama = nama;
            this.level = level;
        }

    }
