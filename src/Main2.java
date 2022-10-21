public class Main2 {// membuat public class main sebagai tempat pengoprasian data
    public static void main(String[] args) { // merupakan fungsi utama dimana semua statement dijalankan, statement tidak dapat dijalankan
                                             // selain dari fungsi ini.
        LinkedList<Orang> list1 = new LinkedList<>(); // membuat objek baru dengan nama list1 dan objek tersebut langsung mengalokasikan memori
        LinkedList<Orang> list2 = new LinkedList<>(); // membuat objek baru dengan nama list2 dan objek tersebut langsung mengalokasikan memori
        list1.add(new Orang("Dadi", 164, 37)); // menambahkan data dari list1 melalui fungsi add
        list1.add(new Orang("Agus", 169, 54)); // menambahkan data dari list1 melalui fungsi add
        list1.add(new Orang("Weng", 182, 61)); // menambahkan data dari list1 melalui fungsi add
        list1.add(new Orang("Jidan", 183, 62)); // menambahkan data dari list1 melalui fungsi add
        list2.add(new Orang("Alita", 155, 33)); // menambahkan data dari list2 melalui fungsi add
        list2.add(new Orang("Putri", 158, 34)); // menambahkan data dari list2 melalui fungsi add
        list2.add(new Orang("Melki", 165, 40)); // menambahkan data dari list2 melalui fungsi add
        list2.add(new Orang("Permadi", 168, 51)); // menambahkan data dari list2 melalui fungsi add

        LinkedList<Orang> combineList = Fun.combineList(list1, list2); // membuat variabel dan menyimpan nilai dari fungsi yang dipanggil
                                                                       // sehingga terdapat nilai fungsi yang disimpan oleh variabel

        System.out.println("Berteduh"); // menampilkan data sesuai isi print
        Fun.printList(list1); // memanggil fungsi yang menampilkan list1

        System.out.println("\nTetap Menonton Konser"); // menampilkan data sesuai isi print
        Fun.printList(list2); // memanggil fungsi yang menampilkan list2

        System.out.println("\nSetelah Bersatu"); // menampilkan data sesuai isi print
        Fun.sortList(combineList); // mengurutkan data pada list
        Fun.printList(combineList); // memanggil fungsi yang memanggil data
         }
}
