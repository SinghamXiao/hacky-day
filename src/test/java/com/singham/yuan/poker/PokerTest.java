package com.singham.yuan.poker;

import org.junit.Assert;
import org.junit.Test;

public class PokerTest {
/*    
        n: 10 s: 3 v: [3 6 9 2 7 1 8 5 10 4]
        n: 10 s: 5 v: [5 10 6 2 9 8 1 4 7 3]
        n: 10 s: 7 v: [7 4 2 1 3 6 10 5 8 9]
        n: 10 s: 9 v: [9 8 10 2 5 3 4 1 6 7]
        n: 10 s: 11 v: [1 3 6 10 8 9 5 2 4 7]
        
        n: 20 s: 3 v: [3 6 9 12 15 18 1 5 10 14 19 4 11 17 7 16 8 2 13 20]
        n: 20 s: 5 v: [5 10 15 20 6 12 18 4 13 1 9 19 11 3 17 16 2 8 14 7]
        n: 20 s: 7 v: [7 14 1 9 17 5 15 4 16 8 20 13 11 10 12 19 6 18 2 3]
        n: 20 s: 9 v: [9 18 7 17 8 20 12 4 19 14 11 10 13 16 3 1 2 15 5 6]
        n: 20 s: 11 v: [11 2 14 6 19 13 8 4 1 20 3 7 12 18 16 17 10 5 9 15]*/

    @Test
    public void testDoubleCycleList() {
        int[] result = Poker.generator(5, 3);
        Assert.assertArrayEquals(new int[]{3, 1, 5, 4, 2}, result);
    }

    @Test
    public void testDoubleCycleList2() {
        int[] result = Poker.generator(10, 3);
        Assert.assertArrayEquals(new int[]{3, 6, 9, 2, 7, 1, 8, 5, 10, 4}, result);
    }
    
    @Test
    public void testDoubleCycleList3() {
        int[] result = Poker.generator(10, 5);
        Assert.assertArrayEquals(new int[]{5, 10, 6, 2, 9, 8, 1, 4, 7, 3}, result);
    }

    @Test
    public void testDoubleCycleList4() {
        int[] result = Poker.generator(20, 11);
        Assert.assertArrayEquals(new int[]{11, 2, 14, 6, 19, 13, 8, 4, 1, 20, 3, 7, 12, 18, 16, 17, 10, 5, 9, 15}, result);
    }

}