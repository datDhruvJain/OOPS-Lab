import java.util.Scanner;
class Rectangle{
	
	float length, width, area, perimeter;
		
		Rectangle(){
		 this.length = 0;
		 this.width = 0;
		}
	
		Rectangle(float length, float width){
			this.length = length;
			this.width = width;
	}
	
	float calculate_area(){
		area =	length*width;
		return area;
	}
	float calculate_perimeter(){
		perimeter = 2*(length+width);
		return perimeter;
	}		
}



class Que1{
	public static void main(String args[]){
		
		/*
		Rectangle rect1 = new Rectangle(4,3);
		Rectangle rect2 = new Rectangle(6,5);

		if(rect1.area > rect2.area){ System.out.println("Area of rectangle 1 is greater");}
		else { System.out.println("Area of rectangle 2 is greater");}

		if(rect1.perimeter > rect2.perimeter) {System.out.println("perimeter of rectangle 1 is greater");} 
		else  {System.out.println("perimeter of rectangle 2 is greater");}
		*/

		Scanner scan = new Scanner(System.in);
		
		Rectangle rect3 = new Rectangle();
		rect3.length = scan.nextFloat();
		rect3.width = scan.nextFloat();
		rect3.calculate_area();
		rect3.calculate_perimeter();	
		
		Rectangle rect4 = new Rectangle(4,5);
		rect4.calculate_area();
		rect3.calculate_perimeter();
		
		if(rect3.area > rect4.area){ System.out.println("Area of rectangle 1 is greater");}
		else { System.out.println("Area of rectangle 2 is greater");}

		if(rect3.perimeter > rect4.perimeter) {System.out.println("perimeter of rectangle 1 is greater");} 
		else  {System.out.println("perimeter of rectangle 2 is greater");}

	}
}
