package designpatterns.hf.behavioural.strategy.duck.app;

import designpatterns.hf.behavioural.strategy.duck.bird.DecoyDuck;
import designpatterns.hf.behavioural.strategy.duck.bird.Duck;
import designpatterns.hf.behavioural.strategy.duck.bird.MallardDuck;
import designpatterns.hf.behavioural.strategy.duck.bird.RubberDuck;

public class MethodImplementation {

	public static void main(String[] args) {

		// Ref --> Impl

		System.out.println("Mallard performence");
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();

		System.out.println("\n\nRubberDuck performence");
		Duck rubberDuckie = new RubberDuck();
		rubberDuckie.performQuack();
		rubberDuckie.performFly();

		System.out.println("\n\nDecoyDuck performence");
		Duck decoy = new DecoyDuck();
		decoy.performQuack();
		decoy.performFly();

	}
}
