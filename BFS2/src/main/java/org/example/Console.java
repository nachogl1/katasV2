package org.example;

public class Console {
    public void soutSuccess(StringNode node) {
        System.out.println(String.format("Found value \"%s\" at node \"%s\"", node.getValue(), node.getNodeName()));

    }

    public void soutNode(StringNode node) {
        System.out.println(String.format("Visiting node  \"%s\"", node.getNodeName()));
    }
}
