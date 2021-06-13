package com.mahfoos.oop.linkedIN.test;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class PlayingWithJunit {

    @Test
    public void testName() throws Exception {

//        assertEquals(expected, actul);
        assertEquals(4, java.util.Optional.of(Calculator.add(2, 2)));


    }
}
