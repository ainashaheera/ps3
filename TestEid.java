//FILE:PROBLEM SOLVING 3
//PROJECT: POLYMORPHISM

// Description: 
// Polymorphism allows methods to be used generically for a wide range of 
// object arguments. This is known as generic programming.

// the Comission interface is used to declared the attribute that will be shared by class Seronding,
//  Cookies and Cake while EidDelicacy is the superclass for Seronding, Cookies and Cake.
// The method that shows using concept of polymorphism are calcCom() method 
// which all the Seronding, Cookies and Cake class will be using the method but with different value and parameter.  
// The values metioned different can be seen in the interface where the Seronding=2.50 and Cookies=5.00.
// So, when both classes (Seronding and Cookies) used the same method calcCom(),
// the method will invoke the different object dynamically.

// The display() method also shows the polymosrphism since all the subclasses are
// using it but with different value and attribute.
// The implementation used will be determined dynamically 
// by the Java Virtual Machine at runtime. This capability is known as 
// dynamic binding.

// Notes: The comments part shows the details on where did the Inheritance is used

//Revision History   //Date:02042020    //By: Jah 	//Description: Polymorphism

interface Commision
{
	public final double SERONDING=2.50;
	public final double COOKIES=5.00;
	public double calcCom ();
}

abstract class EidDelicacy
{
	String description;
	double price;
	double comis;

abstract public  void display();

public double getPrice()
{
	return price;
}
}

class Seronding extends EidDelicacy implements Commision
{
	private String type;
	int unitSold=1;

public Seronding (String desc, double p,String t )
{
	description=desc;
	price=p;
	type=t;
}

public double calcCom()
{
	return unitSold*SERONDING;
}


public void display()
{
	System.out.println("\nName :" +description);
	System.out.println("Price :" +price);
	System.out.println("Type :" +type);
	System.out.println ("Comision :" +calcCom());
}
}
class Cookies extends EidDelicacy implements Commision
{
	private String type;
	int unitSold=2;

public Cookies (String desc, double p, String t)
{
	description=desc;
	price=p;
	type=t;
}

public String getType ()
{
	return type;
}

public double calcCom()
{
	return unitSold*COOKIES;
}


public void display()
{
	System.out.println("\nName :" +description);
	System.out.println("Price :" +price);
	System.out.println("Type :" +type);
	System.out.println ("Comision :" +calcCom());

}
}

class Cake extends EidDelicacy
{
	private char size;

public Cake (String desc, double p,char s )
{
	description=desc;
	price=p;
	size=s;
}

public char getSize()
{
	return size;
}

public void display()
{
	System.out.println("\nName :" +description);
	System.out.println("Price :" +price);
	System.out.println("Size :" +size);

}
}

public class TestEid
{
	public static void main (String[] args)
	{
		EidDelicacy[] eid=new EidDelicacy[4];
		eid[0]=new Seronding("Seronding",10.4,"Meat");
		eid[1]=new Cookies("Biskut",35.07,"Coral crunchy");
		eid[2]=new Cake("Blueberry Cheese Cake",34.0,'L');
		eid[3]=new Cookies("Halwa",22.50,"Muskat");

	for (EidDelicacy i :eid)
	i.display();

	}
}








