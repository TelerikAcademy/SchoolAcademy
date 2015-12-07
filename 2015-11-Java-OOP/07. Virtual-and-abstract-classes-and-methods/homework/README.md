Homework: Virtual and abstract classes and methods
===================================

### Problem 1. Students and workers
*	Define **abstract** class `Human` with a first name and a last name fields. 
*	Define a new class `Student` which is derived from `Human` and has a new field `type`, which is an enumeration that has the options `PRIMARY`, `SECONDARY` and `COLLEGE`, and `averageGrade` field, which is the student's average grades for the year.
*	Define class `Worker` that is derived from `Human` and with properties `weekSalary` and `workHoursPerDay` and a method `moneyPerHour()` that returns money earned per hour by the worker.
	* `Worker` implements the interface `IWorker` that has the method `work()` which returns, as a string, the first and last name of the worker and his work hours and monthly salary.
	* _Example: `Gosho Motikata works 10 hours per day and makes 350 leva a month.`_
*	Define the proper constructors and properties for this hierarchy.

### Problem 2. Field validations
*	 Validate all setters for the `Student` and `Worker` classes.
	 * First and last names should be between 3 and 20 symbols.
	 * `grade` should be between 2 and 6, inclusive.
	 * `workHoursPerDay` should be between 2 and 14, inclusive.
* Throw IllegalArgumentException if the validations fail.

### Problem 3.* Best workers and students
*	Initialize a list of 10 workers
	* Print the first and last name of the top three workers with higest salary.
	* Print the worker with the highest salary and the least `workHoursPerDay`.
* 	Initialize a list of 10 students
	* Print the top three students with the highest average grade.
	* Print the student with the highest grade from each student type _(`PRIMARY`, `SECONDARY` and `COLLEGE`)_.