// Write a program which reads a no from the keyboard and check if its divisible by 5, 6. (All possible combinations should be handled.eg. it could be not div by 5 & 6, div by 5 but not 6, or vice versa, or div by 5 & 6)

#include <iostream>
#include "one.h"

int One::ask_for_num()
{
    int num;
    std::cout << "Please enter a number: ";
    std::cin >> num;
    return num;
}
void One::check_divisible_5_6(int num)
{
    if(num%5 == 0 & num%6 == 0)
    {
        std::cout << "Divisible by 5 and 6" << std::endl;
    }
    else if(num%5 == 0)
    {
        std::cout << "Divisible by 5" << std::endl;
    }
    else if (num%6 == 0)
    {
        std::cout << "Divisible by 6" << std::endl;
    }
}