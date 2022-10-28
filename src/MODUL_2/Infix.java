package MODUL_2;

public class Infix { // pembuatan public class fun, tujuan menggunakan public agar dapat diakses di kelas lain
    public static void deleteString(Stack<String> data, String find) { // menghapus sebuah input yang berisi stack dari data dan string.
        // Secara umum fungsi ini berfungsi untuk mencari dan menghapus
        // data yang dipassing ke parameter, dimana parameter tersebut berisi
        // stack yang ingin dihapus datanya, dan node yang berisi string
        // yang ingin dihapus.
        // fungsi ini akan mengecek data dari tumpukan paling atas
        // akan terus mengecek menggunakan perulangan while
        // apabila data tidak ditemukan, fungsi akan terus melakukan pop
        // pop dilakukan secara berkala sampai data yang dicari ditemukan.
        // selama pop dilakukan, data akan disimpan kedalam objek baru.
        // tujuan penyimpanan data yang dipop kedalam objek baru adalah
        // agar data tersebut tidak hilang dari dalam memori.
        // selanjutnya ketika data ditemukan, data akan dipop akan tetapi tidak
        // disimpan kedalam objek baru dan perulangan diberhentikan dengan kondisi
        // break.

        Stack<String> newStack = new Stack<>();     // membuat stack baru untuk menyimpan data yang di pop dari stack yang mau dihapus datanya.
        while (data.getTop() != null) {             // melakukan perulangan hingga data tersebut habis (selesai di pop semua data).
            if (find.equals(data.getTop().value)) { // selanjutnya akan mencari data yang berada paling atas, apabila telah sesuai data maka data
                data.pop();                         // akan di pop tetapi tidak disimpan kedalam objek baru.
                break;                              // kondisi break, untuk menghentikan perulangan.
            }
            newStack.push(data.pop());              // melakukan pop terhadap data apabila belum ditemukan pada saat perulangan berjalalan.
        }
        while (newStack.getTop() != null) {         // perulangan yang digunakan untuk mengembalikan data yang telah dipop sebelumnya.
            data.push(newStack.pop());              // data-data yang dipop dan disimpan akibat tidak memenuhi syarat dari perulangan sebelumnya
        }                                           // akan dikembalikan ke tempatnya yang semua tanpa mengubah urutan dari data tersebut.
    }
    public static StringBuilder toPostfix(String infix) { // public static StringBuilder toPostfixdengan parameter yang digunakan yaitu String.
        // secara umum fungsi ini menggunakan StringBuilder yang digunakan untuk menyatukan karakter menjadi satu string.
        // pada saat ada data yang masuk bertipe data String, maka akan dicek karakter per karakter sehingga String tersebut dipecah
        // menjadi pecahan karakter. lalu karakter tersebut akan dihubungkan/disatukan menggunakan StringBuilder menjadi satu String utuh.
        // data sebelum disatukan akan dicek terlebih dahulu sesuai ketentuan pembuatan Postfix.
        Stack<Character> operator = new Stack<>();  // pembuatan objek untuk menyimpan karakter operator
        StringBuilder postfix = new StringBuilder(); // Pembuatan objek StringBuilder untuk menyimpan data String yang dibuat dari pecahan karakter
        for (int i = 0; i < infix.length(); i++) { // perulangan yang dilakukan dari i sampai kurang dari panjang String
            if (Character.isLetter(infix.charAt(i))) postfix.append(infix.charAt(i)); // memberikan syarat apabila karakter tersebut berupa huruf maka
            else if (infix.charAt(i) == '(') {                                        // akan dimasukkan ke objek Stringbuilder untuk disatukan
                operator.push(infix.charAt(i)); // apabila terdapat karakter '(' akan dipush ke dalam objek yang menyimpan karakter operator
            } else if (infix.charAt(i) == ')') { // apabila terdapat karakter ')' akan dipush ke dalam objek yang menyimpan karakter operator
                while (operator.getTop().value != '(') { // akan melakukan perulangan jika ketemu dengan operator ')' dan akan berhenti ketika bertemu dengan operator '('.
                    postfix.append(operator.pop()); // akan melakukan pop ketika menemukan karakter tidak sama dengan '('
                }
                operator.pop(); // mengeluarkan karakter yang berada pada top data ('(').
            } else {
                while (!operator.isEmpty() && !(operator.getTop().value == '(') && getPriority(infix.charAt(i)) <= getPriority(operator.getTop().value))
                    // melakukan perulangan untuk mengecek apabila karakter yang berada pada objek operator tidak sesuai dengan syarat dari while tersebut
                    postfix.append(operator.pop()); // apabila memenuhi syarat pengecekan, maka karakter yang sesuai syarat akan dipop dan disimpan pada objek operator.
                operator.push(infix.charAt(i)); // selanjutnya karakter tersebut akan dipush.
            }
        }
        while (!operator.isEmpty()) // perulangan dengan syarata apabila objek tersebut tidak kosong pada bagian topnya.
            postfix.append(operator.pop()); // selanutnya karakter yang memenuhi syarat akan dipop dan disimpan kedalam objek.
        return postfix; // mengebalikan nilai postfix
    }

    public static StringBuilder toPrefix(String infix) { // public static StringBuilder toPrefix dengan parameter yang digunakan yaitu String.
        return new StringBuilder(reverseEquation(toPostfix(reverseEquation(infix)).toString()));
        // akan mengembalikan nilai dari StringBuilder dari parameter, kondisi infix akan diubah menjadi kondisi Postfix  terlebih dahulu
        // selanjutnya akan di dilakukan reverse lagi agar dapat memenuhi ketentuan pembuatan kondisi Prefix dimana String akan dilakukan pembalikan
        //
    }

    private static String reverseEquation(String infix) { // public static String reverseEquation dengan parameter yang digunakan yaitu String.
        // secara umum fungsi ini digunakan untuk membalik posisi infix, ketika data String dipassing
        StringBuilder reverse = new StringBuilder(infix).reverse(); // pembuatan objek baru yang digunakan untuk membalikkan sebuah string, dimana string
        // yang dibalik tersebut merupakan persamaan infix yang dipassing ke parameter.
        for (int i = 0; i < infix.length(); i++) { // perulangan yang digunakan untuk mengecek karakter "tanda kurung" yang akan dibalik
            if (reverse.charAt(i) == '(') // menentukan kondisi karakter yang akan dibalik.
                reverse.setCharAt(i, ')');
            else if (reverse.charAt(i) == ')') // kondisi kedua jika kondisi pertama tidak memenuhi  untuk dibalik.
                reverse.setCharAt(i, '(');
        }
        return reverse.toString(); // mengembalikan data yang bertipe String
    }

    private static int getPriority(Character charAt) { // public static Int getPriority dengan parameter yang digunakan yaitu karakter.
        return switch (charAt) { // Switch return yang hanya terdapat pada java 14 ke atas.
            case '+', '-' -> 1; // mengembalikan nilai 1 ketika karakter '+' atau '-'.
            case '/', '*' -> 2; // mengembalikan nilai 2 ketika karakter '/' atau '*'.
            case '^' -> 3; // mengembalikan nilai 3 ketika karakter '^'.
            default -> 0; // mengembalikan nilai default yaitu 0.
        };
    }
}
