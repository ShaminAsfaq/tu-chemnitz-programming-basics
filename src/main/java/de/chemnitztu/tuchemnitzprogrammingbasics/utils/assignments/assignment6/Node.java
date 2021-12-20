package de.chemnitztu.tuchemnitzprogrammingbasics.utils.assignments.assignment6;

public class Node {
    private Vote data;
    private Node next;

    public Node(Vote data) {
        this.data = data;
    }

    public Vote getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
