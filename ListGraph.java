import java.util.List;
import java.util.ArrayList;

//Adjacency list class from https://www.algotree.org/algorithms/adjacency_list/graph_as_adjacency_list_java/

public class ListGraph implements Graph{

    int nodes;
    List<List<Integer>> adjlist;

    ListGraph(int numNodes) {
        nodes = numNodes;
        adjlist = new ArrayList<>(nodes);
        for (int i=0; i<nodes; i++)
            adjlist.add(new ArrayList<>());
    }

    public void addEdge(int sourceNode, int connectedNode) {
        adjlist.get(sourceNode).add(connectedNode);
        adjlist.get(connectedNode).add(sourceNode);
    }

    public void removeEdge(int sourceNode, int connectedNode) {
        adjlist.get(sourceNode).remove(Integer.valueOf(connectedNode));
        adjlist.get(connectedNode).remove(Integer.valueOf(sourceNode));
    }


} 