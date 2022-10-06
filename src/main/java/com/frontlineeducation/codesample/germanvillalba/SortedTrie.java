package com.frontlineeducation.codesample.germanvillalba;

import com.frontlineeducation.codesample.germanvillalba.core.Trie;

import java.util.Arrays;
import java.util.List;

/**
 @author German Villalba
**/

/*
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
public class SortedTrie {
    private final Trie trie;

    /**
     (1) Implement a method to convert a sequence of records into a hierarchical (tree) sorted structure.
     */
    public SortedTrie(List<String> data) {
        this.trie = new Trie();
        for (String record: data) {
            String[] recordTokens = record.split("\\.");
            this.trie.addRecord(recordTokens);
        }
    }

    public static void main(String[] args) {
        // TODO: How to get the input? From a file? command line?
        String[] data = {
                "1.2.3",
                "1.2.5",
                "1.5.6",
                "1.2.4",
                "2.5.6",
                "1.5.7",
                "2.5.3"
        };
        List<String> input = Arrays.asList(data);
        SortedTrie sortedTrie = new SortedTrie(input);
        sortedTrie.printToSystemOut();
    }

    /**
     (2) Provide a method to print the resulting tree structure.
     */
    public void printToSystemOut() {
        List<String> output = this.getOutput();
        for (String record: output) {
            System.out.println(record);
        }
    }

    public List<String> getOutput() {
        return this.trie.generateOutput();
    }
}
