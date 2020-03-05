package java401challenges.graph;


import java.util.*;

public class Graph<T> {
    private int size;
    private Map<T, List<T>> nodes = new HashMap<>();

    public Graph() {
        nodes = new HashMap<>();
    }

    public void addNode(T value) {
        nodes.put(value, new LinkedList<T>());
        size++;

    }

    public void addEdge(T source, T destination) {
        if (!nodes.containsKey(source))
            addNode(source);

        if (!nodes.containsKey(destination))
            addNode(destination);

        nodes.get(source).add(destination);
    }

    public Set<T> getNodes() {
        return nodes.keySet();
    }

    public int getSize() {
        System.out.println("The Graph has: " + size + " nodes/vertex.");
        return size;
    }

    public List<T> getNeighbors(T node) throws IllegalArgumentException {
        if(!nodes.containsKey(node)) {
            throw new IllegalArgumentException("Node doesn't exist within the graph.");
        }
        return nodes.get(node);

    }

}

// Referenced from https://www.geeksforgeeks.org/implementing-generic-graph-in-java/

