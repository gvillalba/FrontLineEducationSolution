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

    public List<String> print() {
        List<String> output = new ArrayList<String>();
        this.print(this.root, -1, output);
        return output;
    }

    private void print(TrieNode node, int level, List<String> output) {
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
            print(child, level + 1, output);
        }
    }

//    public static void main(String[] args) {
//        System.out.println("Test");
//        String[] record1 = {"A", "B", "C"};
//        String[] record2 = {"A", "B", "D"};
//        String[] record3 = {"A", "E", "F"};
//        Trie trie = new Trie();
//        trie.addRecord(record1);
//        trie.addRecord(record2);
//        trie.addRecord(record3);
//
//        System.out.println(trie);
//        trie.print();
//    }
    public static void main(String[] args) {
        System.out.println("Test");

//        1.2.3
//        1.2.5
//        1.5.6
//        1.2.4
//        2.5.6
//        1.5.7
//        2.5.3

        String[] record1 = {"1", "2", "3"};
        String[] record2 = {"1", "2", "5"};
        String[] record3 = {"1", "5", "6"};
        String[] record4 = {"1", "2", "4"};

        String[] record5 = {"2", "5", "6"};

        String[] record6 = {"1", "5", "7"};

        String[] record7 = {"2", "5", "3"};



        Trie trie = new Trie();
        trie.addRecord(record1);
        trie.addRecord(record2);
        trie.addRecord(record3);
        trie.addRecord(record4);
        trie.addRecord(record5);
        trie.addRecord(record6);
        trie.addRecord(record7);


        System.out.println(trie);
        trie.print();
    }


}
