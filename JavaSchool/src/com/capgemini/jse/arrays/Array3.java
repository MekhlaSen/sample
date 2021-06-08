package com.capgemini.jse.arrays;

class Emp
{
	int empid;
	String empname;
	public Emp(int empid,String empname)
	{
		this.empid=empid;
		this.empname=empname;
	}
	
	public String toString()
	{
		return empid + " " + empname;
	}
}
public class Array3 {
	
	public static void main(String[] args) {
		
		Emp e1=  new Emp(100,"ms");
		Emp e2 = new Emp(101,"Mekhla");
		Emp e3 = new Emp(102,"Bella");
		
		Emp emp[]= {e1,e2,e3};
		
		for(Emp e: emp)
		{
			System.out.println(e);
		}
		
		
	}

}