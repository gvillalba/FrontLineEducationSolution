package com.frontlineeducation.codesample.germanvillalba.test;

import com.frontlineeducation.codesample.germanvillalba.IFrontlineEducationRequirements;
import com.frontlineeducation.codesample.germanvillalba.solver.FrontlineEducationSolver;
import com.frontlineeducation.codesample.germanvillalba.test.util.TestUtil;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * @author German Villalba
 * Unit test for LongestMonotoneSubarray.
 */
public class LongestMonotoneSubarrayTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public LongestMonotoneSubarrayTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( LongestMonotoneSubarrayTest.class );
    }

    /**
     * Test Cases:
     */

    private IFrontlineEducationRequirements frontlineEducation = new FrontlineEducationSolver();


    public void testEmpty() {
        int[] array = {}; // Empty
        int[] expectedSubArray = { };
        int[] actualSubarray = this.frontlineEducation.findLongestMonotoneSubarray(array);
        TestUtil.checkArray(expectedSubArray, actualSubarray);
    }

    public void testSingleElement() {
        int[] array = { 5 }; // Single element
        int[] expectedSubArray = { 5 };
        int[] actualSubarray = this.frontlineEducation.findLongestMonotoneSubarray(array);
        TestUtil.checkArray(expectedSubArray, actualSubarray);
    }

    public void testTwoAscendingElements() {
        int[] array = {3, 7}; // Two Ascending elements
        int[] expectedSubArray = { 3, 7 };
        int[] actualSubarray = this.frontlineEducation.findLongestMonotoneSubarray(array);
        TestUtil.checkArray(expectedSubArray, actualSubarray);
    }

    public void testEntireAscendingElements() {
        int[] array = {1, 2, 3, 5, 7}; // Entire Array of Ascending elements
        int[] expectedSubArray = { 1, 2, 3, 5, 7};
        int[] actualSubarray = this.frontlineEducation.findLongestMonotoneSubarray(array);
        TestUtil.checkArray(expectedSubArray, actualSubarray);
    }

    public void testBeginningAscendingElements() {
        int[] array = {1, 2, 3, 0, 5, 7}; // Ascending at the beginning
        int[] expectedSubArray = { 1, 2, 3};
        int[] actualSubarray = this.frontlineEducation.findLongestMonotoneSubarray(array);
        TestUtil.checkArray(expectedSubArray, actualSubarray);
    }

    public void testFirstValidSubArrayAtBeginningAscendingElements() {
        int[] array = {1, 2, 3, 3, 5, 7}; // There are two sub-arrays of same size, choosing the first one (TODO: Check assumption!)
        int[] expectedSubArray = { 1, 2, 3};
        int[] actualSubarray = this.frontlineEducation.findLongestMonotoneSubarray(array);
        TestUtil.checkArray(expectedSubArray, actualSubarray);
    }

    public void testAscendingAtTheEnd() {
        int[] array = {5, 2, 3, 3, 5, 7}; // Ascending at the end
        int[] expectedSubArray = { 3, 5, 7};
        int[] actualSubarray = this.frontlineEducation.findLongestMonotoneSubarray(array);
        TestUtil.checkArray(expectedSubArray, actualSubarray);
    }

    public void testAscendingInTheMiddle() {
        int[] array = {5, 2, 5, 1, 2, 3, 4, 5, 5, 6, 7}; // Ascending in the middle
        int[] expectedSubArray = { 1, 2, 3, 4, 5};
        int[] actualSubarray = this.frontlineEducation.findLongestMonotoneSubarray(array);
        TestUtil.checkArray(expectedSubArray, actualSubarray);
    }

    public void testSamevalue() {
        int[] array = {5, 5, 5, 5, 5}; // Same value
        int[] expectedSubArray = { 5 };
        int[] actualSubarray = this.frontlineEducation.findLongestMonotoneSubarray(array);
        TestUtil.checkArray(expectedSubArray, actualSubarray);
    }

    public void testReversed() {
        int[] array = {6, 5, 4, 3, 2}; // Reversed
        int[] expectedSubArray = { 6 };
        int[] actualSubarray = this.frontlineEducation.findLongestMonotoneSubarray(array);
        TestUtil.checkArray(expectedSubArray, actualSubarray);
    }

    public void testFindLongestMonotoneSubarrayZigzagEnd() {
        int[] array = {0, -1, -2, 1, 3, 5, 7, 6, 5, 4, 8, 8, 10, 11, 12, 13, 14, 15}; // Zigzag end
        int[] expectedSubArray = { 8, 10, 11, 12, 13, 14, 15};
        int[] actualSubarray = this.frontlineEducation.findLongestMonotoneSubarray(array);
        TestUtil.checkArray(expectedSubArray, actualSubarray);
    }

    public void testFindLongestMonotoneSubarrayZigzagEndShort() {
        int[] array = {0, -1, -2, 1, 3, 5, 7, 6, 5, 4, 8, 8, 10, 11, 12, 13}; // Zigzag middle
        int[] expectedSubArray = { -2, 1, 3, 5, 7};
        int[] actualSubarray = this.frontlineEducation.findLongestMonotoneSubarray(array);
        TestUtil.checkArray(expectedSubArray, actualSubarray);
    }
}
