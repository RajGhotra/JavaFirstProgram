package schoolManagement;

import java.io.InputStream;
import java.util.HashSet;
import java.util.Scanner;

public class Student extends Person {
Scanner sc=new Scanner(System.in);
	
	String studentID;
	double percentage;
	
	
public Student(String name, int age, String gender, String studentID, double percentage) {
		super(name, age, gender);
		this.studentID = studentID;
		this.percentage = percentage;
	}

	@Override
	public void describeRole() {
		System.out.println("Enter the student's Name:"+name);
		//String nameEntered=sc.next();
		System.out.println("Enter the student's Age:"+age);
		System.out.println("Enter the student's Gender:"+gender);
		System.out.println("Enter the students's academic percentage:"+percentage);
		
		
		
	}
	public void determineStream() {
		if(percentage>=85) {
			System.out.println("Allocated Stream is : Non-Medical");
		}else if(percentage>=75&&percentage<=84.99) {
			System.out.println("Allocated Stream is : Medical");
		}else if(percentage>=65&&percentage<=74.99) {
			System.out.println("Allocated Stream is : Commerce");
		}
		else {
			System.out.println("Allocated Stream is : Arts");
		}
	}
	public void rateTeacher(Teacher teacher,int rating) {
		
		System.out.println("Please Enter the teacher's name you wish to rate :");
		 String teacherName=sc.next()	;
		
      System.out.println("Rating of "+teacherName +"is "+rating);
	
	
		
	}

}
