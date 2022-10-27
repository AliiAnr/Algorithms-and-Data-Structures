package MODUL_1;

import java.util.Objects; // digunakan sebagai Perintah Untuk Memasukan suatu Method atau perintah
                         // dalam Java sehingga perintah tersebut dapat Aktif dan digunakan.

public class Fun { // pembuatan public class fun, tujuan menggunakan public agar dapat diakses di kelas lain
    public static void delete(LinkedList<Orang> list, String nama) { // digunakan sebagai fungsi untuk menghapus node di linkedlist
        for (int i = 0; i < list.capacity(); i++) {                  // digunakan generic untuk menentukan tipedata dari objek yang ingin dibuat
            if (Objects.equals(list.get(i).nama, nama)) {            // MODUL_1.LinkedList<MODUL_1.Orang> list berarti tipe data dari list itu adalah MODUL_1.Orang
                list.delete(i);                                      // dimana orang tersebut berisi name, height, dan power
            }                                                        // terdapat perulangan sebanyak  panjang dari linkedList, dimana jika suatu objek
        }                                                            // sesuai dengan nama pada parameter, maka data tersebut akan dihapus, pada fungsi ini.
    }                                                                // atau dengan kata lain, mencari nama yang sama dengan parameter dan dihapus

    public static LinkedList<Orang> copyList(LinkedList<Orang> list) { // fungsi ini digunakan untuk menyimpan data dari objek 1 ke objek yang lain
        LinkedList<Orang> newList = new LinkedList<>();                // dengan tujuan agar meminimalisir penggunaan kode
        for (int i = 0; i < list.capacity(); i++) {                    // misal ada data yang ingin kita edit, agar data aslinya tidak ke ubah ubah
            newList.add(list.get(i));                                  // kita membutuhkan data untuk di backup karena data asli tersebut akan dibutuhkan
        }                                                              // ketika membandingkan data yang baru
        return newList;                                                // mengembalikan nilai newlist
    }

    public static LinkedList<Orang> combineList(LinkedList<Orang> firstList, LinkedList<Orang> secondList) {
        LinkedList<Orang> newList = new LinkedList<>();     // fungsi ini digunakan untuk menggabungkan dua buah objek. dilakukan perulangan sebanyak panjang dari
        for (int i = 0; i < firstList.capacity(); i++)      // linkedlist. objek pertama akan menyimpan parameter firstList dan setelah itu objek tersebut menyimpan
            newList.add(firstList.get(i));                  // parameter secondList sehingga data tersebut tergabung

        for (int i = 0; i < secondList.capacity(); i++)
            newList.add(secondList.get(i));

        return newList;
    }

    public static void printList(LinkedList<Orang> list) { // fungsi ini digunakan untuk menampilkan data sesuai urutan list yang tersedia
        for (int i = 0; i < list.capacity(); i++) {        // dilakukan looping untuk mengecek tiap indeks untuk ditampilkan
            System.out.println("Nama : " + list.get(i).nama + ", height : " + list.get(i).tinggi + ", power : " + list.get(i).kpow);
        }
    }

    public static void sortList(LinkedList<Orang> list) {  // digunakan untuk mengurutkan data sesuai list yang ditentukan
        int check;                                         // dengan cara membandingkan taip-tiap simpul dan menukarnya pada fungsi swap
        do {                                               // melalui parameter list itu sendiri, dapat mengakses node pada linkedlist
            check = 0;                                     // sehingga hanya menggunakan variabel list dan nama fungsi untuk memanggil objek
            for (int i = 0; i < list.capacity() - 1; i++) {
                if (list.get(i).tinggi > list.get(i + 1).tinggi) {
                    list.swap(i, i + 1);
                    check++;
                }
            }
        } while (check > 0);
    }
}