package com.frontlineeducation.codesample.germanvillalba.core;

import java.util.TreeMap;

/**
 * @author German Villalba
 * TrieNode is a node of a Trie.
 * A trie is a Hieralchical Structure, a special type of n-ary tree.
 * This particular implementation uses a TreeMap<String, TrieNode> to represent the children
 * of the n-ary node.
 * For further reference:
 * The advantage of this approach is that the traversal of the trie supports ordered operations.
 *
 * Regarding the "TreeMap" class:
 *      "The map is sorted according to the natural ordering of its keys"
 *      "This implementation provides guaranteed log(n) time cost for the containsKey, get, put and remove operations"
 *      https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/TreeMap.html
 */
public class TrieNode {
    private String value;
    private TreeMap<String, TrieNode> children;

    public TrieNode() {
        this.value = null;
        this.children = new TreeMap<>();
    }

    public TrieNode(String value) {
        this.value = value;
        this.children = new TreeMap<>();
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
