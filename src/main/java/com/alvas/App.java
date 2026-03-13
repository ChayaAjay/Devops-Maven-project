package com.alvas;

public class App
{
	public int fact(int n)
	{
		if(n==1)
			return 1;
		else
			return (fact(n-1)*n);
	}
	public static void main( String[] args )
	{
		App obj=new App();
		int res= obj.fact(3);
		System.out.println("The Result="+res);
	}
 
}