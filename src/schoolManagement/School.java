package schoolManagement;

import java.util.ArrayList;

public class School extends Person {

public School(String name, int age, String gender) {
		super(name, age, gender);
		// TODO Auto-generated constructor stub
	}
ArrayList<String> teacherNames=new ArrayList<String>();
public ArrayList<String> getTeacherNames() {
	return teacherNames;
}
public void getStudentsInfo() {
	ArrayList<String> studentNames=new ArrayList<String>();
	studentNames.add("Rajinder Kaur");
	studentNames.add("prabhjot");
	studentNames.add("Emil");
	studentNames.add("Arsh");
	studentNames.add("Ravneet");
	System.out.println("Names of Students "+studentNames.toString());
	

}
@Override
public void describeRole() {
	// TODO Auto-generated method stub
	
}
}