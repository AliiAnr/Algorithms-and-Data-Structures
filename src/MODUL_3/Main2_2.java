package MODUL_3;

//Scanner adalah sebuah kelas yang terdapat pada paket java.util yang berfungsi sebagai kelas untuk melakukan masukan
//dari keyboard berbasis DOS dan membuat objek referensi sebagai media penginputan data.
import java.util.Scanner;

public class Main2_2 {
    //method ini berfungsi untuk menjalankan program, jika tidak ada method main maka program tidak akan bisa berjalan
    public static void main(String[] args) {
        //menginisialisasi scanner sebagai nama dari kelas scanner yang baru
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        //baris ini berfungsi untuk memanggil class linkedlist agar dapat digunakan isi nya di dalam method main
        //list sebagai inisialisasi dari method linkedlist, fungsinya agar mempermudah dalam penulisan code ny
        LinkedList<data> list = new LinkedList<>();
        //list.add berfungsi untuk melakukan penambahan data pada list
        //data yang ditambah berupa name, price dan stok, data ditambah menggunakan metode tambah belakang/addlast
        list.add(new data("Mizone", 6000, 30));
        list.add(new data("Indomie Goreng", 3500, 8));
        list.add(new data("Pulpy", 3000, 12));
        list.add(new data("Indomie Soto", 3500, 12));
        list.add(new data("Kopikap", 1500, 40));
        list.add(new data("Nabati Coklat", 2000, 34));
        list.add(new data("Nabati Permen Karet", 2000, 39));
        list.add(new data("Kuda Mas", 1000, 77));
        //baris ini merupakan sintaks untuk melakukan proses output pada baris itu saja
        //namun jika ada menggunakan scanner setelahnya, maka baris ini dapat diketik untuk dimasukkan suatu data
        System.out.print("Mencari Barang : ");
        //menginisialisasi variabel input sebagai variabel input-an scanner
        String input = scanner.next();
        //fun.sortInsertion(list) merupakan pemanggilan method fun beserta fungsi searchBinary didalamnya
        //data yang akan di cari disesuaikan dengan data yg di input. data dicari dengan metode Binary
        //menggunakan 2 atribut untuk membandingkan data pada list dan data yg akan dicari.
        Fun.searchBinary(list, input);
        scanner.close();
    }
}
