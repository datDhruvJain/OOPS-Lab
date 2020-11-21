import java.util.Scanner;
class Shape{
	private String color;
	private boolean filled;

	public Shape() {
		String = "green";
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

	public void toString(){
		System.out.println("A shape with color " + color + " and  " + filled);
	}
}
class Circle extends Shape{
	private double radius = 1.0;
	private static final pi=3.14;

	Circle(){radius=1.0}
	
	Circle(double radius){
		this.radius = radius;
	}
	
	Circle(double radius, String color, boolean filled){
		this.radius = radius;
		// check this
		this.color = color;
		this.filled = filled;
	}

	// Setter for radius
	void setRadius(double radius){
		this.radius = radius;
	}

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

	String toString(){
		System.out.println("A Circle of " + radius + " with color " + color + " and  " + filled);
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
		this.color = color;
		this.filled = filled;

	}
	// Setter for length
	void setLength(boolean length){
		this.length = length;
	}

	// Getter for length
	double getLength(){
		return length;
	}
	// Setter for width
	void setWidth(boolean width){
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

	String toString(){
		System.out.println("A Rectangle of length " + length + " and width " + width + " with color " + color + " and  " + filled);
		
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
		this.color = color;
		this.filled = filled;

	}
	// Setter for length
	void setSide(boolean side){
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

	String toString(){
		System.out.println("A Square of side " + side + " with color " + color + " and  " + filled);
		
	}
}
class inheritenceTester{
	public static void main(String[] args){

	}
}
