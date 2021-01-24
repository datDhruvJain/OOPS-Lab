#ifndef RECTANGLE_H
#define RECTANGLE_H

class Rectangle
{
	float length,width, area, perimeter;
	public:
	Rectangle();
	Rectangle(float len, float wid);

	float calculate_area(float len, float wid);
	float calculate_area();

	float calculate_perimeter(float len, float wid);
	float calculate_perimeter();
};

#endif
