public class Node {
    boolean leaf;
    Node left;
    Node right;
    int value;

    public Node(int val){
        this.left = null;
        this.right = null;
        this.value = val;
        this.leaf = true;
    }

    public Node(int val, Node left, Node right){
        this.left = left;
        this.right = right;
        this.leaf = false;
        this.value = val;
    }

    public boolean isLeaf() {
        return leaf;
    }

    public void setLeaf(boolean leaf) {
        this.leaf = leaf;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
