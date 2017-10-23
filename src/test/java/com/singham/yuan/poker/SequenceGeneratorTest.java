package com.singham.yuan.poker;

import org.junit.*;
import org.junit.rules.Stopwatch;
import org.junit.runner.Description;

import java.util.concurrent.TimeUnit;

public class SequenceGeneratorTest {

    @Rule
    public final Stopwatch stopwatch = new Stopwatch() {
        protected void succeeded(long nanos, Description description) {
            System.out.println(description.getMethodName() + " succeeded, time taken " + TimeUnit.NANOSECONDS.toMillis(nanos));
        }

        /**
         * Invoked when a test fails
         */
        protected void failed(long nanos, Throwable e, Description description) {
            System.out.println(description.getMethodName() + " failed, time taken " + TimeUnit.NANOSECONDS.toMillis(nanos));
        }

        /**
         * Invoked when a test is skipped due to a failed assumption.
         */
        protected void skipped(long nanos, AssumptionViolatedException e,
                               Description description) {
            System.out.println(description.getMethodName() + " skipped, time taken " + TimeUnit.NANOSECONDS.toMillis(nanos));
        }

        /**
         * Invoked when a test method finishes (whether passing or failing)
         */
        protected void finished(long nanos, Description description) {
        }
    };

    @Test
    public void testSize10Step3() throws Exception {
        int[] result = Poker.generator(10, 3);
        Assert.assertArrayEquals(new int[]{3, 6, 9, 2, 7, 1, 8, 5, 10, 4}, result);
    }


    @Test
    public void testSize3Step10() throws Exception {
        int[] result = Poker.generator(3, 10);
        Assert.assertArrayEquals(new int[]{1, 3, 2}, result);
    }

    @Test
    public void testSize20Step3() throws Exception {
        int[] result = Poker.generator(20, 3);
        Assert.assertArrayEquals(new int[]{3, 6, 9, 12, 15, 18, 1, 5, 10, 14, 19, 4, 11, 17, 7, 16, 8, 2, 13, 20}, result);
    }

    @Test
    public void testSize1KStep1M() throws Exception {
        Poker.generator(1024, 1024 * 1024);
    }

    @Ignore
    @Test
    public void testSize1MStep1K() throws Exception {
        Poker.generator(1024 * 1024, 1024);
    }

    @Ignore
    @Test
    public void testSize1MStep16K() throws Exception {
        Poker.generator(1024 * 1024, 16 * 1024);
    }

    @Ignore
    @Test
    public void testSize1GStep5() throws Exception {
        Poker.generator(1024 * 1024 * 1024, 5 );
    }
}
