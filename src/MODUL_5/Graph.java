package MODUL_5;

public class Graph {
    // line dibawah merupakan pendeklarasian tipe data vertex dengan variabel head,
    // tail dan current
    // head merepersentasikan data pertama dalam list sedangkan tail untuk data
    // terakhir sedangkan current berfungsi dalam membantu
    // menunjuk data dalam list tanpa merubah urutan dalam list
    Vertex head, tail, current;

    // method addVertex adalah method yang berfungsi untuk menambah data pada graph
    // seperti representasi node dalam linkedlist
    public void addVertex(String name, String item1, String item2) {
        String item[] = { "", "" };
        item[0] = item1;
        item[1] = item2;
        Vertex newVertex = new Vertex(name, item);
        // suatu kondisi yang dimana jika head adalah null maka head dan tail akan di
        // beri nilai newVertex yang berupa data baru
        if (head == null) {
            head = tail = newVertex;
        } else {
            /*
             * line dibawah digunakan untuk menambahkan vertex jika kondisi diatas tidak
             * dipenuhi
             * nilai tail.next akan menjadi nilai newvertex setelah itu newVertex.prev akan
             * dijadikan nilai tail
             * setelah itu nilai tail yang baru akan dijadikan nilai vertex dan setelahnya
             * akan dikosongkan atau null
             */
            tail.next = newVertex;
            newVertex.prev = tail;
            tail = newVertex;
            tail.next = null;
        }
    }

    public Vertex searchVertex(Object search) {
        // line dibawah digunakan untuk membuat nilai current menjadi nilai head
        current = head;
        /*
         * kondisi dibawah merupakan perulangan dimana jika nilai current tidak sama
         * dengan nilai null maka
         * akan dijalankan kondisi dimana jika current.name sama dengan search maka akan
         * mengembalikan nilai current
         */
        while (current != null) {
            if (current.name == search) {
                return current;
            }
            current = current.next;
        }
        // line dibawah digunakan untuk mengembalikan nilai kosong atau null
        return null;
    }

    // method addEdge adalah method yang berfungsi untuk menyambungkan 2 vertex agar
    // saling terhubung
    public void addEdge(String VerFrom, String VerTo) {
        Vertex from = searchVertex(VerFrom);
        Vertex to = searchVertex(VerTo);
        from.setEdge(to);
    }

    // method printGraph adalah method yang berfungsi untuk menampilkan ke layar
    // graph yang telah dibuat
    public void printGraph() {
        current = head;
        while (current != null) {
            // System.out.println(current.name + " : [" + current.item[0] + ", " +
            // current.item[1] + "]");
            if (current.edgeHead != null) {
                System.out.println("Vertex " + current.name + " : ");
                // melakukan pengakasesan method printEdge() dari class Vertex
                current.printEdge();
            }
            current = current.next;
        }
    }

    // Method DFS merupakan method yang digunakan untuk melakukan pencarian pada
    // graph
    public void DFS(Vertex start, Stack stack) {
        // kondisi jika start sama dengan null maka nilai di return
        if (start == null) {
            return;
            // Kondisi jika start tidak sama dengan null
        } else {
            // Digunakan untuk menendai vertex jika sudah dilewati
            start.visited = true;
            // Digunakan untuk menampilkan nama vertex dan item-itemnya
            System.out.println(start.name + " : [" + start.item[0] + ", " + start.item[1] + "]");
            // Kondisi jika tail pada edge tidak sama dengan null
            if (start.edgeTail != null) {
                Edge currEdge = start.edgeTail;
                while (currEdge != null) {
                    // jika edge blu dikunjungi maka edge tujuan akan di push
                    if (currEdge.to.visited == false) {
                        stack.push(currEdge.to);
                    }
                    // Digunakan untuk menjalankan current
                    currEdge = currEdge.prev;
                }
            }
            // jika data top pada stack bernilai null
            if (stack.top == null) {
                // Digunakan untuk mengunjungi edge yang belum dikunjungi
                unvisited();
                return;
            }
            // Melakukan pencarian pada stack menggunakan DFS
            DFS(stack.pop(), stack);
        }
    }

    public void DFSprint() {
        // line dibawah merupakan penginisialisasian objek Stack agar bisa digunakan
        // pada program yang dijalankan
        Stack st = new Stack();
        if (head != null) {
            DFS(head, st);
        }
    }

    // Method dibawah digunakan untuk melakukan pencarian dengan menggunakan BFS
    public void BFS(Vertex start, Queue queue, String search, Node data) {
        // Kondisi jika start bernilai null
        if (start == null) {
            return;
            // Kondisi jika BFS tidak sama dengan null
        } else {
            // Jika start sudah dikunjungi
            start.visited = true;
            // jika item yang dicari ditemukan maka data akan ditampilkan
            if (search.equals(start.item[0]) || search.equals(start.item[1])) {
                System.out.println("Ketemu, " + search + " ada di:");
                System.out.println(data.year + ", " + start.name);
            }

            // Kondisi jika tail pada edge tidak sama dengan null
            if (start.edgeTail != null) {
                //menaruh curr pada head edge
                Edge currEdge = start.edgeHead;
                // perulangan selama curr tidak sama dengan null
                while (currEdge != null) {
                    // Kondisi yang dijalankan jika edge belum dikunjungi
                    if (currEdge.to.visited == false) {
                        // data tujuan pada curr edge ditambahkan pada queue
                        queue.enqueue(currEdge.to);
                    }
                    currEdge = currEdge.next;
                }
            }
            if (queue.tail == null) {
                return;
            }
            BFS(queue.dequeue(), queue, search, data);
        }
    }

    public void BFSSearch(String search, Node data) {
        if (head != null) {
            Queue queue = new Queue();
            BFS(head, queue, search, data);
        }
        unvisited();
    }

    public void unvisited() {
        Vertex current = head;
        while (current != null) {
            current.visited = false;
            current = current.next;
        }
    }
}
