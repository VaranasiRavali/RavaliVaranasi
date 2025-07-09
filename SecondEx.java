package ConstructorEx;


class A1

{
	int id;
	String name;
	float salary;
	boolean isMarried;
	//>>This is called Prameterized constructor
		A1(int i,String n,float s)
		{
			id=i;
			name=n;
			salary=s;
		}
	 A1(int i,String j,float q, boolean g)
	 {
		 id=i;
		 name=j;
		 salary=q;
		 isMarried=g;
				
	 }
	 void display()
	 {
		 System.out.println(id+"     "+name+"    "+salary+"    "+isMarried);
	 }
}

public class SecondEx {

	public static void main(String[] args) {

    A1 obj=new A1(45,"Ganesh",80000);
    	obj.display();
    	
    	A1 obj1=new A1(45,"Ganesh",80000,true)	;
    	obj1.display();    		

	}

}
