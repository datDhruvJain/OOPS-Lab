#include <iostream>
#include "Rectangle.h"

int main()
{
	Rectangle rect(12,4);
	std::cout << "Area is: " << rect.calculate_area() << std::endl;
	std::cout << "Perimeter is: " << rect.calculate_perimeter() <<  std::endl;
}
