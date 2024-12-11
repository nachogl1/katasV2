package org.example;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class DFS {

    private final Console console;

    public DFS(Console console) {
        this.console = console;
    }

    public String search(StringNode root, String searchValue) {
        Stack<StringNode> queue = new Stack<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            StringNode currentNode = queue.pop();
            this.console.soutNode(currentNode);

            if (currentNode.getValue().equals(searchValue)) {
                this.console.soutSuccess(currentNode);
                return currentNode.getNodeName();
            } else {
                if (currentNode.getRightNode() != null) {
                    queue.add(currentNode.getRightNode());
                }
                if (currentNode.getLeftNode() != null) {
                    queue.add(currentNode.getLeftNode());
                }

            }

        }

        return "NOT FOUND";

    }


}
