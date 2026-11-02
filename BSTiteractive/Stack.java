package BSTiteractive;

public class Stack {
    private StackNode top;
    private int size;

    public Stack () {
        this.top = null;
        this.size = 0;
    }

    public void push(Node node){
        StackNode newNode = new StackNode(node);
        newNode.next = top;
        top = newNode;

        size++;
    }

    public Node pop() {
        if (top == null) {
            return null;
        }

        Node removed = top.data;
        top = top.next;
        size--;

        return removed;
    }

    public boolean isEmpty() {
        if (top == null) {
            return true;
        }
        return false;
    }
}


