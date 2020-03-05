package java401challenges.graph;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GraphTest {

    Graph<Integer> graph;

    @Before
    public void setUp() throws Exception {
        graph = new Graph<Integer>();
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
    }

    @Test
    public void graphTest() {
        assertTrue(graph.getNodes().contains(0));
        assertTrue(graph.getNodes().contains(1));
        assertTrue(graph.getNodes().contains(2));
        assertTrue(graph.getNodes().contains(3));
        assertTrue(graph.getNodes().contains(4));
        assertFalse(graph.getNodes().contains(5));
        assertFalse(graph.getNodes().contains(6));

    }

    @Test
    public void graphSizeTest() {
        assertEquals("This graph should have 5 nodes/ vertext", 5, graph.getSize());
    }
}