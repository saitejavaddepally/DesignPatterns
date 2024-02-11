package prototype;

public class Swordsman extends GameUnit {

	private String state = "idle";

	public void attack() {
		this.state = "attacking";
	}

	@Override
	public String toString() {
		return "Swordsman "+state+" @ "+getPosition();
	}

	@Override
	void reset() {
		this.state = "idle";
	}
}
