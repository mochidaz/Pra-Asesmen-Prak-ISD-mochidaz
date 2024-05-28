class Node {
    String data;
    Node left;
    Node right;
    Node(String data) {
        this.data = data;
        left = right = null;
    }

    @Override
    public String toString() {
        return data;
    }
}

public class BST {
    Node root;
    BST() {
        root = null;
    }

    void insert(String data) {
        root = insertRec(root, data);
    }

    Node insertRec(Node root, String data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data.compareTo(root.data) < 0) {
            root.left = insertRec(root.left, data);
        } else if (data.compareTo(root.data) > 0) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    void inorder() {
        inorderRec(root);
    }
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    void search (String data) {
        if (searchRec(root, data)) {
            System.out.println(data + " is irregular verb");
        } else {
            System.out.println(data + " is not irregular verb");
        }
    }

    boolean searchRec(Node root, String data) {
        if (root == null) {
            return false;
        }
        if (root.data.equals(data)) {
            return true;
        }
        if (data.compareTo(root.data) < 0) {
            return searchRec(root.left, data);
        }
        return searchRec(root.right, data);
    }
}
