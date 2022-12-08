package Respon_Modul_4;

public class Tree {
    Node root;
    Node current;

    public Node makeRoot(String value) {
        Node baru = new Node(value);
        if (root == null) {
            root = baru;
            root.left = null;
            root.right = null;
        } else {
            System.out.println("Root sudah ada");
        }
        return root;
    }

    public Node insertLeft(String value, Node parentNode) {

        if (parentNode.left == null) {
            current = new Node(value);
            current.parent = parentNode;
            parentNode.left = current;
            current.left = null;
            current.right = null;
        } else {
            System.out.println("Leaf left sudah terisi");
        }

        return current;
    }

    public Node insertRigh(String value, Node parentNode) {

        if (parentNode.right == null) {
            current = new Node(value);
            current.parent = parentNode;
            parentNode.right = current;
            current.left = null;
            current.right = null;
        } else {
            System.out.println("Leaf left sudah terisi");
        }

        return current;
    }

    public void ToPrefix(Node node) {

        if (node != null) {
            if (node.left == null && node.right == null) {
                System.out.print(node.value);
            } else if (node.left != null || node.right != null) {
                System.out.print(node.value + " ");
            } else if (node.left != null) {
                System.out.print(node.left.value + " ");
            } else if (node.right != null) {
                System.out.print(node.right.value + " ");
            }
            ToPrefix(node.left);

            ToPrefix(node.right);
        }

    }

    public void ToInfix(Node node) {
        if (node != null) {
            ToInfix(node.left);

            if (node.left == null & node.right == null) {
                System.out.print(node.value + " ");
            } else if (node.left != null || node.right != null) {
                System.out.print(node.value + " ");
            }

            else if (node.left != null) {
                System.out.print(node.left.value);
            } else if (node.right != null) {
                System.out.print(node.right.value);
            }

            ToInfix(node.right);
        }
    }

    void ToPostfix(Node node) {

        if (node != null) {
            ToPostfix(node.left);
            ToPostfix(node.right);

            if (node.left == null & node.right == null) {
                System.out.print(node.value + " ");
            }

            else if (node.left != null || node.right != null) {
                System.out.print(node.value + " ");
            }

            else if (node.left != null) {
                System.out.print(node.left.value);
            } else if (node.right != null) {
                System.out.print(node.right.value);
            }

        }

    }
}
