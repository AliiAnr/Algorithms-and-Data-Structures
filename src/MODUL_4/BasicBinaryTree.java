package MODUL_4;
// class Tree adalah class yang berisi operasi-operasi yang berfungsi untuk membuat Structure Tree
public class BasicBinaryTree {
        // Node yang digunakan untuk mendefinisikan nilai dari root dan parent
        btNode root, parent = null;
        // variabel i digunakan untuk numbering pada method inorder transerval
        int i = 1;
        // method search adalah method yang digunakan untuk mencari parent dari node yang ditambahkan
        public void search(btNode ortu, Object search) {
            // nilai ortu tidak sama dengan null atau bernilai true maka code didalamnya akan dijalankan
            if (ortu != null) {
                // jika nama dari ortu sama dengan variabel search maka ortu akan disimpan pada variabel parent
                if (ortu.nama.equals(search)) {
                    parent = ortu;
                    return;
                }
            }
            // jika sebelah kiri ortu tidak sama dengan null atau bernilai true maka akan dijalankan rekursif dengan argumen nilai sebelah kiri ortu dan objek search sebagai nilai atau untuk mencari ke sebelah kiri parent
            if (ortu.left != null) {
                search(ortu.left, search);
            }
            // jika sebelah kanan ortu tidak sama dengan null atau bernilai true maka akan dijalankan rekursif dengan argumen nilai sebelah kiri ortu dan objek search sebagai nilai atau untuk mencari ke sebelah kanan parent
            if (ortu.right != null) {
                search(ortu.right, search);
            }
        }
        // method addNode adalah method yang digunakan untuk menambahkan node pada structure tree
        public void addNode(Object ortu, Object data) {
            // jika root sama dengan null maka new node akan di jadikan sebagai root, node berisi data dan level dari node tersebut
            if (root == null) {
                root = new btNode(data, 1);
                System.out.println(data + " dibuat sebagai ROOT");
                // return digunakan untuk menghentikan method
                return;
            }
            // search digunakan untuk mencari dan menentukan parent node yang akan ditambahkan
            search(root, ortu);
            // lakukan pemerikasaan jika left child parent kosong maka data akan di tambahkan sebagai left child dari parent
            if (parent.left == null) {
                parent.left = new btNode(data, parent.level + 1);
                // inisialisasi parent dari left child
                parent.left.parentChild = parent;
                System.out.println(data + " ditambahkan Sebagai LEFT child dari " + parent.nama);
                // return digunakan untuk menghentikan method
                return;
            }
            // lakukan pemerikasaan jika right child parent kosong maka data akan di tambahkan sebagai right child dari parent
            if (parent.right == null) {
                parent.right = new btNode(data, parent.level + 1);
                // inisialisasi parent dari right child
                parent.right.parentChild = parent;
                System.out.println(data + " ditambahkan Sebagai RIGHT child dari " + parent.nama);
                // return digunakan untuk menghentikan method
                return;
            }
        }
        // method relationShip digunakan untuk menentukan hubungan setiap data yang ada pada node
        public void relationShip(Object nama1, Object nama2) {
            // lakukan pencarian nama 1 lalu simpan di variabel temp1
            search(root, nama1);
            btNode temp1 = parent;
            // lakukan pencarian nama 2 lalu simpan di variabel temp2
            search(root, nama2);
            btNode temp2 = parent;
            // jika level dan parent data sama, maka data tersebut adalah saudara
            if (temp1.level == temp2.level && temp1.parentChild.equals(temp2.parentChild)) {
                System.out.println(temp1.nama + " adalah saudara dari " + temp2.nama);
                return;
                // jika level data sama tetapi parent data berbeda maka hubungan data tersebut adalah saudara jauh
            } else if (temp1.level == temp2.level && temp1.parentChild != temp2.parentChild) {
                System.out.println(temp1.nama + " adalah saudara jauh dari " + temp2.nama);
                return;
                // jika parent data 1 adalah data 2 maka data 1 adalah anak data 2
            } else if (temp1.parentChild.equals(temp2)) {
                System.out.println(temp1.nama + " adalah anak dari " + temp2.nama);
                return;
                // jika selisih level 3 atau -3 maka hubungan data tersebut adalah cicit
            } else if (temp1.level - temp2.level == 3 || temp2.level - temp1.level == -3) {
                System.out.println(temp1.nama + " adalah cicit dari " + temp2.nama);
                return;
                // jika selisih level = 2 atau -2 dan grandParent data 1 adalah data 2 maka hubungan data tersebut adalah cucu
            } else if (temp1.level - temp2.level == 2 || temp2.level - temp1.level == -2) {
                btNode grandParent = temp1.parentChild;
                if (grandParent.parentChild.equals(temp2)) {
                    System.out.println(temp1.nama + " adalah cucu dari " + temp2.nama);
                    return;
                }
                // jika grandParent data 1 bukan data 2 maka hubungan data tersebut adalah cucu jauh
                System.out.println(temp1.nama + " adalah cucu jauh dari " + temp2.nama);
                return;
                // jika selisih level = 1 atau -1 dan parent data 2 bukan grandParent data 1 maka hubungan data tersebut adalah keponakan jauh
            } else if (temp1.level - temp2.level == 1 || temp1.level - temp2.level == -1 && temp2 != temp1.parentChild) {
                btNode grandParent = temp1.parentChild;
                if (grandParent.parentChild != temp2.parentChild) {
                    System.out.println(temp1.nama + " adalah keponakan jauh dari " + temp2.nama);
                    return;
                }
                // jika parent data 2 merupakan grandParent data 1 maka hubungannya adalah keponakan
                System.out.println(temp1.nama + " adalah keponakan dari " + temp2.nama);
                return;
            }
        }
        // method inOrderPrint adalah method yang digunakan untuk mengakses data pada structure tree dengan metode in order transerval
        public void inOrderPrint(btNode node) {
            // jika node tidak sama dengan null atau bernilai true maka akan dijalankan rekursif untuk mencari transerval in order
            if (node != null) {
                // melakukan rekursif untuk mengarah ke kiri node
                inOrderPrint(node.left);
                // jika child kiri dan kanan node tidak sama dengan null maka print node dan child kiri dan kanannya
                if (node.left != null && node.right != null) {
                    System.out.println(i++ + ". " + node.nama + " : " + node.left.nama + " & " + node.right.nama);
                    // jika child kanan bernilai null dan child kiri tidak sama dengan null print node dan left childnya
                } else if (node.right == null && node.left != null) {
                    System.out.println(i++ + ". " + node.nama + " : " + node.left.nama);
                    // jika child kiri bernilai null dan child kanan tidak sama dengan null print node dan right childnya
                } else if (node.left == null && node.right != null) {
                    System.out.println(i++ + ". " + node.nama + " : " + node.right.nama);
                    // jika kedua child bernilai null maka print nodenya
                } else if (node.left == null && node.right == null) {
                    System.out.println(i++ + ". " + node.nama + " : -");
                }
                // melakukan rekursif untuk mengarah ke kanan node
                inOrderPrint(node.right);
            }
        }
    }
