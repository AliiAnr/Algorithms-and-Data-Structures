package MODUL_2;

import java.util.NoSuchElementException;

public class Stack<T> { // <T> sebagai pembentukan generic yang digunakan ketika melakukan passing argumen
    // tidak dalam bentuk value tetapi dalam bentuk tipe data. dimana tipe data tersebut
    // ditentukan pada saat pembentukan objek pertamakali.

    // class ini berfungsi sebagai tempat penyimpanan data, seperti yang kita ketahui linkedlist merupakan
    // kumpulan dari berbagai data dimana data tersebut direpresentasikan sebagai simpul. simpul-simpul tersebut dihubungkan
    // oleh penujuk dimana penunjuk tersebut adalah alamat dari simpul-simpul yang lain, ibaratkan kita ingin
    // mengunjungi rumah seseorang, dan kita mempunyai alamat orang tersebut, selanjutnya sebagai penunjuk jalan ke alamat tersebut
    // kita menggunakan Google Maps, nahh google maps tersebut merupakan penunjuk yang digunakan pada class ini.

    // penunjuk tersebut dapat menunjuk ke arah selanjutnya (next) sebagai penghubung kedua simpul.
    // penunjuk-penunjuk ini membentuk rangkaian yang saling berhubungan, itu kenapa terbentuklah linkedlist, dalam kasus ini
    // digunakan single linkedlist karena terdapat satu arah yang menunjuk simpul.

    // Ada bentuk constructor yang berfungsi sebagai penempatan suatu objek dalam memori, dan didalam consructor
    // terdapat label-label yang akan menggambarkan objek ketika dibentuk.
    private Node<T> top;  // mendeklarasikan variabel top sebagai label atau penanda bahwa suatu list
    // tersebut terdapat ujung atas (top) agar data tersebut dapat diakses tanpa menggunakan alamat
    // pada saat pengaksesannya
    private Node<T> bottom; // mendeklarasikan variabel bottom sebagai label atau penanda bahwa suatu list
    // tersebut terdapat ujung bawah (bottom) agar data tersebut dapat diakses tanpa menggunakan alamat
    // pada saat pengaksesannya

    public static class Node<T> {

        public T value; // T digunakan sebagai tipe data yang diambil pada saat objek pertama kali dibentuk
        // misal pada saat pembentukan objek Modul1.LinkedList<String> simpul = new Modul1.LinkedList<>();
        // maka T sekarang merupakan tipe data String.
        public Node<T> next; // penunjuk data selanjutnya

        Node(T value) {
            this.value = value;
        }  // penggunaan (this) untuk mencegah terjadinya variabel shadowing.
        // ketika membuat objek baru --> Modul1.Orang data = new Modul1.Orang(); program akan memberitahukan bahwa objek tersebut haruslah terdapat label
        // karena terdapat constructor.
        // jika pembuatan objek baru dengan --> Modul1.Orang data = new Modul1.Orang("aryu", 167, 67); program akan memberitahukan bahwa objek tersebut sesuai
        // karena saat pembentukannya telah diberikan label sebagai penanda objek tersebut.
    }

    public Node<T> getTop() {  // fungsi ini digunakan untuk mengembalikan nilai dari top.
        return top;
    }

    public void push(T value) {
        // fungsi ini digunakan untuk menambahkan data dengan parameter yang digunakan adalah T value
        Node<T> newNode = new Node<>(value); // pembuatan objek baru untuk menyimpan data baru yang masuk.
        if (isEmpty()) top = bottom = newNode; // apabila list kosong, objek baru dibuat menjadi toop dan bottom.
        else {
            newNode.next = top; // memberikan kondisi node baru akan terhubung ke top.
            top = newNode; // menjadikan node baru sebagai top.
        }
    }

    public T pop() {
        // fungsi ini digunakan untuk menghapus data yang berada di atas. top akan dipindahkan ke data setelahnya, dan data sebelumnya akan dihapus.
        if (isEmpty()) throw new NoSuchElementException(); // jika simpul kosong maka akan memberitahukan bahwa throw new NoSuchElementException().
        var popItem = top; //menyimpan nilai top di variabel baru popItem.
        if (top == bottom) top = bottom = null; // akan menghapus nilai top dan bottom apabila terdapat value yang sama.
        else {
            var second = top.next; // menyimpan nilai top.next ke dalam variabel string.
            top.next = null; // menghapus nilai top.next.
            top = second; // megembalikan nilai yang sebelumnya telah dihapus.
        }
        return popItem.value; //  mengembalikan nilai popItem.value.
    }

    public void printAll() {
        // secara umum fungsi ini digunakan untuk menampilkan isi dari stack yang telah dibuat.
        if (isEmpty()) throw new NoSuchElementException(); // apabila linkedlist kosong, maka akan memberitahu throw new NoSuchElementException().
        Node<T> current = top; // membuat nilai yang untuk menyimpan data dari top
        while (true) { // perulangan yang aka berhenti ketika ada return atau break.
            if (current != null) { // emberikan syarat apabila current tidak samadengan null maka,
                if (current.next == null) System.out.println(current.value); // akan  mengecek lagi apabila node selanjutnya samadengan null.
                else {                                                       // maka akan menampilkan value dari current.
                    System.out.println(current.value); // menampilkan nilai dari current.
                    System.out.println("^"); // menampilkan data sesuai yang diperintahkan.
                }
                current = current.next; // digunakan untuk menjalankan current.
            } else break; // kondisi break jika syarat tidak dipernuhi.
        }
    }

    public boolean isEmpty() { // berfungsi untuk mengecek apakan top == null maka,
        return top == null;    // akan mengembalikan sifat boolean true atau false.
    }
}
