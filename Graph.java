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

	void show(){
		System.out.println(connections);
	}


}

class Graph{

	public static void main(String[] args){
		

		Node n1 = new Node();
		Node n2 = new Node();
		n1.data = "a";
		n2.data = "b";
		Node.connect(n1,n2);
		System.out.println(n1.connections);
		

		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of vertices: ");
		int num = scan.nextInt();

		Node[] vertices = new Node[num];
		
		for (int i=0; i<num; i++){
			vertices[i] = new Node();
			vertices[i].data = Integer.toString(i);
			System.out.println("Enter connections of " + i + " vertex: ");
			String inp = scan.next();
			vertices[i].connect(inp);
			vertices[i].show();
			
		}

		*/
		//for (int i; i<num;i++){
		//	vertices[i].
		//}
	}
}
