package org.example;

import java.util.Objects;

public class StringNode {

    private final String value;
    private final String nodeName;
    private StringNode leftNode;
    private StringNode rightNode;


    public StringNode(String value, String nodeName) {
        Objects.requireNonNull(value, "Value cannot be null");
        this.value = value;
        Objects.requireNonNull(nodeName, "Name cannot be null");
        this.nodeName = nodeName;
    }

    public String getValue() {
        return value;
    }

    public String getNodeName() {
        return nodeName;
    }

    public StringNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(StringNode leftNode) {
        this.leftNode = leftNode;
    }

    public StringNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(StringNode rightNode) {
        this.rightNode = rightNode;
    }
}
