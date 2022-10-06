package com.frontlineeducation.codesample.germanvillalba.solver;

import com.frontlineeducation.codesample.germanvillalba.IFrontlineEducationRequirements;

import java.util.List;

public class FrontlineEducationSolver implements IFrontlineEducationRequirements {
    private LongestMonotoneSubarray longestMonotoneSubarray = new LongestMonotoneSubarray();
    private SortedTrie sortedTrie = new SortedTrie();

    @Override
    public int[] findLongestMonotoneSubarray(int[] array) {
        return this.longestMonotoneSubarray.findLongestMonotoneSubarray(array);
    }

    @Override
    public void buildHierarchicalSortedStructure(List<String> data) {
        this.sortedTrie.buildSortedTrie(data);
    }

    @Override
    public List<String> printHierarchicalSortedStructure() {
        List<String> output = this.sortedTrie.getOutput();
        this.printToSystemOut(output);
        return output;
    }

    private void printToSystemOut(List<String> output) {
        for (String record: output) {
            System.out.println(record);
        }
    }

    public static void main(String[] args) {
        System.out.println("Frontline Education Solver");
    }
}
