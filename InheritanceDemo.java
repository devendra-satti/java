import java.io.*;

class Employee
{
	float salary =500;
}

class Programmer extends Employee
{
	int bonus;
	void display()
	{
		System.out.println("Salary of the employee is "+(salary+bonus));
	}
}

class InheritanceDemo
{
	public static void main(String args[])
	{
		Employee e = new Employee();
		Programmer p = new Programmer();
		e.salary=500;
		p.bonus=150;
		System.out.println("Salary of the employee is "+e.salary);
		System.out.println("Bonus for programmer is "+p.bonus);
		
		p.display();
	}
}
