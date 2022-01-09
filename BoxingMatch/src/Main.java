
public class Main {

	public static void main(String[] args) {

		Fighter jon = new Fighter("Jon", 10, 100, 90, 5);
		Fighter daniel = new Fighter("Daniel", 12, 100, 95, 3);
		Ring ring = new Ring(jon, daniel, 90, 100);
		ring.run();

	}

}
