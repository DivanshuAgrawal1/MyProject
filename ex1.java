//super keyword used to call immediate base class constructor 
//you have to use extends keyword if not use it will show only Derived class print
class Base
{
	Base()
	{
		System.out.println("Base class constructor is called.");
	}
}

class Derived extends Base
{
	Derived()
	{
		super();
		System.out.println("Derived class constructor is called.");
	}
}

class Demo
{
	public static void main(String[] args)
	{
		Derived obj= new Derived();
	}
}

//if super is not used explicitly compiler will automamtically add super as the first statement
//because the derived class extends the base class

class Base
{
	Base()
	{
		System.out.println("Base class constructor is called.");
	}
}

class Derived extends Base
{
	Derived()
	{
		System.out.println("Derived class constructor is called.");
	}
}

class Demo
{
	public static void main(String[] args)
	{
		Derived obj= new Derived();
	}
}

