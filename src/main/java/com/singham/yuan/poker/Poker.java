package com.singham.yuan.poker;

public class Poker {

    public static int[] generator(int number, int step) {

        if (number < 0 || number > 1024 * 1024) {
            throw new IllegalArgumentException();
        }

        if (step % number == 0) {
            step = number;
        } else {
            step = step % number;
        }

        DoubleCycleList doubleCycleList = initDoubleCycleList(number, step);

        return getResult(doubleCycleList, step);
    }

    private static DoubleCycleList initDoubleCycleList(int number, int step) {
        DoubleCycleList doubleCycleList = new DoubleCycleList();
        for (int i = step; i <= number; i++) {
            doubleCycleList.insertInLast(i, step);
        }

        for (int i = 1; i < step; i++) {
            doubleCycleList.insertInLast(i, step);
        }

        return doubleCycleList;
    }

    private static int[] getResult(DoubleCycleList doubleCycleList, int step) {
        int size = doubleCycleList.getSize();
        int[] ints = new int[size];

        for (int i = 0; i < size; i++) {
            Node targetNode = doubleCycleList.getTargetNode(step);
            ints[i] = targetNode.getData();
        }

        return ints;
    }

}
