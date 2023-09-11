// 13.Create an inner class Animal which has a method called eating to display eating habits. Use this method  in the outer class.

interface AnimalEat
{
	void eat();
}
interface AnimalTravel
{
	void travel();
}
class Animal implements AnimalEat, AnimalTravel
{
	public void eat()
	{
		System.out.println("\nAnimal is eating");
	}
	public void travel()
	{
		System.out.println("\nAnimal is travelling");
	}
}
public class Assignment1Q13 {
	public static void main(String[] args) {
		Animal A= new Animal();
		A.eat();
		A.travel();
	}

}
