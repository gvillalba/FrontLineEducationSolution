package com.frontlineeducation.codesample.germanvillalba;

/**
 * @author German Villalba
 */
public class LongestMonotoneSubarray {
    /*
     Part 1:
     Find the longest monotone sub-array from an array of numbers.
     Monotone sub-array is a sequence of elements where each element is bigger than the previous one.
     */
    public static int[] findLongestMonotoneSubarray(int[] array) {
        int n = array.length;
        if (n == 0 || n == 1) {
            return array;
        }

        int startIdx = 0;
        int maxStartIdx = 0;
        int maxEndIdx = 0;
        for (int i = 1; i < n; i++) {
            if ( array[i] > array[i - 1] ) {
                if ( (i - startIdx) > (maxEndIdx - maxStartIdx) ) {
                    maxStartIdx = startIdx;
                    maxEndIdx = i;
                }
            }
            else {
                startIdx = i;
            }
        }

        int len = maxEndIdx - maxStartIdx + 1;
        int[] longestMonotoneSubarray = new int[len];
        System.arraycopy(array, maxStartIdx + 0, longestMonotoneSubarray, 0, len);

        return longestMonotoneSubarray;
    }

}
