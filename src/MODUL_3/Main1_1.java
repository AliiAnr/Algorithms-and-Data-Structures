package MODUL_3;
//method main11 berfungsi untuk menjalankan program sorting menggunakan metode bubble
//maksudnya disini, class ini untuk penyelesaian persoalan terkait permasalahan
public class Main1_1 {
    //method ini berfungsi untuk menjalankan program, jika tidak ada method main maka program tidak akan bisa berjalan
    public static void main(String[] args) {
        //baris ini berfungsi untuk memanggil class linkedlist agar dapat digunakan isi nya di dalam method main
        //list sebagai inisialisasi dari method linkedlist, fungsinya agar mempermudah dalam penulisan code nya
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
        //fun.print(list) merupakan pemanggilan method fun beserta fungsi print didalamnya
        //yang kemudian akan digunakan untuk melakukan proses print atau cetak data yg sudah di input sebelumnya
        //ke dalam jendela layar (menampilkan data)
        //menggunakan atribut list (data yang akan di tampilkan)
        Fun.print(list);
        //fun.sortbubble(list) merupakan pemanggilan method fun beserta fungsi sortBubble didalamnya
        //data yang akan di sorting yaitu data pada list
        Fun.sortBubble(list);
        //merupakan sintaks untuk memberikan jarak 1 spasi
        System.out.println();
        //fun.print(list) merupakan pemanggilan method fun beserta fungsi print didalamnya
        //yang kemudian akan digunakan untuk melakukan proses print atau cetak data yg sudah di sorting sebelumnya
        //ke dalam jendela layar (menampilkan data)
        //menggunakan atribut list (data yang akan di tampilkan)
        Fun.print(list);

    }
}
