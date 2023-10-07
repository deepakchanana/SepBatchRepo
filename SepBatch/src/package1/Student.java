package package1;
//{  } indicate this is the boundary(body) of the class
// Piller1----class creation--A class contains---variable + method
// what is variable--? which store some value and value can be change
// what is method ---? for performing any action/operation we create method for it


public class Student  // classname is Student piller1
{  
	int a; // that is a variable it will store integer value
	public void display() // methodname--display () indicate this is a method
	{ // this is the boundary of the method
		System.out.println("Welcome to all of you guys ");
	}
	public static void main(String[] args)  // piller2
	{  // boundary of the main method
		Student deepak=new Student(); // piller3
		deepak.display(); // . is the keyword use for calling the var,me
		deepak.display();
		deepak.a=233; // giving the value
		System.out.println(deepak.a); // printing the value
		deepak.a=34;
		System.out.println(deepak.a);
	}
	

}
