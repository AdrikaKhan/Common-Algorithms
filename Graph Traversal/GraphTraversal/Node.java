import java.util.ArrayList;

public class Node{

    int value;
    ArrayList <Node> children;
    
    public Node(){
        children = new ArrayList<Node>();
    }
    
    public Node(int v){
        value = v;
        children = new ArrayList<Node>();
    
    }
    
    public void addEdge(Node start, Node end){
        start.children.add(end);
    }
    
}
    