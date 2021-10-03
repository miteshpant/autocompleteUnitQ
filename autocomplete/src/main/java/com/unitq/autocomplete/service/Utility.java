package com.unitq.autocomplete.service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Utility {

    public class TrieNode {
        Map<Character, TrieNode> children;
        char c;
        boolean isWord;

        public TrieNode(char c) {
            this.c = c;
            children = new HashMap<>();
        }

        public TrieNode() {
            children = new HashMap<>();
        }

        public void createTrie(String word) {
            if (word == null || word.isEmpty())
                return;
            char firstChar = word.charAt(0);
            TrieNode child = children.get(firstChar);
            if (child == null) {
                child = new TrieNode(firstChar);
                children.put(firstChar, child);
            }

            if (word.length() > 1)
                child.createTrie(word.substring(1));
            else
                child.isWord = true;
        }

    }

    TrieNode root;

    public Utility(List<String> words) {
        root = new TrieNode();
        for (String word : words)
            root.createTrie(word);

    }


    public void helper(TrieNode root, List<String> list, StringBuffer curr) {
        if (root.isWord) {
            list.add(curr.toString());
        }

        if (root.children == null || root.children.isEmpty())
            return;

        for (TrieNode child : root.children.values()) {
            helper(child, list, curr.append(child.c));
            curr.setLength(curr.length() - 1);
        }
    }

    public List<String> findMatch(String prefix) {
        List<String> list = new ArrayList<>();
        TrieNode lastNode = root;
        StringBuffer curr = new StringBuffer();
        for (char c : prefix.toCharArray()) {
            lastNode = lastNode.children.get(c);
            if (lastNode == null)
                return list;
            curr.append(c);
        }
        helper(lastNode, list, curr);
        return list;
    }

}
