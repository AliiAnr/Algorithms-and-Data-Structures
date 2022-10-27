package MODUL_2;

public class Main1 {
    public static void main(String[] args) {
        Stack<String> list = new Stack<>();

        list.push("Ali");
        list.push("Ganteng");
        list.push("Sekali");
        list.push("Iyakan");
        list.push("iyalah");
        list.push("wkwkwk");

        list.display(list);

        list.locate("Sekali");
    }
}
