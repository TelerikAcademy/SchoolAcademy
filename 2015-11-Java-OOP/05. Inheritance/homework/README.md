## Inheritance
### Homework

### Problem 1. Animal hierarchy
*	Create a hierarchy `Dog`, `Frog`, `Cat`, `Kitten`, `Tomcat` and define useful constructors and methods. Dogs, frogs and cats are `Animals`. All animals can produce sound. Kittens and tomcats are cats. All animals are described by age, name and sex. Kittens can be only female and tomcats can be only male. Each animal produces a specific sound.
*	Create arrays of different kinds of animals and calculate the average age of each kind of animal using a static method.

### Problem 2. Bank accounts
*	A `bank` holds different types of accounts for its customers: `deposit` accounts, `loan` accounts and `mortgage` accounts. Customers could be `individuals` or `companies` and they both have `names` and `addresses`.
*	All accounts have customer, balance and interest rate (monthly based).
	*	Deposit accounts are allowed to deposit and with draw money.
	*	Loan and mortgage accounts can only deposit money.
*	All accounts can calculate their interest amount for a given period (in months). In the common case its is calculated as follows: `number_of_months` * `interest_rate`.
*	Your task is to write a program to model the bank system by using classes and class inheritance.
*	*Hint: You should implement the calculation of the `interest` functionality through overridden methods.*

### Problem 3.* Account validations
*	Loan accounts have no interest for the first `3` months if are held by individuals and for the first `2` months if are held by a company.
*	Deposit accounts have no interest if their balance is positive and less than `1000`.
*	Mortgage accounts have ½ interest for the first `12` months for companies and no interest for the first `6` months for individuals.
