package MODUL_3;


//library yang berguna untuk menampilkan jika tidak terdapat elemen pada list
//hal ini berguna untuk mempermudah agar tidak perlu memasukkan system.out.pritnln untuk
//mendefinisikan list tidak terdapat data

import java.util.NoSuchElementException;
public class Fun {
    //method sortBubble berfungsi untuk melakukan proses sorting terhadap suatu list dalam permasalahan
    //dengan menggunakan metode bubble (gelembung). metode bubble merupakan metode yang bekerja dengan membandingkan
    //data pada list antara data satu dengan data selanjutnya, proses ini dilakukan terus menerus sampai mencapai data
    //akhir. linkedlist list merupakan parameter generic dari method ini dan list merupakan nama variabelnya.
    //data merupakan tipe data yang digunakan di dalam method sortBubble

    //pada method ini digunakan beberapa pengkondisian dimana jika tidak terdapat data dalam list
    //dan jika terdapat data dalam list. capacity merupakan function yang berfungsi untuk mengukur
    //ukuran dari data. compareTo berfungsi untuk membandingkan string antara data.
    //swap merupakan function yang digunakan untuk menukar/swap data antara data satu dan selanjutnya
    // pada list
    //menggunakan perulangan do while dan juga for. serta menggunakan variabel check dengan tipe data integer
    //yang berfungsi sebagai variabel bantu dalam proses looping
    public static void sortBubble(LinkedList<data> list) {
        if (list.isEmpty()) throw new NoSuchElementException();
        int check;
        do {
            check = 0;
            for (int i = 0; i < list.capacity() - 1; i++) {
                if (list.get(i).name.compareTo(list.get(i + 1).name) > 0) {
                    //melakukan swap antara 2 data, data tersebut di inisialisasikan sebagai i dan i+1
                    list.swap(i, i + 1);
                    check++;
                }
            }
            //check tidak sama dengan 0 merupakan syarat perulangan do while. mula-mula variabel check akan bernilai 0, kemudian
            //dalam perulanagn do while akan berisi perulangan menggunakan for yg bersyarat nilai i kurang dari capasitas/ukuran data
        } while (check != 0);
    }
    //method sortInsertion merupakan salah satu metode dalam proses sorting, di mana data akan disorting
    //dengan cara menyisipkan/insert data pada bagian depan list terlebih dahulu, kemudian data selanjunya
    //akan melakukan perbandingan nilai dengan data sebelumnya. hal ini seperti membagi list ke dalam 2 bentuk
    //list yaitu yang sedang diurutkan dan juga yang sama seperti sebelumnya(sebelum diurutkan)

    //pada method ini digunakan parameter generic linkedlist dengan nama variabel list dan menggunakan tipe data
    //data. terdapat beberapa pengkondisian dan juga perulangan, dimana pengkondisian isEmpty yang berfungsi untuk mengecek
    //apakah pada list terdapat data. jika tidak ada data pada list maka program akan memberikan peringatan berupa nosuchelement
    public static void sortInsertion(LinkedList<data> list) {
        if (list.isEmpty()) throw new NoSuchElementException();
        //perulangan menggunakan for dengan syarat i kurang list.capacity, maksudnya capasity disini yaitu jumlah karakter dari string
        //sehingga program akan berulang terus-menerus tergantung jumlah karakter pada string
        for (int i = 1; i < list.capacity(); i++) {
            //membandingkan data satu dan setelahnya pada list left
            if (list.get(i).price > list.get(i - 1).price) {
                for (int j = i; j > 0; j--) {
                    //membandingkan data satu dengan data selanjutnya pada list right
                    if (list.get(j).price > list.get(j - 1).price) {
                        //melakukan swap antara 2 data, data tersebut di inisialisasikan sebagai j dan j+1
                        list.swap(j, j - 1);
                    }
                }
            }
        }
    }
    //method mergelist merupakan salah satu jenis sorting, cara kerja dari metode ini yaitu data pada list pertama-tama akan dicari data tengah
    //dengan menggunakan data awal(head) dan data (akhir). setelah ditemukan data tengah maka data pada list akan dibagi menjadi 2 dibagian tengah
    //setelah itu data akan di urutkan di masing-masing bagian list, setelah selesai di sorting, kemudian data akan disatukan kembali dan
    //diurutkan kembali.

