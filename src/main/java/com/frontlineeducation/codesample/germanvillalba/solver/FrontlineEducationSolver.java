package com.frontlineeducation.codesample.germanvillalba.solver;

import com.frontlineeducation.codesample.germanvillalba.IFrontlineEducationRequirements;
import com.frontlineeducation.codesample.germanvillalba.util.FileReader;

import java.util.Arrays;
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

        IFrontlineEducationRequirements frontlineEducationSolver = new FrontlineEducationSolver();
        part1(frontlineEducationSolver);
        part2(frontlineEducationSolver);
    }

    private static void part1(IFrontlineEducationRequirements frontlineEducationSolver) {
        System.out.println("<Part 1> :: Find the longest monotone sub-array:");
        List<String> inputPart1 = getInputForPart(1);
        for (String record: inputPart1) {
            System.out.println("Input For Part 1: Find the longest monotone sub-array:");
            System.out.println(record);

            String[] tokens = record.split(",");
            int n = tokens.length;
            int i = 0;
            int[] inputArray = new int[n];
            for (String token: tokens) {
                inputArray[i++] = Integer.valueOf(token.trim());
            }

            System.out.println("Output For Part 1: Find the longest monotone sub-array:");
            int[] longestMonotoneSubarray = frontlineEducationSolver.findLongestMonotoneSubarray(inputArray);
            System.out.println(Arrays.toString(longestMonotoneSubarray));
            System.out.println("");
        }
        System.out.println("<Part 1/> :: Find the longest monotone sub-array:");
        System.out.println("");
    }

    private static void part2(IFrontlineEducationRequirements frontlineEducationSolver) {
        System.out.println("<Part 2> :: Build/Print Hierarchical Structure:");
        List<String> inputPart2 = getInputForPart(2);
        System.out.println("Input For Part 2: Build/Print Hierarchical Structure:");
        System.out.println(inputPart2);

        System.out.println("Output For Part 2: Build/Print Hierarchical Structure:");
        frontlineEducationSolver.buildHierarchicalSortedStructure(inputPart2);
        frontlineEducationSolver.printHierarchicalSortedStructure();
        System.out.println("<Part 2/> :: Build/Print Hierarchical Structure:");
    }

    private static List<String> getInputForPart(int partId) {
        String userDir = System.getProperty("user.dir");
        String filename = userDir + "//" + "input_part" + partId + ".txt";
        List<String> input = FileReader.readFileInList(filename);
        return input;
    }

}
