package com.frontlineeducation.codesample.germanvillalba.solver;

/**
 * @author German Villalba
 */
public class LongestMonotoneSubarray {
    public int[] findLongestMonotoneSubarray(int[] array) {
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