    //pada method ini digunakan beberapa parameter, diantaranya parameter generic linkedlist dengan nama variabel list dan menggunakan tipe data
    //data. kemudian parameter variabel low, mid, dan high yang sama-sama menggunakan tipe data integer
    private static void mergeList(LinkedList<data> list, int low, int mid, int high) {

        // Create L ← A[low..mid] and M ← A[mid+1..high]
        //menginialisasi integer n1 dan n2 sebagai jumlah bilangan yang ada pada range awal sampai mid untuk n1, dan jumlah bilangan
        //mid sampai akhir untuk n2. hal ini berguna untuk menentukan jumlah perulangan (syarat perulangan)
        int n1 = mid - low + 1;
        int n2 = high - mid;

        //membuat list menjadi 2 bagian, di sini left dan right merupakan nama dari 2 list tersebut
        LinkedList<data> left = new LinkedList<>();
        LinkedList<data> right = new LinkedList<>();
        //perulangan yg berfungsi untuk memasukkan data-data yang berada pada range awal sampai mid (karena menggunakan syarat n1)
        for (int i = 0; i < n1; i++)
            //memasukkan data-data ke dalam list baru bernama left, jadi jumlah data pada list left akan disesuaikan dengan nilai n1
            left.add(list.get(low + i));
        //perulangan yang berfungsi untuk memasukkan data-data yang berada pada range mid sampai akhir (karena menggunakan syarat n2)
        for (int j = 0; j < n2; j++)
            //memasukkan data-data ke dalam list baru bernama right, jadi jumlah data pada list right akan disesuaikan dengan nilai n2
            right.add(list.get(mid + 1 + j));

        //menginisialisasi/memberikan nilai terlebih dahulu untuk variabel i,j, dan k
        int i, j, k;
        i = 0;
        j = 0;
        k = low;
        //perulangan while ini berfungsi untuk menentukan posisi data mulai dari low sampai high
        //data akan di cek dan diurutkan mulai dari data pertama sampai akhir
        //dalam perulangan while terdapat 2 pengkondisian beruapa jika data pada list left lebih kecil atau sama
        //nilai nya dengan data pada list right, dan jika data left lebih besar
        while (i < n1 && j < n2) {
            if (left.get(i).stock <= right.get(j).stock) {
                list.replace(k, left.get(i));
                i++;
            } else {
                list.replace(k, right.get(j));
                j++;
            }
            k++;
        }

        //baris ini untuk mendata data apa saja yang ada pada list left
        while (i < n1) {
            list.replace(k, left.get(i));
            i++;
            k++;
        }
        //baris ini untuk mendata data apa saja yang ada pada list right
        while (j < n2) {
            list.replace(k, right.get(j));
            j++;
            k++;
        }
    }

