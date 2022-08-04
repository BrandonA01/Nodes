import javax.swing.tree.TreeNode;

class Main {
    public static void main(String[] args){
    /*                       19
                         16      22
                      15   17  20  25
                    10  12                              */
        Node leaf = new Node(10);
        Node leaf2 = new Node(12);
        Node leaf3 = new Node(20);
        Node leaf4 = new Node(25);
        Node leaf5 = new Node(17);
        Node node3 = new Node(15, leaf, leaf2);
        Node node4 = new Node(16, node3, leaf5);
        Node node5 = new Node(22, leaf3, leaf4);
        Node node8 = new Node(19, node4, node5);
        System.out.println("Nodes: "+getNumberOfNodes(node8));
        System.out.println("Leaves: "+countLeafNodes(node8));
    }
    private static int getNumberOfNodes(Node node) {
        if(node == null){
            return 0;
        }
        else if(node.isLeaf()){
            return 1;
        }
        else{
            return 1 + getNumberOfNodes(node.right) + getNumberOfNodes(node.left);
        }
    }

    public static int countLeafNodes(Node node) {
        if(node == null){
            return 0;
        }
        else if(node.isLeaf()){
            return 1;
        }
        else{
            return countLeafNodes(node.right) + countLeafNodes(node.left);
        }
    }
}