import java.util.Iterator;
import java.util.LinkedList;

public class DFS{

        public LinkedList <Integer> adj[]; //holds all the neighbors
    
        @SuppressWarnings("unchecked")
        public DFS(int vertices){
            adj = new LinkedList[vertices];
            for(int i=0; i<vertices; i++){
                adj[i] = new LinkedList<Integer>();
            }
        }
        
        public void addEdge(int parent, int child){
            adj[parent].add(child);
        }
        
        public void dfsRecursiveTraversal(int start, Boolean visited []){
            visited[start] = true;
            System.out.print(start + " " );

            Iterator <Integer> neighbors = adj[start].listIterator();
            while(neighbors.hasNext()){
                int currNode = neighbors.next();
                if(!visited[currNode]){
                    dfsRecursiveTraversal(currNode, visited);
                }
        
        
            }
        
        }
    
    public static void main (String [] args){
                int vertices = 4;
                DFS graph = new DFS (vertices);
                graph.addEdge(0, 1);
                graph.addEdge(0, 2);
                graph.addEdge(1, 2);
                graph.addEdge(2, 0);
                graph.addEdge(2, 3);
                graph.addEdge(3, 3);

                Boolean [] visited = new Boolean [vertices];
                for (int i=0; i<visited.length; i++) {
                    visited[i] = false;
                    
                }
                graph.dfsRecursiveTraversal(1, visited);
    }
    
    
    
    }
    