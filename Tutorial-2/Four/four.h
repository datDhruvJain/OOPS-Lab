// 4. Write a program that reads 3 edges of a triangle and determines if it’s a valid triangle or not. Also classify them as Equilateral, Isosceles, or Scalene triangle.

#ifndef FOUR_H
#define FOUR_H
class Four
{
	public:
	bool check_valid_triangle(int side1, int side2, int side3);

	int check_type_triangle(int side1, int side2, int side3);
};
#endif