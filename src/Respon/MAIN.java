package Respon;

import java.io.FileInputStream;

public class MAIN {
    public static void main(String[] args) {
        Rezpon list = new Rezpon();

        list.push(10);
        list.push(11);
        list.push(12);
        list.push(13);
        list.push(14);
        list.push(15);
        list.push(16);

        list.display(list);
        list.deleteTail();
        list.display(list);
        list.deleteTail();
        list.display(list);

        System.out.println("NOMOR 2");
        Rezpon_2 A = new Rezpon_2();
        Rezpon_2 B = new Rezpon_2();
        Rezpon_2 C = new Rezpon_2();

        A.enQueue(2);
        A.enQueue(6);

        B.enQueue(3);
        B.enQueue(4);
        B.enQueue(5);

        C.enQueue(7);
        C.enQueue(9);
        C.enQueue(8);

        A.merge(B,C);
        A.display(A);
        A.length(A, B, C);
















    }
}
