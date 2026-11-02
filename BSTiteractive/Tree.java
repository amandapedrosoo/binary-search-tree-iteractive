
package BSTiteractive;

public class Tree {

    private Node root;

    public Tree() {
        this.root = null;
    }

    // Insert a new value
    public void insert(int value) {
        Node current = root;
        Node parent = null;

        if (root == null) {
            root = new Node(value);
            return;
        }

        while (current != null) {
            parent = current;

            // Ignore duplicate values
            if (current.value == value) {
                return;
            }

            if (current.value > value) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        if (parent.value > value) {
            parent.left = new Node(value);
        } else {
            parent.right = new Node(value);
        }
    }

    // InOrder: Left, Root, Right
    public void inOrder() {
        Node current = root;
        Stack stack = new Stack();

        while (current != null || !stack.isEmpty()) {

            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            System.out.println(current.value);
            current = current.right;
        }
    }

    // PreOrder: Root, Left, Right
    public void preOrder() {
        Node current;
        Stack stack = new Stack();

        if (root == null) {
            return;
        }

        stack.push(root);

        while (!stack.isEmpty()) {
            current = stack.pop();
            System.out.println(current.value);

            // Push right first to visit left first
            if (current.right != null) {
                stack.push(current.right);
            }

            if (current.left != null) {
                stack.push(current.left);
            }
        }
    }

    // PostOrder: Left, Right, Root
    public void postOrder() {
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();

        if (root == null) {
            return;
        }

        stack1.push(root);

        while (!stack1.isEmpty()) {
            Node current = stack1.pop();
            stack2.push(current);

            if (current.left != null) {
                stack1.push(current.left);
            }

            if (current.right != null) {
                stack1.push(current.right);
            }
        }

        while (!stack2.isEmpty()) {
            Node current = stack2.pop();
            System.out.println(current.value);
        }
    }

    // Delete a value
    public void delete(int value) {
        Node current = root;
        Node parent = null;

        // Find the node
        while (current != null && current.value != value) {
            parent = current;

            if (current.value > value) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        // Value not found
        if (current == null) {
            return;
        }

        // Case 1: Node without children
        if (current.left == null && current.right == null) {

            if (parent == null) {
                root = null;
            } else if (parent.left == current) {
                parent.left = null;
            } else {
                parent.right = null;
            }

            // Case 2: Node with one child
        } else if (current.left != null ^ current.right != null) {

            Node child;

            if (current.left != null) {
                child = current.left;
            } else {
                child = current.right;
            }

            if (parent == null) {
                root = child;
            } else if (parent.left == current) {
                parent.left = child;
            } else {
                parent.right = child;
            }

            // Case 3: Node with two children
        } else {

            Node successor = current.right;
            Node successorParent = current;

            // Find the smallest value on the right side
            while (successor.left != null) {
                successorParent = successor;
                successor = successor.left;
            }

            // Replace the current value
            current.value = successor.value;

            // Remove the old successor
            if (successorParent == current) {
                current.right = successor.right;
            } else {
                successorParent.left = successor.right;
            }
        }
    }
}
