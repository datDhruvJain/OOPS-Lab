#include "Rectangle.h"
#include <iostream>

Rectangle::Rectangle(float len, float wid)
{
	length = len;
	width = wid;
}

float Rectangle::calculate_area()
{
	return length*width;
}

float Rectangle::calculate_area(float len, float wid)
{
	return len*wid;
}

float Rectangle::calculate_perimeter()
{
	return 2*(length+width);
}

float Rectangle::calculate_perimeter(float len, float wid)
{
	return len*wid;
}
