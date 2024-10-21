import java.util.List;

//Adjacency matrix class from https://www.programiz.com/dsa/graph-adjacency-matrix 

public class MatrixGraph implements Graph {
    private boolean adjMatrix[][];
    private int numVertices;
  
    // Initialize the matrix
    MatrixGraph(int numVertices) {
      this.numVertices = numVertices;
      adjMatrix = new boolean[numVertices][numVertices];
    }
  
    // Add edges
    public void addEdge(int i, int j) {
      adjMatrix[i][j] = true;
      adjMatrix[j][i] = true;
    }
  
    // Remove edges
    public void removeEdge(int i, int j) {
      adjMatrix[i][j] = false;
      adjMatrix[j][i] = false;
    }
  
    public List<List<Integer>> bfs(){ 
        
      
    }
} 
 