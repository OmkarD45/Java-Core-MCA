package Games;
public class Outdoor {
	String player;
	public Outdoor(String player) {
		this.player = player;
	}
	public void display() {
		System.out.println(player);
	}
	public void finalize() {
		System.out.println("Finalize is called");
	}
}
