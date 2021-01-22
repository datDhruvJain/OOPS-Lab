#include <iostream>
#include "one.h"

int main()
{
    One lol;
    int num = lol.ask_for_num();
    lol.check_divisible_5_6(num);
}