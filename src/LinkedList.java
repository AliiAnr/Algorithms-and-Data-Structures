public class LinkedList<T> { // penggunaan public agar diakses oleh class lain
    private static class Node<T> { // <T> sebagai pembentukan generic yang digunakan ketika melakukan passing argumen
                                   // tidak dalam bentuk value tetapi dalam bentuk tipe data. dimana tipe data tersebut
                                   // ditentukan pada saat pembentukan objek pertamakali.

        // class ini berfungsi sebagai tempat penyimpanan data, seperti yang kita ketahui linkedlist merupakan
        // kumpulan dari berbagai data dimana data tersebut direpresentasikan sebagai simpul. simpul-simpul tersebut dihubungkan
        // oleh penujuk dimana penunjuk tersebut adalah alamat dari simpul-simpul yang lain, ibaratkan kita ingin
        // mengunjungi rumah seseorang, dan kita mempunyai alamat orang tersebut, selanjutnya sebagai penunjuk jalan ke alamat tersebut
        // kita menggunakan Google Maps, nahh google maps tersebut merupakan penunjuk yang digunakan pada class ini.

        // penunjuk tersebut dapat menunjuk ke arah selanjutnya (next) dan arah sebelumnya (prev) sebagai penghubung kedua simpul.
        // penunjuk-penunjuk ini membentuk rangkaian yang saling berhubungan, itu kenapa terbentuklah linkedlist, dalam kasus ini
        // digunakan double linkedlist karena terdapat dua arah yang saling menunjuk simpul.

        // Ada bentuk constructor yang berfungsi sebagai penempatan suatu objek dalam memori, dan didalam consructor
        // terdapat label-label yang akan menggambarkan objek ketika dibentuk.
        T data; // T digunakan sebagai tipe data yang diambil pada saat objek pertama kali dibentuk
                // misal pada saat pembentukan objek LinkedList<String> simpul = new LinkedList<>();
                // maka T sekarang merupakan tipe data String.
        Node<T> next; // penunjuk data selanjutnya
        Node<T> prev; // penunjuk data sebelumnya

        Node(T data) {
            this.data = data; // penggunaan (this) untuk mencegah terjadinya variabel shadowing
        }
        // ketika membuat objek baru --> Orang data = new Orang(); program akan memberitahukan bahwa objek tersebut haruslah terdapat label
        // karena terdapat constructor
        // jika pembuatan objek baru dengan --> Orang data = new Orang("aryu", 167, 67); program akan memberitahukan bahwa objek tersebut sesuai
        // karena saat pembentukannya telah diberikan label sebagai penanda objek tersebut.
    }

    Node<T> head; // mendeklarasikan variabel head sebagai label atau penanda bahwa suatu list
                  // tersebut terdapat ujung atas (head) agar data tersebut dapat diakses tanpa menggunakan alamat
                  // pada saat pengaksesannya
    Node<T> tail; // mendeklarasikan variabel tail sebagai label atau penanda bahwa suatu list
                  // tersebut terdapat ujung bawah (tail) agar data tersebut dapat diakses tanpa menggunakan alamat
                  // pada saat pengaksesannya

    public void addBack(T data) {
        // fungsi addBack digunakan untuk menambah data atau simpul baru ke belakang list.
        // T pada parameter merupakan tipe data yang diambil pada saat objek pertama kali dibentuk
        // misal pada saat pembentukan objek LinkedList<String> simpul = new LinkedList<>();
        // maka T sekarang merupakan tipe data String.
        // pada fungsi ini ketika data dibentuk akan dicek apakah pada list itu kosong atau tidak
        // jika kosong data akan menjadi data head
        // tetapi jika sudah terdapat data, maka akan dicek melalui perulangan dimana apabila data setelahnya kosong
        // maka data setelahnya akan dimasukkan dengan data baru, sehingga ketika data-data dimasukkan akan terus mengecek
        // dimana tempat data yang kosong
        if (head == null) {
            // pada saat pembuatan data, jika data tersebut kosong (belum ada data apapun) data tersebut akan
            // dibuat menjadi head sebagai pembentukan data baru dan pelabelan data tersebut
            head = new Node<>(data);
            return;
        }
        Node<T> current = head; // pembentukan current yang menjadi label head, untuk mengecek data, dimana jika dilakukan pengecekan data
                                // menggunakan head, maka tidak ada yang menjadi penanda ujung atas (head) dari list tersebut yang membuat
                                // simpul-simpul tersebut tidak dapat diakses.
        while (current.next != null) { // perulangan yang akan mengecek dimana terdapat data kosong sehingga data baru akan ditempatkan
                                       // pada tempat tersebut
            current = current.next; // menjalankan current
        }
        current.next = new Node<>(data);
        tail = current.next; // menjalankan current untuk pengecekan
        tail.prev = current; // menjadikan data sebelum dari data terakhir sebagai current
    }

    public void addFront(T data) {
        // fungsi addFront digunakan untuk menambah data atau simpul baru ke depan list.
        // T pada parameter merupakan tipe data yang diambil pada saat objek pertama kali dibentuk
        // misal pada saat pembentukan objek LinkedList<String> simpul = new LinkedList<>();
        // maka T sekarang merupakan tipe data String.
        // pada fungsi ini ketika data dibentuk akan dicek apakah pada list itu kosong atau tidak
        // jika kosong data akan menjadi data head
        // tetapi jika sudah terdapat data, maka data baru akan ditambah di depan list dan menjadi head (awal).
        if (head == null) {
            // pada saat pembuatan data, jika data tersebut kosong (belum ada data apapun) data tersebut akan
            // dibuat menjadi head sebagai pembentukan data baru dan pelabelan data tersebut.
            head = new Node<>(data);
            return;
        }
        Node<T> temp = new Node<>(data); // pembentukan objek baru yang mengalokasikan memori
        temp.next = head; // menjadikan data temp menunjuk ke head;
        head = temp; // menjadikan temp sebagai head;
        temp.next.prev = head; // menjadikan data sebelumnya dari data setelah temp adalah head;
    }

    public void add(T data) {
        addBack(data);
    } // merupakan function overloading yang digunakan untuk memanggil fungsi
                                               // dengan parameter yang berbeda tetapi nama fungsi yang sama

    public void add(int index, T data) {
        // merupakan function overloading dimana pada fungsi ini menambah data sesuai index yand ditentukan
        // T pada parameter merupakan tipe data yang diambil pada saat objek pertama kali dibentuk
        // misal pada saat pembentukan objek LinkedList<String> simpul = new LinkedList<>();
        // maka T sekarang merupakan tipe data String.

        // penambahan data yang dimaksud adalah jika ada linkedlist yang terdiri dari 4 simpul
        // jika ingin menambah pada indeks ke 2, maka data tersebut akan dibentuk objeknya dan akan ditambahkan
        // pada simpul ke dua, dan simpul kedua sebelumnya akan dijadikan simpul setelahnya.
        Node<T> current = head; // melabelkan head dengan current.
        Node<T> temp; // mendeklarasikan variabel temp dengan tipe data T
        int pos = 0; // menginisialisasikan pos = 0 sebagia default value
        if (index == 0) { // jika indeks 0 data akan ditambahkan di depan
            addFront(data);
        }
        while (current.next != null) { // perulangan untuk menambahkan data jika indeks sudah ditemukan saat perulangan
            if (index - 1 == pos) { // kondisi if sesuai parameter
                temp = current.next; // temp akan di jadikan sebagai data setelah current
                current.next = new Node<>(data); // objek baru akan di masukkan setelah current
                current.next.prev = current; // data sebelumnya dari data setelah current akan menyimpan nilai  current
                current.next.next = temp; // data dua kali setelah current akan menyimpan data dari temp
                return;
            } else
                pos++; // penambahan pos
            current = current.next; // menjalankan current
        }
        if (index - 1 == pos) { // perulangan untuk menambahkan data jika indeks sudah ditemukan saat perulangan
            current.next = new Node<>(data);
            current.next.prev = current; // data sebelumnya dari data setelah current akan menyimpan nilai  current
        } else {
            System.out.println("\nINDEX DOESN'T EXIST!!! CAN'T ADD NEW DATA!"); // apabila indeks yang ditentukan tidak sesuai atau data tidak ditemukan
        }
    }

    public T get(int index) { // mencari data pada indeks yang dimasukkan
                              // pada fungsi ini dilakukan pengecekan data sesuai indeks yang ditentukan
        Node<T> current = head; // melabelkan head sebagai current.
        int pos = 0; // menginisialisasikan pos = 0 sebagia default value
        while (current != null) { // dilakukan perulangan untuk mencari data sesuai indeks yang ditentukan
            if (index == pos) { // jika indeks sesuai pos maka yang di nilai yang dikembalikan adalah data
                return current.data;
            } else
                pos++;
            current = current.next; // menjalankan current
        }
        System.out.println("\nINDEX DOESN'T EXIST!!! CAN'T GET THE DATA!"); // apabila indeks yang ditentukan tidak sesuai atau data tidak ditemukan
        return null;
    }

    public Node<T> getObj(int index) { // mencari node pada indeks  sesuai indeks yang ditentukan
                                       // pada fungsi ini dilakukan pengecekan objek sesuai indeks yang ditentukan
        Node<T> current = head; // melabelkan head dengan current.
        int pos = 0; // menginisialisasikan pos = 0 sebagia default value
        while (current != null) { // dilakukan perulangan untuk mencari node sesuai indeks yang ditentukan
            if (index == pos) { // jika indeks sesuai pos maka yang di nilai yang dikembalikan adalah node
                return current;
            } else
                pos++;
            current = current.next; // menjalankan current
        }
        System.out.println("\nINDEX DOESN'T EXIST!!! CAN'T GET THE DATA!");  // apabila indeks yang ditentukan tidak sesuai atau node tidak ditemukan
        return null;
    }

    public void delete(int index) {
        // fungsi ini digunakan untuk menghapus data sesuai indeks
        //dimana pada fungsi ini dilakukan perulangan untuk mencari data sesuai indeks yang ditentukan
        // hal yang dilakukan pertamakali adalah mengecek apakah indeks tersebut menunjuk kepada head
        // apabila iya, data head akan dihapus dan diganti oleh data setelah head
        // setlah itu akan dicek data apakah sesuai indeks, dilakukan perulangan dan current akan berjalan hingga data ditemukan
        // apabila data ditemukan maka pencarian selesai dan data tersebut akan dihapus.
        if (index == 0) {
            head = head.next;
            return;
        }
        Node<T> current = head;
        int pos = 0;
        while (current.next != null) {
            if (index - 1 == pos) {
                current.next = current.next.next;
                current.next.prev = current;
                return;
            } else
                pos++;
            current = current.next; // menjalankan current
        }
        System.out.println("\nINDEX DOESN'T EXIST!!! CAN'T DELETE THE DATA!"); // apabila indeks yang ditentukan tidak sesuai atau data tidak ditemukan
    }

    public int capacity() {
        // fungsi ini digunakan untuk mengetahui panjang dari linkedlist, dimana akan dilakukan perulangan sampai ditemkan panjang linkedlist
        // pada fungsi ini current akan berjalan dan mencatat panjang dari linkedlist
        // ketika sudah selesai, maka fungsi akan mengembalikan nilai atau panjang dari linkedlist
        Node<T> current = head;
        int capacity = 0;
        while (current != null) {
            capacity++;
            current = current.next; // menjalankan current
        }
        return capacity;
    }

    public void swap(int index1, int index2) {
        // fungsi ini digunakan untuk menukar simpul untuk menjadikan simpul terurut, pada fungsi ini akan dicek simpul demi simpul
        // apabila sudah terdapat simpul yang memenuhi maka akan di tuker posisi agar terurut
        if (index1 == index2) //jika simpul 1 dan simpul 2 berbobot sama, maka tidak mengembalikan apa apa
            return;

        Node<T> Node1 = getObj(index1), Node2 = getObj(index2); // mendeklarasikan dan menginisialisasi dengan memanggil fungsi getObj
                                                                // karena pada fungsi gerObj akan mengembalikan node

        Node<T> temp; // mendeklarasikan variabel temp
        temp = Node1.next;                  // kode ini digunakan untuk menukar posisi node
        Node1.next = Node2.next;            // tiap node yang  memenuhi kondisi akan ditukar
        Node2.next = temp;                  // dengan cara menggunakan variabel bantu untuk menyimpan nilai sebelumnya

        if (Node1 == head)                // jika node1 samadengan head
            head = Node2;                 // maka node2 akan dijadikan sebagai data awal (head)
        else if (Node2 == head)           // tetapi jika node2 samadengan head
            head = Node1;                 // maka sebaliknya, node1 akan dijadikan head
        if (Node1 == tail)                // jika node1 samadengan tail
            tail = Node2;                 // maka node2 akan dijasikan tail
        else if (Node2 == tail)           // tetapi jika node2 samadengan tail
            tail = Node1;                 // maka node1 akan dijadikan sebagai data akhir (tail)

        if (Node1.next != null)           // jika data setelah node1 tidak sama dengan null
            Node1.next.prev = Node1;      // maka data sebelumnya dari data setelah node1 akan menyimpan nilai dari node1
        if (Node2.next != null)           // jika data setelah node2 tidak sama dengan null
            Node2.next.prev = Node2;      // maka dara sebelumnya dari data setelah node2 akan menyimpan nilai dari node2

        temp = Node1.prev;                // kode ini digunakan untuk menukar posisi node
        Node1.prev = Node2.prev;          // tiap node yang  memenuhi kondisi akan ditukar
        Node2.prev = temp;                // dengan cara menggunakan variabel bantu untuk menyimpan nilai sebelumnya

        if (Node1.prev != null)           // jika data sebelum node1 tidak samadengan null
            Node1.prev.next = Node1;      // maka data sebelumnya dari data setelah node1 akan menyimpan nilai dari node1
        if (Node2.prev != null)           // jika data sebelum node2 tidak samadengan null
            Node2.prev.next = Node2;      // maka data sebelumnya dari data setelah node2 akan menyimpa nilai dari node2
    }

}
