// 4. Write a program that reads 3 edges of a triangle and determines if it’s a valid triangle or not. Also classify them as Equilateral, Isosceles, or Scalene triangle.

#include <iostream>
#include "four.h"

	bool Four::check_valid_triangle(int side1, int side2, int side3)
	{
		return 
			(side1*side1 == side2*side2 + side3*side3) ||
			(side2*side2 == side1*side1 + side3*side3) ||
			(side3*side3 == side2*side2 + side1*side1);
	}

	int Four::check_type_triangle(int side1, int side2, int side3)
	{
		if (side1 == side2 && side2 == side3)
		{
			std::cout << "The triangle is Equilateral" << std::endl;
			return 1;
		}

        else if (side1 == side2 || side2 == side3 || side1 == side3)
        {
            std::cout << "The triangle is Scalene" << std::endl;
            return 2;
        }

        else return 0;

	}
