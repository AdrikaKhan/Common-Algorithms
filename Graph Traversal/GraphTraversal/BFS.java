import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public static void main (String [] args){

        Node start = new Node (1);
        Node child1 = new Node (2);
        Node child2 = new Node (3);
        Node child3 = new Node (4);
        Node gchild1 = new Node (5);
        Node gchild2 = new Node (6);
        Node gchild3 = new Node (7);
        Node gchild4 = new Node (8);

        start.addEdge(start, child1);
        start.addEdge(start, child2);
        start.addEdge(start, child3);
        child1.addEdge(child1, gchild1);
        child2.addEdge(child2, gchild2);
        child2.addEdge(child2, gchild4);
        child3.addEdge(child3, gchild3);

        breadthFirstTraversal(start);
    }

    public static void breadthFirstTraversal (Node start){
        HashSet <Node> visited = new HashSet <>();
        Queue <Node> adjacent = new LinkedList<>();
        adjacent.add(start);

        while(!adjacent.isEmpty()){
            Node current = adjacent.remove();
            System.out.print(current.value + " ");
    
            for(int i=0; i<current.children.size(); i++){
                Node adjacentNode = current.children.get(i);
                if(!visited.contains(adjacentNode))
                    adjacent.add(current.children.get(i));
            }
            visited.add(current);
        }
    }
    
}
