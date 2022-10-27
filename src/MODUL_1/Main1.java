package MODUL_1;

public class Main1 { // pembuatan public class main1, tujuan menggunakan public agar dapat diakses di kelas lain
    public static void main(String[] args) {// merupakan fungsi utama dimana semua statement dijalankan, statement tidak dapat dijalankan
                                            // selain dari fungsi ini.
        LinkedList<Orang> def = new LinkedList<>(); // pembentukan objek baru yang mengalokasikan memori
        def.add(new Orang("Alita", 155, 33)); // menambahkan data kedalam list melalui fungsi add
        def.add(new Orang("Putri", 158, 34)); // menambahkan data kedalam list melalui fungsi add
        def.add(new Orang("Devian", 160, 36)); // menambahkan data kedalam list melalui fungsi add
        def.add(new Orang("Melki", 165, 40)); // menambahkan data kedalam list melalui fungsi add
        def.add(new Orang("Pande", 168, 51)); // menambahkan data kedalam list melalui fungsi add
        def.add(new Orang("Agus", 169, 54)); // menambahkan data kedalam list melalui fungsi add
        def.add(new Orang("Azzam", 170, 57)); // menambahkan data kedalam list melalui fungsi add
        def.add(new Orang("Dadi", 164, 37)); // menambahkan data kedalam list melalui fungsi add
        def.add(new Orang("Weng", 182, 61)); // menambahkan data kedalam list melalui fungsi add
        def.add(new Orang("Jidan", 183, 62)); // menambahkan data kedalam list melalui fungsi add

        LinkedList<Orang> modified = Fun.copyList(def); // membuat objek yang menyimpan data salinan linkedlist dari objek def
                                                        // dimana data salinan ini berfungsi agar meminimalisir penamaan suatu objek
        Fun.delete(modified, "Dadi"); //menghapus data menggunakan melalui fungsi delete
        Fun.delete(modified, "Agus"); // menghapus data baru melalui fungsi delete

        System.out.println("\nKetika Penampilan Feast"); // menampilkan hasil sesuai data
        Fun.printList(modified); // menampilkan data dari modified

        Fun.delete(modified, "Devian"); // menghapus/mengganti data yang dipilih melalui fungsi delete
        System.out.println("\nKetika Devian Keluar Barisan"); // menampilkan hasil sesuai data
        Fun.printList(modified); // menampilkan data dari modified

        modified.add(2, def.get(7));
        System.out.println("\nSetelah Dadi Gantikan Devian"); // menambahkan data sesuai indeks yang ditetapkan, dimana data tersebut
        Fun.printList(modified);                              // diambil dari data asli lalu ditampilkan

        Fun.delete(modified, "Azzam");
        System.out.println("\nSetelah Azzam Keluar Barisan"); // menghapus/mengganti data yang dipilih melalui fungsi delete
        Fun.printList(modified); // menampilkan data dari modified

        modified.add(5, def.get(5));                     // menambahkan data sesuai indeks yang ditetapkan, dimana data tersebut
        System.out.println("\nSetelah Agus Gantikan Azzam");   // diambil dari data asli lalu ditampilkan
        Fun.printList(modified);


    }
}