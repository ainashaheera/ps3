//FILE:PROBLEM SOLVING 3
//PROJECT: INHERITANCE

// Description: 
// The Worker class serves as the parent of all classes and contains information that applies to all workers. 
// Each worker has a name of type String. The Worker class contains a toString method to return the name of the worker.

// The HourlyWorker class represents a worker that earns an income based on hourly worked. 
// The HourlyWorker class contains variable hour of type integer that represents the number of hours worked. 
// It consists of an earning method that returns the result of hour * 5.00 (rate per hour). 
// It also consists of a toString method to return the worker information and his/her income.

// The MonthlyWorker class represents a worker that earns an income in a monthly basis. 
// It contains variable salary of type double that represents the monthly salary. 
// It consists of an earning method that returns the salary. 
// It also contains a toString method to return the worker information and his/her monthly income.
// The TestWorker class represents the application program that instantiates 
// HourlyWorker and MonthlyWorker objects, and then invoke their toString() method.

// Notes: The comments part shows the details on where did the Inheritance is used

//Revision History   //Date:02042020    //By: Jah //Description: Inheritance

//superclass or parent
class Worker
{
	private String name;
 	public Worker(String n)
 	{
		name = n;

	}

	public Worker()
	{
		System.out.println("In no argument constructor.");
	}

 public String toString()
 {
 	return "Name :"+name;
 }
}

//child or subclass
class HourlyWorker extends Worker
{
	private int hour;
	public HourlyWorker(String n, int h)
	{
		super(n);
		hour = h;
	}

public double earning()
{
	return hour * 5.00;
}

public String toString()
 {
	return super.toString()+"\nHours worked:" + hour+
 	"\nEarning:"+earning();
 }
}

//child or subclass
class MonthlyWorker extends Worker
{
 	private double salary;
	public MonthlyWorker(String n, double s)
	{
		super(n);
		salary = s;
	}

public double earning()
{
	return salary;
}

public String toString()
{
 	return super.toString() + "\nEarning:"+ earning();
 }
}

public class TestWorker
{
 	public static void main(String[] args){
 	HourlyWorker h1 = new HourlyWorker("Ali",6);
 	System.out.println (h1.toString());
	MonthlyWorker h2 = new MonthlyWorker("Abu",6000);
 	System.out.println (h2.toString());
 }
}

