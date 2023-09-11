// 14.Write a program for Deep cloning and shallow cloning.

class ObjectClass
{
	String Name;
	int Age;
	int deepValue = 90;
}

public class Assignment1Q14 {
	public static void main(String[] args) {
		System.out.println("------------------*Shallow Cloning*-------------------------");
		ObjectClass obj1 = new ObjectClass();
		obj1.Name = "MNO";
		obj1.Age = 24;

		System.out.println("\nOriginal Values of First Object: ");
		System.out.println("Name: "+obj1.Name);
		System.out.println("Age: "+obj1.Age);

		//Assigning ref
		ObjectClass obj2 = obj1;
		obj2.Name = "XYZ";
		obj2.Age = 26;

		System.out.println("\nAfter Shallow Cloning: ");
		System.out.println("\n\nFirst Object: ");
		System.out.println("Name: "+obj1.Name);
		System.out.println("Age: "+obj1.Age);

		System.out.println("\nSecond Object Ref Object One: ");
		System.out.println("Name: "+obj2.Name);
		System.out.println("Age: "+obj2.Age);

		System.out.println("\n------------------*Deep Cloning*-------------------------");
		ObjectClass obj3 = new ObjectClass();
		obj3.Name = "ABC";
		obj3.Age = 35;

		System.out.println("\nOriginal Values of First Object: ");
		System.out.println("Name: "+obj3.Name);
		System.out.println("Age: "+obj3.Age);
		System.out.println("deepValue: "+obj3.deepValue);

		ObjectClass obj4 = new ObjectClass();
		obj4.Name = "PQR";
		obj4.Age = 23;
		obj4.deepValue = 64;

		System.out.println("\nAfter Deep Cloning: ");
		System.out.println("\n\nFirst Object: ");
		System.out.println("Name: "+obj3.Name);
		System.out.println("Age: "+obj3.Age);
		System.out.println("deepValue: "+obj3.deepValue);

		System.out.println("\nSecond Object Ref Object One: \n"+ "Name: "+obj4.Name+ "\n"+"Age: "+obj4.Age+" \n deepValue: "+obj4.deepValue);


	}

}
