package com.singham.yuan.poker;

public class DoubleCycleList {

    private Node head;

    private Node tail;

    private Node target;

    private int size;

    public void insertInLast(int data, int step) {
        Node newNode = new Node(data, null, this.head);

        if (this.head == null) {
            this.head = newNode;
            newNode.setPrior(head);
        } else {
            Node tmpNode = this.tail;
            tmpNode.setNext(newNode);
            newNode.setPrior(tmpNode);
        }

        this.head.setPrior(newNode);
        this.tail = newNode;
        size++;

        if (data == step) {
            this.target = newNode;
        }
    }

    public Node getTargetNode(int step) {
        Node target = this.target;

        Node prior = target.getPrior();
        Node next = target.getNext();
        prior.setNext(next);
        next.setPrior(prior);

        while (true) {
            step--;
            next = next.getNext();
            if (step <= 1) {
                this.target = next;
                break;
            }
        }

        return target;
    }

    public int getSize() {
        return size;
    }
}
