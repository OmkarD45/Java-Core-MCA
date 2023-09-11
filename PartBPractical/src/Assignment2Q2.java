import java.util.Scanner;
class Invalid_Age extends Exception{	
}
class Voter{
	int age;
	void getAge() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		age=sc.nextInt();
	}
	void check() throws Invalid_Age {
		if(age>18) {
			System.out.println("Eligible to vote");
		}
		else {
			throw new Invalid_Age();
		}
	}
}
public class Assignment2Q2 {
	public static void main(String[] args) {
		Voter v=new Voter();
		v.getAge();
		try {
			v.check();
		} catch (Invalid_Age e) {
			e.printStackTrace();
		}
	}
}
