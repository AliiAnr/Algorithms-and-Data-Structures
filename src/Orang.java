public class Orang { // penggunaan public agar dapat diakses oleh class lain

//    Class orang yang digunakan sebagai objek untuk merepresentasikan bentuk sebuah dataset
//    dimana objek tersebut diibaratkan sebagai bentuk abstrak dari data yang ingin dibuat.
//    kita ambil contoh objek tersebut merupakan manusia, dimana memiliki nama, tinggi, dll.
//    jadi class Orang ini sebagai sebuah bentuk yang tidak konkrit (abstrak), yang hanya memberikan label ke objek tersebut.
//    lalu label tersebut diisi dengan karakteristik dari objek tersebut.

//    selanjutnya ada bentuk constructor yang berfungsi sebagai penempatan suatu objek dalam memori, dan didalam consructor
//    terdapat label-label yang akan menggambarkan objek ketika dibentuk.

//    Penggunaan :
//    ketika dilakukan pembentukan objek baru, maka label atau atribut yang terdapat pada class ini harus diisi,
//    karena terdapat constructor yang memaksa pengisian atribut saat pertama kali dibuat.

    String nama; // atribut (label) nama yang akan diisi dengan nama Objek
    int tinggi; // atribut (label) tinggi yang akan diisi dengan tinggi objek
    int kpow; // atribut (label) power yang akan diisi dengan power objek

    Orang(String nama, int tinggi, int kpow) {
//        ketika membuat objek baru --> Orang data = new Orang(); program akan memberitahukan bahwa objek tersebut haruslah terdapat label
//        karena terdapat constructor
//        jika pembuatan objek baru dengan --> Orang data = new Orang("rix", 187, 87); program akan memberitahukan bahwa objek tersebut sesuai
//        karena saat pembentukannya telah diberikan label sebagai penanda objek tersebut
        this.nama = nama; // penggunaan (this) untuk mencegah terjadinya variabel shadowing
        this.tinggi = tinggi;
        this.kpow = kpow;
    }
}
