package schoolManagement;

import java.util.Scanner;

public class Main {

	private static final Teacher Teacher = null;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Springfield High School Stream Allocation and Teacher Rating system!");

		Student stu=new Student("Rajinder Kaur", 28, "F", "A17138", 87);
		stu.describeRole();
		System.out.println("Stream Allocation Result");
		stu.determineStream();
		System.out.println("______Rating____");
		stu.rateTeacher(Teacher  , 5);

		System.out.println("-----Updated Teacher rating------");
		 Teacher teach=new Teacher("Alice Johnson", 35, "M", "E1105", 15000, 4);
		 
		 teach.addRating(4);
		 teach.calculateAverageRating();
		 teach.describeRole();
	}

}
