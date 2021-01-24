I. Write Java Programs for the following
a. Define a class CreditCard which has String name, String cardNo, boolean
enabled, int pin, String expiryMonth, int cardType, (Platinum, Gold, Silver), int
currentCredit, int creditLimit. Provide the following methods. 1. appropriate
constructor, 2. changePin(int newPin), 3 transact(int amt), 4
changeCardStatus(boolean status) 5. display()
Note: transact() should check if the card is enabled + pin + credit limit. Further based on the
card type an discount is offered. 3% for platinum, 2% for Gold and 1% for Silver.
b. Write a complete Java program to simulate dice game. The program asks the user to guess a
no in the range 1..6. Then it generates a random no (1..6) compares with that guessed by user
and displays appropriate messages.
Eg : Input: Please enter your guess: 3
Output: OOPS, Sorry you lost. !!
c. Define a class Complex containing the real and imaginary parts of the complex no, and
member functions add(), sub(), mul(), div(), which work in the normal human semantics.
The class Complex is to be invoked from the ComplexNoTester as follows
public class ComplexNoTester {
public static void main(String[] args) {
Complex c1 = new Complex(1, 3); //1=&gt;real, 3=&gt;imag
Complex c2 = new Complex(“2 + 3i”);
Complex c3 = new Complex(c1);
c1.add(c2); // c1 = c1 + c2;
c1.add(3, 6); // c1 = c1 + complex(3,6);
c4 = c1.add(c3); //c4 = c1 + c3
c1.display();
}
}
