package Games;
public class Indoor {
	String player;
	public Indoor(String player) {
		this.player = player;
	}
	public void display() {
		System.out.println(player);
	}
	protected void finalize() {
		System.out.println("Finalize is called");
	}
}
