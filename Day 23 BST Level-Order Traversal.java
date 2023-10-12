static LinkedList<Integer> queue = new LinkedList();
static void levelOrder(Node root){
    LinkedList<Node> treeQueue = new LinkedList();
    treeQueue.add(root);
    while(treeQueue.peek() != null) {
        Node toprint = treeQueue.remove();
        System.out.print(toprint.data);
        if(toprint.left != null) {
            treeQueue.add(toprint.left);
        }
        if(toprint.right != null) {
            treeQueue.add(toprint.right);
        }
        if(treeQueue.peek() != null) {
            System.out.print(" ");
        }
    }
    
    }