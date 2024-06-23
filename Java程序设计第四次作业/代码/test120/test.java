package test120;

import java.io.*;
public class test {
    public static void main(String[] args) {
        Node root = new Node('A');
        root.left = new Node('B');
        root.right = new Node('C');
        root.left.left = new Node('D');
        root.right.left = new Node('E');
        root.right.right = new Node('F');
        root.right.left.left = new Node('G');
        root.right.right.right = new Node('H');

        write(root, "tree.txt");
        Node Root = read("tree.txt");
        print(Root);
    }

    public static void write(Node root, String filename) {
        try (FileOutputStream fout = new FileOutputStream(filename);
             ObjectOutputStream oout = new ObjectOutputStream(fout)) {
            oout.writeObject(root);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Node read(String filename) {
        Node root = null;
        try (FileInputStream fin = new FileInputStream(filename);
             ObjectInputStream oin = new ObjectInputStream(fin)) {
            root = (Node) oin.readObject();
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return root;
    }

    public static void print(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        print(root.left);
        print(root.right);
    }
}


