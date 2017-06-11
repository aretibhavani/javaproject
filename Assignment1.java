class Assignment1
{
	int a=10;  //1st instance var
    String name="sai";   //2nd instance var
static int b=20;       //1st static var
static String firstname="areti";  //2nd static var


void m1() //1st method without static
    {
		System.out.println(a);
		System.out.println(name);
		System.out.println(b);
	    System.out.println(firstname);
	}


	static void m2()  //2nd method with static keyword,since it is a static we have to creat an obj
	{ 
		Assignment1 obj2=new  Assignment1();  //object creation

		  System.out.println(obj2.a);  
		  System.out.println(obj2.name);
		  System.out.println(b);
	      System.out.println(firstname);
		 
	}
	public static void main(String[] agrs)
	{
		 Assignment1 obj=new  Assignment1();
	obj.m1();
	obj.m2();
	
	}

	
}
