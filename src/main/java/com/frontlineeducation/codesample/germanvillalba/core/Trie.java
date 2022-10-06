package com.frontlineeducation.codesample.germanvillalba.core;

import java.util.*;

/**
 * @author German Villalba
 */
public class Trie {
    private static final String INDENTATION_STR = "--";
    private TrieNode root;

    public Trie() {
        this.root = new TrieNode();
    }

    public void addRecord(String[] record) {
        this.addRecord(record, this.root, 0);
    }

    private void addRecord(String[] record, TrieNode node, int level) {
        int n = record.length;
        if (level == n) {
            return;
        }
        TreeMap<String, TrieNode> children = node.getChildren();
        String key = record[level];
        TrieNode child = children.get(key);
        if (child == null) {
            child = new TrieNode(key);
            children.put(key, child);
        }
        addRecord(record, child, level + 1);
    }

    public List<String> generateOutput() {
        List<String> output = new ArrayList<String>();
        this.generateOutput(this.root, -1, output);
        return output;
    }

    private void generateOutput(TrieNode node, int level, List<String> output) {
        if (node == null) {
            return;
        }
        String value = node.getValue();
        if (value != null) {
            String filler = "";
            for (int i = 0; i < level; i++) {
                filler += INDENTATION_STR;
            }
            output.add(filler + value);
        }
        TreeMap<String, TrieNode> children = node.getChildren();
        for (String key: children.keySet()) {
            TrieNode child = children.get(key);
            generateOutput(child, level + 1, output);
        }
    }
}
