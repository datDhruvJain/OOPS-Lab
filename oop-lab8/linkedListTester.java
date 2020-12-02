import java.util.LinkedList;

class linkedListTester{
	public static void main(String[] args){
		LinkedList<Integer> link =  new LinkedList<Integer>();
		link.add(3);
		link.add(1);
		link.add(5);
		link.add(7);
		link.add(9);
		link.add(0);
		link.add(2);
		link.add(4);
		link.add(8);
		link.add(6);
		
		int n = link.size(); 
        	for (int i = 0; i < n-1; i++){ 
            		for (int j = 0; j < n-i-1; j++){ 
                		if (link.get(j) > link.get(j+1)) 
                		{ 
                    		int temp = link.get(j);
			       link.set(link.get(j), link.get(j+1));	
                    		link.set(j+1, temp); 
                }
	}
}

