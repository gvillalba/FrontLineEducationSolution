package com.frontlineeducation.codesample.germanvillalba.core;

import java.util.TreeMap;

/**
 * @author German Villalba
 */
public class TrieNode {
    private String value;
    private TreeMap<String, TrieNode> children;

    public TrieNode() {
        this.value = null;
        this.children = new TreeMap<String, TrieNode>();
    }

    public TrieNode(String value) {
        this.value = value;
        this.children = new TreeMap<String, TrieNode>();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public TreeMap<String, TrieNode> getChildren() {
        return children;
    }

    public void setChildren(TreeMap<String, TrieNode> children) {
        this.children = children;
    }
}
