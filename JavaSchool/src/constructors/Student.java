package constructors;

import constructors.Student;

public class Student {
	
	//variable declaration
		int stid;
		String stname;
		
		//constructor
		public Student()
		{
			//initialization logic
			stid=100;
			stname="Bella";
		}
		//for displaying the values
		public void display()
		{
			System.out.println("student id " + stid);
			System.out.println("student name is " + stname);
		}      
	
		
		//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            

		//object creation
		
		Student obj = new Student();
		
		//calling display()
		obj.display();
	}

	}


