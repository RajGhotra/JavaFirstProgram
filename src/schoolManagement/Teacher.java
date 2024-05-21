package schoolManagement;

import java.util.ArrayList;

public class Teacher extends  Person{
String employeeID;
double salary;
int rating;
int newRating;


public Teacher(String name, int age, String gender, String employeeID, double salary, int rating) {
	super(name, age, gender);
	this.employeeID = employeeID;
	this.salary = salary;
	this.rating = rating;
}

public void  coursesTaught() {
	ArrayList<String> listsOfCourse=new ArrayList<String>();
	listsOfCourse.add("QA Testing ");
	listsOfCourse.add("IT Support");
	listsOfCourse.add("Digital Marketing");
	ArrayList<Integer> listOfRating=new ArrayList<Integer>();
	
	listOfRating.isEmpty();
}

@Override
public void describeRole() {
	ArrayList<String> teacherNames=new ArrayList<String>();
	teacherNames.add("Alice Johnson");
	teacherNames.add("Ketaki");
	teacherNames.add("Manvir");
	teacherNames.add("Swaroop");
	System.out.println(" List of Teachers :"+teacherNames.toString());
}

public int addRating(int newRating ) {
	return newRating;
	
}
public int calculateAverageRating() {
	return rating=(rating+newRating)/2;
	
}

}
