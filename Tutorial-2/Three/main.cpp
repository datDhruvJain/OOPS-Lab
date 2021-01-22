#include <iostream>
#include "three.h"

int main()
{
	Three three;
	int num = three.get_from_user();
	std::cout << "The sum is: " << three.sum_of_digits(num) << std::endl;
}
