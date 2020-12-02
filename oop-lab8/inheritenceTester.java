import java.util.Scanner;
class Shape{
	private String color;
	private boolean filled;

	public Shape() {
		String color = "green";
		filled = true;
	}

	public Shape(String color, boolean filled){
		this.color = color;
		this.filled = filled;
	}

	// Setter for color
	public void setColor(String color){
		this.color = color;
	}

	// Getter for color
	public String getColor(){
		return color;
	}

	// Getter for filled
	public boolean isFilled(){
		return filled;
	}

	// Setter for filled
	public void setFilled(boolean set){
		filled = set;
	}

	public String toString(){
		return ("A shape with color " + color + " and  " + filled);
	}
}
class Circle extends Shape{
	private double radius = 1.0;
	private static final double pi=3.14;

	Circle(){radius=1.0;}
	
	Circle(double radius){
		this.radius = radius;
	}
	
	Circle(double radius, String color, boolean filled){
		this.radius = radius;
		// check this
		this.setColor(color);
		this.setFilled(filled);
	}

	// Setter for radius
	void setRadius(double radius){
		this.radius = radius;}

	// Getter for radius
	double getRadius(){
		return radius;
	}

	double getArea(){
		return pi*radius*radius;
	}

	double getPerimeter(){
		return 2*pi*radius;
	}

	public String toString(){
		return ("A Circle of " + radius + " with color " + getColor() + " and  " + isFilled());
	}
} 
class Rectangle extends Shape{
	private double width;
	private double length;

	public Rectangle(){
		width = 1.0;
		length = 1.0;
	}

	public Rectangle(double width, double length){
		this.width = width;
		this.length = length;
	}

	public Rectangle(double width, double length, String color, boolean filled){
		this.width = width;
		this.length = length;
		this.setColor(color);
		this.setFilled(filled);

	}
	// Setter for length
	void setLength(double length){
		this.length = length;
	}

	// Getter for length
	double getLength(){
		return length;
	}
	// Setter for width
	void setWidth(double width){
		this.width = width;
	}

	// Getter for radius
	double getWidth (){
		return width;
	}

	double getArea(){
		return length*width;
	}

	double getPerimeter(){
		return 2*(length + width);
	}

	public String toString(){
		return "A Rectangle of length " + length + " and width " + width + " with color " + getColor() + " and  " + isFilled();

		
	}
}

class Square extends Rectangle{

		private double side;
		private double length;

	public Square(){
		side = 1.0;
	}

	public Square(double side){
		this.side = side;
	}

	public Square(double side, String color, boolean filled){
		this.side = side;
		this.setColor(color);
		this.setFilled(filled);

	}
	// Setter for length
	void setSide(double side){
		this.side = side;
	}

	// Getter for length
	double getSide(){
		return side;
	}

	double getArea(){
		return side*side;
	}

	double getPerimeter(){
		return 4*side;
	}

	public String toString(){
		return ("A Square of side " + side + " with color " + getColor() + " and  " + isFilled());
		
	}
}
class inheritenceTester{
	public static void main(String[] args){
		Shape s1 = new Shape("green", true);
		System.out.println(s1.toString());
		// Rectangle s2 =  new Shape("red",false);
		// will not work
		Shape s2 = new Rectangle(1,2,"red",false);
		System.out.println(s2.toString());
	}
}
