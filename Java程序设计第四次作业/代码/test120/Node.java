package test120;

import java.io.Serializable;
class Node implements Serializable {
    char data;
    Node left, right;

    public Node(char data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
