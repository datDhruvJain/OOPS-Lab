Question 1
---

Data:
-String name,
-String cardNo,
-boolean enabled,
-int pin,
-String expiryMonth,
-int cardType, (Platinum =3, Gold =2, Silver =1),
-int currentCredit,
int creditLimit.
Methods:
+CreditCard()
+changePin(int newPin)
+transact(int amt),
+changeCardStatus(boolean status)
+display()

Note:
1. – indicates private access specifier, + indicates protected access specifier
2. transact() should check if the card is enabled + pin + credit limit.
3. Further based on the card type a discount is offered
3% for platinum, 2% for Gold and 1% for Silver.
Create a class CreditTester to include main method. Create objects of CreditCard in this main
method and work on functionalities.

Question 2
---

-Id: String
-name: String
-dept: int
-basic: float
-allowance: float
-totalSalary: float
Method:
+Employee()
+calculateSalary()
+displayDetails()

Write a Java Program to declare any class named Employee with the given attributes. Create
another class which has main method. Create atleast 3 objects of the class employee, using
constructor pass the user input values to assign to attributes.
1. Calculate salary using the rule:
Total salary is basic salary + HRA +Allowance
Note:
Dept: 1 for staff, 2 for accounts, 3 for admin
HRA=40% of basic salary
Allowance = 1500 for Dept 1
2500 for Dept 2
3500 for Dept 3
2. Print details of the object.