    //method ini berfungsi untuk membedakan antara list data dengan range low sampai mid dan juga
    //list data dengan range mid sampai high
    private static void mergeDiv(LinkedList<data> list, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            //melakukan panggilan rekursif atau memanggil method sendiri, agar mempermudah pemecahan masalah
            //mergediv dengan atribut list, low dan mid berfungsi untuk diisi data dengan range low sampai mid
            mergeDiv(list, low, mid);
            //mergediv dengan atribut list, mid+1 dan high berfungsi untuk diisi data dengan range mid sampai high
            mergeDiv(list, mid + 1, high);
            //memanggil method mergelist untuk proses sorting terhadap data pada list
            //baik untuk data right maupun left (karena sebelumnya data telah dibagi menjadi 2 list)
            mergeList(list, low, mid, high);
        }
    }
    //method ini berfungsi untuk menentukan jumlah karakter pada list, menggunakan function capacity untuk menghitung karakternya
    public static void sortMerge(LinkedList<data> list) {
        //berfungsi untuk menghitung jumlah karakter pada method mergediv
        mergeDiv(list, 0, list.capacity() - 1);
    }
    //method searchseq merupakan method yang menerapkan metode dari searching yang bernama sequential
    //cara kerja dari metode sequential yaitu data pada list akan di bandingkan satu persatu mulai dari
    //data awal sampai ke data akhir (di cek satu persatu)

    //pada method binary digunakan beberapa parameter diantaranya, yaitu parameter generic linkedlist dengan variabel list dan tipe data data
    //dan juga terdapat variabel key yang bertipe data string
    //pada metode sequential data bisa di urutkan ataupun tidak diurutkan sama sekali
    public static void searchSeq(LinkedList<data> list, String key) {
        //data diurutkan menggunakan method sortbubble, karena method ini melakukan sorting string
        //dan data yang akan di search merupakan data dengan tipe data string
        sortBubble(list);
        //melakukan perulangan dengan batasan yang diambil dari jumlah karakter string (capacity)
        // baris ini juga berfungsi untuk mengetahui lokasi dari data pada list dengan urutan menggunakan bilangan
        for (int i = 0; i < list.capacity(); i++) {
            //equalsIgnorecase berfungsi untuk membandingkan string apakah sama atau tidak
            //fungsinya agar hanya data yg sesuai dengan data yg dicari lah yg bisa melakukan proses selanjutnya
            //jika memenuhi syarat, selanjutnya data akan ditentukan lokasi nya apakah di awal, di akhir ataupun di antara awal dan akhir
            if (key.equalsIgnoreCase(list.get(i).name)) {
                System.out.println("===== Barang Ditemukan ====");
                System.out.println("Nama Barang : " + list.get(i).name);
                System.out.print("Letak : ");
                if (i == 0)
                    System.out.println("Sebelum barang " + list.get(i + 1).name);
                else if (i == list.capacity() - 1)
                    System.out.println("Setelah barang " + list.get(i - 1).name);
                else {
                    System.out.println("Sebelum barang " + list.get(i + 1).name);
                    System.out.println("\t\tSetelah barang " + list.get(i - 1).name);
                }
                return;
            }
        }
        System.out.println("===== Barang Tidak Ditemukan ====");
    }
    //method binary merupakan salah satu jenis dari proses searching yang berfungsi mencari data pada suatu list dengan cara membagi data
    //pada list menjadi 2 bagian, data-data tersebut sebelumnya telah di sorting terlebih dahulu.
    //proses akan selalu membagi data pada list menjadi 2bagian terus menerus sampai data pada list sudah menjadi satu persatu/satu ruangan
    //satu data atau data telah temukan

    //pada method binary digunakan beberapa parameter diantaranya, yaitu parameter generic linkedlist dengan variabel list dan tipe data data
    //dan juga terdapat variabel key yang bertipe data string
    //method ini berfungsi untuk menentukan lokasi dari data yang akan dicari
    //terdapat 2 kondisi dimana kondisi pertama jika data yang dicari ada dalam list dan kondisi ke dua dimana data yang dicari tidak ada dalam
    //list
    public static void searchBinary(LinkedList<data> list, String key) {
        //memanggil method sorting bubble terlebih dahulu karena binary memiliki syarat data sudah harus terurut
        // dan pada permasalahan, yang akan diurutkan yaitu data nama (yang diurut menggunakan metode bubble)
        sortBubble(list);
        //int found berfungsi sebagai variabel bantu yang digunakan untuk menentukan lokasi data(dalam bentuk bilangan biner)
        //sehingga mempermudah dalam pencarian data
        int found = binaryMethod(list, 0, list.capacity(), key);
        //menggunakan pengkondisian dengan syarat variabel found lebih dari sama dengan nol karena data awal lokasinya di 0
        //dan menggunakan lebih dari agar dapat mencari data setelahnya
        //didalam pengkondisian statement if (found >=0) ada tiga kondisi lain, yaitu data awal, data diantara awal dan akhir,
        //serta data akhir, fungsi nya yaitu untuk menentukan data setelah dan sebelum dari suatu data
        if (found >= 0) {
            System.out.println("===== Barang Ditemukan ====");
            System.out.println("Nama Barang : " + list.get(found).name);
            System.out.print("Letak : ");
            if (found == 0)
                System.out.println("Sebelum barang " + list.get(found + 1).name);
            else if (found == list.capacity() - 1)
                System.out.println("Setelah barang " + list.get(found - 1).name);
            else {
                System.out.println("Sebelum barang " + list.get(found + 1).name);
                System.out.println("\t\tSetelah barang " + list.get(found - 1).name);
            }
            //berfungsi agar setelah salah satu statement memenuhi syarat dan selesai di proses, maka akan langsung keluar dari method
            return;
        }
        System.out.println("===== Barang Tidak Ditemukan ====");
    }
    //method binary merupakan salah satu jenis dari proses searching yang berfungsi mencari data pada suatu list dengan cara membagi data
    //pada list menjadi 2 bagian, data-data tersebut sebelumnya telah di sorting terlebih dahulu.
    //proses akan selalu membagi data pada list menjadi 2bagian terus menerus sampai data pada list sudah menjadi satu persatu/satu ruangan
    //satu data atau data telah temukan

    //pada method binary digunakan beberapa parameter diantaranya, yaitu parameter generic linkedlist dengan variabel list dan tipe data data
    // variabel low dan high yang sama-sama bertipe data integer dan juga terdapat variabel key yang bertipe data string
    //dalam method ini digunakan statement pengkondisian
    private static int binaryMethod(LinkedList<data> list, int low, int high, String key) {
        //if merupakan statement pengkondisian yang bekerja dengan memberikan syarat sebelum program dapat menjalankan fungsi/code didalamnya
        //pada baris ini digunakan syarat berupa variabel high lebih dari sama dengan variabel low
        if (high >= low) {
            //menginisialisasi nilai variabel mid dengan melakukan perhitungan matematika
            int mid = low + (high - low) / 2;
            //baris ini berfungsi untuk mengembalikan nilai mid jika string pada variabel key sama dengan string pada list
            if (key.equalsIgnoreCase(list.get(mid).name))
                return mid;
            //baris ini berfungsi untuk mengembalikan nilai bahwa data berada pada range awal sampai mid
            if (key.compareToIgnoreCase(list.get(mid).name) < 0)
                return binaryMethod(list, low, mid - 1, key);
            //baris ini berfungsi untuk mengembalikan nilai bahwa data berada pada range mid sampai akhir
            return binaryMethod(list, mid + 1, high, key);
        }
        //return berfungsi untuk mengembalikan nilai
        return -1;
    }

    //method print berfungsi untuk melakukan proses output atau menampilkan data ke jendela layar
    //menggunakan parameter generic berupa linkedlist dengan variabel list dan tipe data data
    //pada method ini digunakan perulangan agar dapat melakukan print terhadap data pada list
    public static void print(LinkedList<data> list) {
        //perulangan menggunakan for dengan syarat i tidak lebih dari jumlah karakter pada string (function capacity)
        for (int i = 0; i < list.capacity(); i++) {
            //system.out.print merupakan sintaks yang berfungsi untuk melakukan proses output/print
            //system.out.println merupakan sintaks yang berfungsi untuk melakukan proses output/print dan akan membuat baris baru setelahnya
            System.out.print("Nama: " + list.get(i).name);
            System.out.print(", Harga: Rp" + list.get(i).price);
            System.out.println(", Stok: " + list.get(i).stock);
        }
    }
}