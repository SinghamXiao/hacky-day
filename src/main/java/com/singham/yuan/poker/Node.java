package com.singham.yuan.poker;

public class Node {

    private int data;

    private Node prior;

    private Node next;

    public Node(int data, Node prior, Node next) {
        this.data = data;
        this.prior = prior;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getPrior() {
        return prior;
    }

    public void setPrior(Node prior) {
        this.prior = prior;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
