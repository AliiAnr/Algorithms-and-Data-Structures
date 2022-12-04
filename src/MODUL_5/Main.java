package MODUL_5;

public class Main {
    public static void main(String[] args) {
        Graph obj = new Graph();
        // line dibawah merupakan pemanggilan method dengan tampilan string sesuai dengan tampilan soal
        obj.addVertex("NEWYORK", "Super Serum", "Mie Ayam Ceker");
        // line dibawah merupakan pemanggilan method dengan tampilan string sesuai dengan tampilan soal
        obj.addVertex("ASGARD", "Mjolnir", "Sprite");
        // line dibawah merupakan pemanggilan method dengan tampilan string sesuai dengan tampilan soal
        obj.addVertex("MARKAS S.H.I.E.L.D", "Partikel Pym",  "Seblak Korea");
        // line dibawah merupakan pemanggilan method dengan tampilan string sesuai dengan tampilan soal
        obj.addVertex("WAKANDA", "Vibranium", "Adamantium");
        // line dibawah merupakan pemanggilan method dengan tampilan string sesuai dengan tampilan soal
        obj.addVertex("VORMIR", "Soul Stone", "Ceker Mercon");

        // line dibawah merupakan pemanggilan method dengan tampilan string sesuai dengan tampilan soal
        obj.addEdge("NEWYORK", "MARKAS S.H.I.E.L.D");
        // line dibawah merupakan pemanggilan method dengan tampilan string sesuai dengan tampilan soal
        obj.addEdge("NEWYORK", "ASGARD");
        // line dibawah merupakan pemanggilan method dengan tampilan string sesuai dengan tampilan soal
        obj.addEdge("MARKAS S.H.I.E.L.D", "WAKANDA");
        // line dibawah merupakan pemanggilan method dengan tampilan string sesuai dengan tampilan soal
        obj.addEdge("WAKANDA", "NEWYORK");
        // line dibawah merupakan pemanggilan method dengan tampilan string sesuai dengan tampilan soal
        obj.addEdge("ASGARD", "VORMIR");

        Graph obj2 = new Graph();
        // line dibawah merupakan pemanggilan method dengan tampilan string sesuai dengan tampilan soal
        obj2.addVertex("NEWYORK", "Space Stone", "Nasi Padang");
        // line dibawah merupakan pemanggilan method dengan tampilan string sesuai dengan tampilan soal
        obj2.addVertex("SANCTUM SANCTORUM", "Thai Tea", "Time Stone");
        // line dibawah merupakan pemanggilan method dengan tampilan string sesuai dengan tampilan soal
        obj2.addVertex("MORAG", "Power Stone", "Es semangka india");
        // line dibawah merupakan pemanggilan method dengan tampilan string sesuai dengan tampilan soal
        obj2.addVertex("KEKALIK", "Suit IronMan", "Printer");
        // line dibawah merupakan pemanggilan method dengan tampilan string sesuai dengan tampilan soal
        obj2.addVertex("MIDGARD", "Boba", "Sempol");

        // line dibawah merupakan pemanggilan method dengan tampilan string sesuai dengan tampilan soal
        obj2.addEdge("NEWYORK", "SANCTUM SANCTORUM");
        // line dibawah merupakan pemanggilan method dengan tampilan string sesuai dengan tampilan soal
        obj2.addEdge("SANCTUM SANCTORUM", "MORAG");
        // line dibawah merupakan pemanggilan method dengan tampilan string sesuai dengan tampilan soal
        obj2.addEdge("SANCTUM SANCTORUM", "MIDGARD");
        // line dibawah merupakan pemanggilan method dengan tampilan string sesuai dengan tampilan soal
        obj2.addEdge("MORAG", "KEKALIK");
        // line dibawah merupakan pemanggilan method dengan tampilan string sesuai dengan tampilan soal
        obj2.addEdge("MIDGARD", "KEKALIK");

        Graph obj3 = new Graph();
        obj3.addVertex("HOLLYWOOD", "DVD Avanger", "Microphone");
        // line dibawah merupakan pemanggilan method dengan tampilan string sesuai dengan tampilan soal
        obj3.addVertex("VORMIR", "Mouse Wireless", "Keyboard");
        // line dibawah merupakan pemanggilan method dengan tampilan string sesuai dengan tampilan soal
        obj3.addVertex("KNOWHERE", "Mind Stone", "Batu Akik");
        // line dibawah merupakan pemanggilan method dengan tampilan string sesuai dengan tampilan soal
        obj3.addVertex("NEWYORK", "KFC", "IPhone 13");
        // line dibawah merupakan pemanggilan method dengan tampilan string sesuai dengan tampilan soal
        obj3.addVertex("ASGARD", "Mjolnir", "Storm Breaker");
        // line dibawah merupakan pemanggilan method dengan tampilan string sesuai dengan tampilan soal
        obj3.addVertex("VALENCIA", "Kartu UNO", "Kartu Remi");
        // line dibawah merupakan pemanggilan method dengan tampilan string sesuai dengan tampilan soal
        obj3.addVertex("QATAR", "Yamaha YZR-M1", "Ducati GP15");

        // line dibawah merupakan pemanggilan method dengan tampilan string sesuai dengan tampilan soal
        obj3.addEdge("HOLLYWOOD", "KNOWHERE");
        // line dibawah merupakan pemanggilan method dengan tampilan string sesuai dengan tampilan soal
        obj3.addEdge("KNOWHERE", "NEWYORK");
        // line dibawah merupakan pemanggilan method dengan tampilan string sesuai dengan tampilan soal
        obj3.addEdge("NEWYORK", "VALENCIA");
        // line dibawah merupakan pemanggilan method dengan tampilan string sesuai dengan tampilan soal
        obj3.addEdge("NEWYORK", "ASGARD");
        // line dibawah merupakan pemanggilan method dengan tampilan string sesuai dengan tampilan soal
        obj3.addEdge("NEWYORK", "VORMIR");
        // line dibawah merupakan pemanggilan method dengan tampilan string sesuai dengan tampilan soal
        obj3.addEdge("VORMIR", "HOLLYWOOD");
        // line dibawah merupakan pemanggilan method dengan tampilan string sesuai dengan tampilan soal
        obj3.addEdge("ASGARD", "QATAR");
        // line dibawah merupakan pemanggilan method dengan tampilan string sesuai dengan tampilan soal
        obj3.addEdge("VALENCIA", "QATAR");

        LinkedList list = new LinkedList();
        list.addYear(1970, obj);
        list.addYear(2012, obj2);
        list.addYear(2015, obj3);
        list.printList();
        list.BFSSearch("Mjolnir");
        // obj.DFS(obj.head);
        // obj.DFSprint();
    }
}