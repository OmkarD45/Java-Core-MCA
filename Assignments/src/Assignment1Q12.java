// 12.Define a class Student with attributes rollno and name. Define default and parameterized constructor.
// Override the toString() method. Keep the count of Objects created. Create objects using parameterized constructor and Display the object count after each object is created.

import java.util.Scanner;
class Student {
	int rollNo;
	String StudentName;
  static int objCount = 0;

  //Parameterized ctr
  Student(int rno, String name) {
    this.rollNo = rno;
    this.StudentName = name;
  }
  //default ctr
  Student() {
    objCount++;
    System.out.println("Created Objects Count is: " + objCount);
  }
  public String toString() {
    return ("-------------------*-------------------------\nStudent Roll No: " + rollNo + "\nStudent Name: " + StudentName);
  }
}
public class Assignment1Q12 {

	public static void main(String[] args) {
		Student s1 = new Student(1,"ABC");
		Student s2 = new Student(2,"PQR");
		Student s3 = new Student(3,"EFG");
		System.out.println("\nAll objects values are: \n");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());

	}

}
