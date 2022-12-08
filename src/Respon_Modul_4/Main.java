package Respon_Modul_4;

public class Main {
    public static void main(String[] args) {
        Tree input = new Tree();
        System.out.println("Input = ((5*4)+(100-(20/2)))");
        Node root = input.makeRoot("+");
        Node child1 = input.insertLeft("*", root);
        Node nextChild = input.insertRigh("-", root);
        input.insertLeft("5", child1);
        input.insertRigh("4", child1);
        input.insertLeft("100", nextChild);
        Node backS = input.insertRigh("/", nextChild);
        input.insertLeft("20", backS);
        input.insertRigh("2", backS);
        System.out.println("To Prefix :");
        input.ToPrefix(root);
        System.out.println();
        System.out.println("To Infix :");
        input.ToInfix(root);
        System.out.println();
        System.out.println("To PostFix :");
        input.ToPostfix(root);
    }
}
