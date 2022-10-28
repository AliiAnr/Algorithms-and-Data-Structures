package MODUL_2;

public class Main2 {
    public static void main(String[] args) { // merupakan fungsi utama dimana semua statement dijalankan, statement tidak dapat dijalankan
        // selain dari fungsi ini.
        String infix = "(A+B)*C-(D-E)*(F+G)"; // mendeklarasikan variabel yang bernama infix dan diisi dengan String yang telah ditentukan
        System.out.println("Notasi Infix : " + infix); /// menampilkan data sesuai yang ingin ditampilka
        System.out.println("\nNotasi Postfix : " + Infix.toPostfix(infix)); // menampilkan data sesuai yang ingin ditampilka
        System.out.println("Notasi Prefix : " + Infix.toPrefix(infix)); // menampilkan data sesuai yang ingin ditampilka
    }
}
