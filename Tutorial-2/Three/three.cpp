// 3. Write a complete Java program that reads an integer no from the user that computes the sum and prints the value.
// Eg no : 12345, output = 15
#include<iostream>
#include "three.h"

Three::Three()
{
	std::cout << "This class calculates the sum of the digits given in a number.\neg: 12345 = 15" << std::endl;
}

int Three::sum_of_digits(long num)
{
	int sum = 0;
	while(num/10 != 0)
	{
		sum += num%10;
		num /= 10;
	}
	sum += num;
	return sum;
}

int Three::get_from_user()
{
	int num;
	std::cout << "Enter Number: " << std::endl;
	std::cin >> num;
	return num;
}
