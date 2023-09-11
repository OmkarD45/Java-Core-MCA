// 10.Write a program to count number of object created for a class using static 
//  variable and static member function

public class Assignment1Q10 {
	static int count=0;
	public Assignment1Q10() {
		count++;
		System.out.println("");
	}
	static int objCount() {
		return count;
	}
	public static void main(String[] args) {
		Assignment1Q10 a1=new Assignment1Q10();
		Assignment1Q10 a2=new Assignment1Q10();
		Assignment1Q10 a3=new Assignment1Q10();
		Assignment1Q10 a4=new Assignment1Q10();
		System.out.println("Number of objects created= "+count);
	}
}