package package1;

public class Arithmetic // piller1`
{
	
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("sum result is "+c); // + is used for concat
		return c;
	}
	public int subtract(int x,int y)
	{
		int z;
		z=x-y;
		System.out.println("sub result is "+z);
		return z; 
	}
	public void multi(int a1,int a2)
	{
		int a3;
		a3=a1*a2;
		System.out.println("final result is "+a3);
	}
	public static void main(String[] args) // piller2 
	{
	 Arithmetic ob=new Arithmetic(); // piller3
	 int sumresult=ob.sum(12, 2);     // piller4
	 int subresult=ob.subtract(22, 2);
	 ob.multi(sumresult, subresult);
	}

}
