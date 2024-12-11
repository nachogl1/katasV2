package org.example;

import java.util.ArrayDeque;
import java.util.Queue;

public class BFS {

    private Console console;

    public BFS(Console console) {
        this.console = console;
    }

    public String search(StringNode root, String searchValue) {
        Queue<StringNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            StringNode currentNode = queue.remove();
            this.console.soutNode(currentNode);

            if (currentNode.getValue().equals(searchValue)) {
                this.console.soutSuccess(currentNode);
                return currentNode.getNodeName();
            } else {
                if (currentNode.getLeftNode() != null) {
                    queue.add(currentNode.getLeftNode());
                }
                if (currentNode.getRightNode() != null) {
                    queue.add(currentNode.getRightNode());
                }

            }

        }

        return "NOT FOUND";

    }


}
