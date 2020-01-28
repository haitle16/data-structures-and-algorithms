package java401challenges.tree;

public class BinarySearchTree extends Tree{
    public Node root;

    public int getSize (Node root) {
        if(root == null) {
            return 0;
        } else {
            return 1 + getSize(root.left) + getSize(root.right);
        }
    }

    // Referenced from https://www.baeldung.com/java-binary-tree
    public void add(int value) {
        root = add(root, value);
    }

    public Node add(Node node, int value) {
        if(node == null) return new Node(value);
        else if(value < node.value) {
            node.left = add(node.left, value);
        }else if(value > node.value) {
            node.right = add(node.right, value);
        }else return node;
        return node;
    }

    public boolean contains(int value) {
        return contains(root, value);
    }

    public boolean contains(Node node, int value) {
        if(node == null) return false;
        if(value == node.value) return true;
        return value < node.value
                ? contains(node.left, value)
                : contains(node.right, value);
    }



//    public Node add(int value) {
//        if(root == null) {
//            return root = new Node(value);
//        }
//
//        while(root != null) {
//            if(value < root.value) {
//                if(root.left == null) {
//                    root.left = new Node(value);
//                    break;
//                }else if(root.left != null) {
//                    root = root.left.left;
//                    continue;
//                }
//            }
//            else if(value > root.value) {
//                if(root.right == null) {
//                    root.right = new Node(value);
//                    break;
//                }else if(root.right != null) {
//                    root.right = root.right.right;
//                    continue;
//                }
//            }
//            else return root;
//        }
//        return root;
//    }

}
