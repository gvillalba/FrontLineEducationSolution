package com.frontlineeducation.codesample.germanvillalba.solver;

import com.frontlineeducation.codesample.germanvillalba.core.Trie;

import java.util.Arrays;
import java.util.List;

/**
 @author German Villalba
 SortedTrie is a Hierarchical Structure
 It is a special type of n-ary tree.
**/
public class SortedTrie {
    private final Trie trie;

    public SortedTrie() {
        this.trie = new Trie();
    }

    public void buildSortedTrie(List<String> data) {
        for (String record: data) {
            String[] recordTokens = record.split("\\.");
            this.trie.addRecord(recordTokens);
        }
    }

    public List<String> getOutput() {
        return this.trie.generateOutput();
    }
}
