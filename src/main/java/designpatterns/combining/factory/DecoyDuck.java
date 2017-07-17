package designpattern.combining.factory;

public class DecoyDuck implements Quackable {

	@Override
	public void quack() {
		System.out.println("<< Silence >>");
	}

	@Override
	public String toString() {
		return "Decoy Duck";
	}
}
