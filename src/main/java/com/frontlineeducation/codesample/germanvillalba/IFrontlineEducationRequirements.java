package com.frontlineeducation.codesample.germanvillalba;

import java.util.List;

/**
 * @author German Villalba
 */
public interface IFrontlineEducationRequirements {
    /**
        Part 1:
        Find the longest monotone sub-array from an array of numbers.
        Monotone sub-array is a sequence of elements where each element is bigger than the previous one.
    */
    int[] findLongestMonotoneSubarray(int[] array);

    /**
         Part 2
         (1) Implement a method to convert a sequence of records into a hierarchical (tree) sorted structure.
         (2) Provide a method to print the resulting tree structure.
         The records contain an unsorted, but equal number of elements in the following format:
         [A11].[A12].[A13]…[A1n]
         [A21].[A22].[A23]…[A2n]
         …
         [Am1].[Am2].[Am3]…[Amn]

         [Aij] are String (alphanumeric) values separated by dots.

         For example, if a set of records looks like this:
         1.2.3
         1.2.5
         1.5.6
         1.2.4
         2.5.6
         1.5.7
         2.5.3

         The output should be:
         1
         --2
         ----3
         ----4
         ----5
         --5
         ----6
         ----7
         2
         --5
         ----3
         ----6
     */

    /**
     (1) Implement a method to convert a sequence of records into a hierarchical (tree) sorted structure.
     */
    void buildHierarchicalSortedStructure(List<String> data);

    /**
     (2) Provide a method to print the resulting tree structure.
     */
    List<String> printHierarchicalSortedStructure();
}
