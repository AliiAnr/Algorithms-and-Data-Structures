package MODUL_5;

// class Node merupakan class yang digunakan untuk merepresentasikan tiap Node yang di list
class NodeStack {
    // variabel next merupakan variabel yang berfungsi untuk menunjuk node selanjutnya pada stack
    NodeStack next;
    // String nama merupakan variabel yang di gunakan untuk menginpukan data nama
    Vertex nama;
    // Constructor Node adalah method yang berfungsi untuk menginisialisasi variabel- variabel instans yang akan dimiliki oleh objek
    public NodeStack(Vertex nama){
        //this.nama berfungsi sebagai referensi untuk objek nama saat ini yang dimiliki oleh constructor Node
        this.nama = nama;
    }
}
// Class Stack merupakan class tempat method yang akan di gunakan untuk menyimpan data ke stack
public class Stack {
    // top merupakan variabel yang akan digunakan sebagai penanda dari node paling atas pada stack
    NodeStack top;
    // push merupakan method untuk menambahkan data ke dalam stack dengan parameter nama sebagai data yang akan di inputkan
    public void push(Vertex nama) {
        // Node baru merupkan object dari class Node yang berisi constructor Node yang digunakan untuk menambahkan node baru di stack
        NodeStack baru = new NodeStack(nama);
        // if merupakan kondisi bersyarat dimana jika syarat kondisi tersebut terpenuhi maka code yang ada di dalam blok kondisi tersebut akan di proses
        if (top == null) {
            // top = baru digunakan untuk menjadikan node pertama pada stack sebagai node paling atas
            top = baru;
            // kondisi else merupakan kondisi dmana code yang ada di dalam bloknya akan di proses jika syarat kondisi if tidak terpenuhi
        } else {
            // baru.next digunakan untuk menghungkan node baru ke node selanjutnya yaitu node top
            baru.next = top;
            // top = baru berfungsi untuk memindahkan posisi top ke node baru sehingga node baru menjadi top atau node teratas
            top = baru;
        }
    }
    // method pop merupakan method yang digunakan untuk menghapus dan menyimpan data teratas dari stack lalu menjadikan node dibawahnya sebagai top atau data teratas
    public Vertex pop() {
        // temp merupakan variabel yang digunakan untuk menyimpan data teratas dari stack sebelum di keluarkan dari stack
        Vertex temp = top.nama;
        // top = top.next digunakan untuk membuat data di bawah top sebagai top atau data teratas
        top = top.next;
        // return temp.nama digunakan untuk mengembalikan data nama yang ada di dalam variabe temp
        return temp;
    }
    // print merupakan method yang di gunakan untuk menampilkan semua data yang ada di dalam stack
    public void print() {
        // current = top digunakan untuk  menempatkan variable current pada top atau node teratas
        NodeStack current = top;
        // while looping dengan syarat current tidak sama dengan null digunakan sebagai perulangan untuk memindahkan posisi current
        while (current != null) {
            // System.out.print merupakan perintah yang berfungsi untuk mencetak data
            if (current.next != null) {
                // System.out.print merupakan perintah yang berfungsi untuk mencetak data
                System.out.println(current.nama.name);
                // System.out.print merupakan perintah yang berfungsi untuk mencetak data
                System.out.println("^");
                // kondisi else merupakan kondisi dmana code yang ada di dalam bloknya akan di proses jika syarat kondisi if tidak terpenuhi
            } else {
                // System.out.print merupakan perintah yang berfungsi untuk mencetak data
                System.out.println(current.nama.name);
            }
            // current = current.next digunakan untuk memindahkan posisi current ke node selanjutnya
            current = current.next;
        }
    }
    // save merupakan method yang digunakan untuk menyimpan data yang akan di pop pada stack
    public void save(Stack obj, Stack obj2, Object choose) {
        // current = top digunakan untuk  menempatkan variable current di top atau node teratas
        NodeStack current = obj.top;
        // while looping dengan syarat current tidak sama dengan null digunakan sebagai perulangan untuk memindahkan posisi current
        while (current != null) {
            // obj2.push(obj.pop()) digunakan untuk menyimpan data yang di pop dari stack pada object 1 ke stack pada object 2
            obj2.push(obj.pop());
            // System.out.print merupakan perintah yang berfungsi untuk mencetak data
            if (current.next.nama.equals(choose)) {
                // obj.pop digunakan untuk meghapus data teratas jika sudah sesuai dengan pengkondisian
                obj.pop();
                // break digunakan untuk menghentikan proses yang ada di dalam methode ini
                break;
            }
            // current = current.next digunakan untuk memindahkan posisi current ke node selanjutnya
            current = current.next;
        }
    }
    // merge stack adalah methode untuk menggabungkan 2 stack dari object yang berbeda menggunakan parameter dengan tipe data nama class stack tersebut agar stack tersebut dapat di akses
    public void mergeStack(Stack stack, Stack stack2) {
        // while looping dengan  syarat stack2.top != null digunakan untuk mengecek apakah terdapat data pada object stack2
        while (stack2.top != null) {
            // stack.push(stack2.pop()) digunakan untuk memindahkan data yang ada pada object stack2 ke object stack1
            stack.push(stack2.pop());
        }
    }
    // method peek digunakan untuk mengembalikan nilai yang ada pada top atau node teratas
    public Vertex peek(){
        //return digunakan untuk mengembalikan nilai top atau node teratas
        return top.nama;
    }

    // method dibawah merupakan method untuk mencari data pada progam yang dijalankan
    public Vertex searchData(String data){
        NodeStack current = top;
        // line dibawah merupakan pengkondisian dimana jika current tidak sama dengan null maka akan menjalankan pengkondisian
        // dimana jika current.nama nilainya sama dengan data maka akan mengembalikan nilai current.nama
        while(current != null){
            if(current.nama.equals(data)){
                return current.nama;
            }
            current = current.next;
        }
        // line dibawah merupakan pengembalian nilai kosong atau null
        return null;
    }
}
