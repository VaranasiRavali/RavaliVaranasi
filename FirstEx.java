package ConstructorEx;


//the name of constructor and class should be same
class A
{
	A()
	{
		System.out.println("Hi");
	}

   void display()
   {
	   System.out.println("Hello");
   }

public class FirstEx
{
public static void main(String[] args)
{
	A obj=new A();
	obj.display();
}
}
}
