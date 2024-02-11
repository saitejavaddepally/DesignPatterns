package prototype;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {

		Swordsman swordsman = new Swordsman();
		swordsman.move(new Point3D(-1, 3,5) , 34);

		System.out.println("After moving --> " + swordsman.toString());
		swordsman.clone();

		System.out.println("After cloning --> " + swordsman.toString());
	}

}
