// Write a complete Java program that generates the first ‘n’ Fibonacci numbers, where ‘n’ is read as user input.
// Eg : Enter n: 6 Output: 1 1 2 3 5 11
#include "two.h"

int Two::Fibonacci(int n)
{
    int nm2 = 0;
    int nm1 = 1;
    int fbn;
    for(int i =0; i<n; i++)
    {
        fbn = nm2 + nm1;
        nm2 = nm1;
        nm1 = fbn;
        std::cout << fbn << " ";
    }
    std::cout << "The fbn is " << fbn << std::endl;
    return fbn;
}