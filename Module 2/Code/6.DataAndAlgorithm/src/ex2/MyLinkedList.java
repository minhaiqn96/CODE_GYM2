package ex2;

public class MyLinkedList<E> {

    private Node head;
    private int numNodes;

    public class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public MyLinkedList() {
    }

    public void add(int index, E element) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        this.numNodes++;
    }

    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        this.numNodes++;
    }

    public void addLast(E e) {
        Node temp = head;
        Node newNode = new Node(e);
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        this.numNodes++;
    }

    public void removeIndex(int index) {
        Node temp = head;
        if (index < 0 || index >= numNodes) {
            System.out.println("Index outside");
        } else if (index == 0) {
            head = temp.next;
            this.numNodes--;
        } else {
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            this.numNodes--;
        }
    }

    public void removeData(Object e) {
        Node temp = head;
        if (temp.data == e) {
            head = temp.next;
            this.numNodes--;
        }
        for (int i = 0; i < this.numNodes - 1; i++) {
            if (temp.next.data == e) {
                temp.next = temp.next.next;
                this.numNodes--;
            }
            temp = temp.next;
        }
    }

    public int size() {
        return this.numNodes;
    }

    public Object[] clone() {
        Object[] clone = new Object[this.numNodes];
        Node temp = head;
        for (int i = 0; i < this.numNodes; i++) {
            clone[i] = temp.data;
            temp = temp.next;
        }
        return clone;
    }

    public boolean contains(E o) {
        Node temp = head;
        for (int i = 0; i < this.numNodes; i++) {
            if (temp.data == o) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E o) {
        Node temp = head;
        for (int i = 0; i < this.numNodes; i++) {
            if (temp.data == o) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public Object get(int i) {
        Node temp = head;
        for (int j = 0; j < this.numNodes; j++) {
            if (i == j) {
                return temp.data;
            }
            temp = temp.next;
        }
        return -1;
    }

    public Object getFirst() {
        return head.data;
    }

    public Object getLast() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.data;
    }

    public void clear() {
        for (int i = 0; i < this.numNodes; i++) {
            removeIndex(i);
        }
    }
}
