package com.frontlineeducation.codesample.germanvillalba.test.util;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestUtil {
    public static void checkArray(int[] expectedArray, int[] actualArray) {
        printExpectedVsActual(expectedArray, actualArray);
        if (actualArray.length == expectedArray.length) {
            for (int i = 0; i < actualArray.length; i++) {
                assertTrue(actualArray[i] == expectedArray[i]);
            }
        } else {
            assertTrue(false);
        }
    }

    private static void printExpectedVsActual(int[] expectedArray, int[] actualArray) {
        System.out.println("expectedArray vs actualArray:");
        System.out.println(Arrays.toString(expectedArray));
        System.out.println(Arrays.toString(actualArray));
        System.out.println("");
    }
}
