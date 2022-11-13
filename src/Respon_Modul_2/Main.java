package Respon_Modul_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Respon list = new Respon();
        Scanner name = new Scanner(System.in);
        list.enqueue("Karina");
        list.enqueue("Zilong");
        list.enqueue("Beatrix");
        list.enqueue("Kagura");
        list.enqueue("Chou");
        list.enqueue("Layla");
        list.enqueue("Hayabusa");

        System.out.println("]=====[Antrian awal di Land Of Down]=====[");
        list.display();
        System.out.println(" ");
        System.out.println("]=====[Pilih hero pertama yang ingin diprioritaskan]=====[");
        System.out.print("Pilih hero = ");
        String hero_1 = name.nextLine();
        list.priority(hero_1);
        System.out.println("]=====[Antrian hero setelah ditukar]=====[");
        list.display();
        System.out.println(" ");
        System.out.println("]=====[Pilih hero kedua yang ingin diprioritaskan]=====[");
        System.out.print("Pilih hero = ");
        String hero_2 = name.nextLine();
        list.priority(hero_2);
        System.out.println("]=====[Antrian hero setelah ditukar]=====[");
        list.display();
    }
}
