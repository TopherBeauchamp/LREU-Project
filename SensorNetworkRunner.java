import java.util.Scanner; 
import java.util.List;
import java.util.ArrayList;

public class SensorNetworkRunner {
    
    public static void main(String[] args){ 
        Scanner scan = new Scanner(System.in);
        int numNodes, width, length, transmissionRange,  graphChoice, algoChoice; 

        //Getting user input 
        System.out.println("Please enter width of sensor network:");
        width = scan.nextInt();
        System.out.println("Please enter length of sensor network:");
        length = scan.nextInt();
        System.out.println("Please enter number of nodes in sensor network:");
        numNodes = scan.nextInt();
        System.out.println("Please enter transmission range:");
        transmissionRange = scan.nextInt();
        System.out.println("Type 1 for adjacency matrix or 2 for adjacency list:");
        graphChoice = scan.nextInt();
        System.out.println("Type 1 for breadth first search or 2 for depth first search:");
        algoChoice = scan.nextInt();

        scan.close(); 

        //Initializing graph based on user input
        Graph graph = null; 
        if(graphChoice == 1){ 
            graph = new MatrixGraph(numNodes);
        }
        else if(graphChoice == 2){ 
            graph = new ListGraph(numNodes);
        }
        else{ 
            System.out.println("Pick the right number next time!!");
            System.exit(0);
        }

        //Initializing nodes 
        List<Node> nodeList = new ArrayList<Node>(numNodes);
        for(int i = 1; i <= numNodes; i++){ 
            nodeList.add(new Node(i, width, length));
        }

        //If a pair of nodes are in distance of each other, add them to the graph
        for (int i = 1; i <= numNodes; i++) {
            for (int j = i + 1; j < numNodes; j++) {
                if (nodeList.get(i).getDistance(nodeList.get(j)) <= transmissionRange) {
                    graph.addEdge(i, j);
                }
            }
        }
    }
}
