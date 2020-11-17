import java.util.Scanner;
import java.util.ArrayList;
class Node{
	String data;
	ArrayList<String> connections = new ArrayList<String>();
	Node(){
		data = null;
	}

	Node(String data, ArrayList<String> connections){
		this.data = data;
		this.connections = connections;
	}
	static void connect(Node n1, Node n2){
		n1.connections.add(n2.data);
		n2.connections.add(n1.data);
	}


}

class Graph{

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of vertices: ");
		int num = scan.nextInt();

		Node[] vertices = new Node[num];
		
		for (int i=0; i<num; i++){
			vertices[i] = new Node();
			vertices[i].data = Integer.toString(i);
			System.out.println("Enter connections of " + i + " vertex: ");
			String inp = scan.next();

			
		}

		for (int i; i<num;i++){
			vertices[i].
		}
	}
}
