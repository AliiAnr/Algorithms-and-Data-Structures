package MODUL_3;
//class ini berfungsi untuk menyimpan value dan juga sebagai tipe data abstrak
//didalamnya terdapat 3 tipe data lainnya berupa name dengan tipe data string
//dan juga variabel price dan stock yang sama-sama menggunakan tipe data integer
//penggunaan ketiga tipe data tersebut untuk penyelesaian terkait permasalahan kasus
public class data {
    String name;
    int price;
    int stock;
    //baris ini merupakan constructor, berfungsi untuk inisialisasi
    //terdapat tuga parameter yaitu variabel name, price dan stock
    data(String name, int price, int stock) {
        //this. berfungsi untuk menunjuk suatu variabel sehingga walaupun ada variabel dengan nama yang sama, program masih bisa membedakan
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}