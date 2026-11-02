
package BSTiteractive;

public class Main {

    public static void main(String[] args) {

        Tree tree = new Tree();

        // Test 1: Insert values
        System.out.println("=== INSERTION ===");

        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        // Test 2: Tree traversals
        System.out.println("\n=== INORDER ===");
        tree.inOrder();

        System.out.println("\n=== PREORDER ===");
        tree.preOrder();

        System.out.println("\n=== POSTORDER ===");
        tree.postOrder();

        // Test 3: Delete a leaf node
        System.out.println("\n=== DELETE LEAF NODE (20) ===");
        tree.delete(20);
        tree.inOrder();

        // Test 4: Delete a node with one child
        System.out.println("\n=== DELETE NODE WITH ONE CHILD (30) ===");
        tree.delete(30);
        tree.inOrder();

        // Test 5: Delete a node with two children
        System.out.println("\n=== DELETE NODE WITH TWO CHILDREN (70) ===");
        tree.delete(70);
        tree.inOrder();

        // Test 6: Delete the root
        System.out.println("\n=== DELETE ROOT (50) ===");
        tree.delete(50);
        tree.inOrder();

        // Test 7: Delete a value that does not exist
        System.out.println("\n=== DELETE NON-EXISTENT VALUE (100) ===");
        tree.delete(100);
        tree.inOrder();

        // Test 8: Delete the only node
        System.out.println("\n=== DELETE THE ONLY NODE ===");

        Tree singleNodeTree = new Tree();
        singleNodeTree.insert(10);
        singleNodeTree.delete(10);

        System.out.println("Tree should be empty:");
        singleNodeTree.inOrder();

        // Test 9: Delete root with one child
        System.out.println("\n=== DELETE ROOT WITH ONE CHILD ===");

        Tree oneChildTree = new Tree();
        oneChildTree.insert(50);
        oneChildTree.insert(30);
        oneChildTree.delete(50);

        oneChildTree.inOrder();
    }
}
