import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree{
	public static void main (String [] args){
        Node head = new Node(50);
        head.left = new Node(40);
        head.right = new Node(70);
        head.left.left = new Node(20);
        head.left.right = new Node(30);
        head.right.left = new Node(60);
        head.right.right = new Node(100);

        bfs(head);
        invertTree(head);
        bfs(head);

	}

	public static void invertTree(Node head){
		if (head == null)
			return;
		Node temp = head.left;
		head.left = head.right;
		head.right = temp;
		
		invertTree(head.left);
		invertTree(head.right);

	}

    public static void bfs(Node head){
        if(head == null)
            return;
        Node ptr = head;
        Queue <Node> adjacent = new LinkedList<>();
        adjacent.add(ptr);
        while(!adjacent.isEmpty()){
            Node curr = adjacent.remove();
            if(curr != null){
                adjacent.add(curr.left);
                adjacent.add(curr.right);
                System.out.print(curr.value + " ");
            }
        }
        System.out.println();   
    }
}
