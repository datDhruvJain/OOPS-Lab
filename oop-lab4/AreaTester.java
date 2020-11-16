import java.util.Scanner;

class Area {
	private float side1;
	private float side2;
	private double area;
	static double pi = 3.14;

	int calc_Area(int side){
		// calculate area of square
		int area = side*side;
		this.area = area;
		return area;
	}

	double calc_Area(float radius){
		// calculate area of circle
		// double area = 3.14*radius*radius;
		double area = Area.pi*radius*radius;
	this.area = area;	return area;

	}
	float calc_Area(float side1, float side2){
		// calculate area of rectangle
		float area = side1*side2;
			this.area = area;	return area;

	}

	void display(){
		System.out.println("Area of the given shape= " +this.area);
	}
}

class AreaTester{
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter choice (s/c/r)");
		char choice = scan.next().charAt(0); 

		switch (choice){
			case 's':{	
		
				System.out.println("Enter side: ");
				int num1 = scan.nextInt();  
		
				Area square = new Area();
				square.calc_Area(num1);
				square.display();
				break;
			}
			
			case 'c':{
				System.out.println("Enter radius: ");
				float num2 = scan.nextFloat() ; 
				Area circle = new Area();
				circle.calc_Area(num2);
				circle.display();
				break;
			}
			
			case 'r':{

				System.out.println("Enter side 1: ");
				float num3 = scan.nextFloat();
				System.out.println("Enter side 2: ");
				float num4 = scan.nextFloat();
				Area rectangle = new Area();
				rectangle.calc_Area(num3,num4);
				rectangle.display();
				break;
			}
			default :{
				System.out.println("Character not recognized");
			}
		}
			
		
	}
}
