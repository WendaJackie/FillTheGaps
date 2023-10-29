package 二叉树;

/**
 * 从小到大输出二叉排序树（BST）所有结点的值
 * BST是二叉搜索树，也叫二叉排序树，中序遍历的话可以把节点从小到大逐一输出
 */

class Node {
    int key;
    Node lChild, rChild;

    public Node(int key) {
        this.key = key;
        this.lChild = null;
        this.rChild = null;
    }
}

class BST {
    Node root;

    public boolean BSTInsert(int element) {
        root = insertRec(root, element);
        return true;
    }

    private Node insertRec(Node root, int element) {
        if (root == null) {
            return new Node(element);
        }

        if (element == root.key) {
            return root;
        }

        if (element < root.key) {
            root.lChild = insertRec(root.lChild, element);
        } else {
            root.rChild = insertRec(root.rChild, element);
        }

        return root;
    }

    public void inOrderTraverse(Node node) {
        if (node != null) {
            inOrderTraverse(node.lChild);
            System.out.print(node.key+" ");
            inOrderTraverse(node.rChild);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int[] a = {4, 5, 2, 1, 0, 9, 3, 7, 6, 8};
        int n = 10;

        BST tree = new BST();

        for (int i = 0; i < n; i++) {
            tree.BSTInsert(a[i]);
        }

        tree.inOrderTraverse(tree.root);
    }
}
