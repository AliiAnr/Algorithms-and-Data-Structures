package Respon_Modul_3;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList listMe = new LinkedList();
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int value = input.nextInt();
        System.out.println("Data Random");
        for (int i = 0; i < value; i++){
            int Random = rand.nextInt(100);
            list.addLast(Random);
        }
        list.display(list);
        //asc
        System.out.println("\n");
        list.BbSort();
        System.out.println("Sorting Ascend");
        list.display(list);
        System.out.println("\n");
        list.InsSort();
        System.out.println("Soring Descend");
        list.display(list);
        System.out.println("\n");

        listMe.line();
        System.out.println("===================[ 2 ]=================");
        listMe.line();

        listMe.addLast(5);
        listMe.addLast(2);
        listMe.addLast(6);
        listMe.addLast(7);
        listMe.addLast(3);
        listMe.addLast(9);
        listMe.addLast(0);
        listMe.addLast(7);
        listMe.addLast(4);
        listMe.addLast(1);
        listMe.display(listMe);

        System.out.println("\n\nSequential Search : ");
        System.out.print("Nilai Max : "); listMe.SqlSearch(listMe.H_grade());
        System.out.print("Nilai Min : "); listMe.SqlSearch(listMe.L_Grade());

        System.out.println("\nBinary Search : ");
        listMe.BbSort();
        listMe.display(listMe);
        System.out.print("\nNilai Max : "); listMe.binarySearch(listMe, listMe.H_grade());
        System.out.print("Nilai Min : "); listMe.binarySearch(listMe, listMe.L_Grade());
    }
}
