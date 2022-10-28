package MODUL_2;

public class Main1 {
    public static void main(String[] args) {// merupakan fungsi utama dimana semua statement dijalankan, statement tidak dapat dijalankan
        // selain dari fungsi ini.
        Stack<String> stacko = new Stack<>(); // pembentukan objek baru yang mengalokasikan memori
        stacko.push("Goku"); // menambahkan data kedalam list melalui fungsi push
        stacko.push("Anya"); // menambahkan data kedalam list melalui fungsi push
        stacko.push("Nagato"); // menambahkan data kedalam list melalui fungsi push
        stacko.push("Denji"); // menambahkan data kedalam list melalui fungsi push
        stacko.push("Loid"); // menambahkan data kedalam list melalui fungsi push
        System.out.println("Stack Sebelum Elemen Dihapus"); // menampilkan data sesuai yang ingin ditampilkan
        stacko.printAll(); // memanggil fungsi printAll untuk menampilkan data

        Infix.deleteString(stacko, "Anya"); // digunakan untuk menghapus data yang dicari.
        System.out.println("\nStack Setelah Elemen Dihapus");// menampilkan data sesuai yang ingin ditampilkan
        stacko.printAll(); // memanggil fungsi printAll untuk menampilkan datae
    }
}
