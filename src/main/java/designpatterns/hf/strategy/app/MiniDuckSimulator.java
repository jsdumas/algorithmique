package designpatterns.hf.strategy.app;

import designpatterns.hf.strategy.behaviour.FlyRocketPowered;
import designpatterns.hf.strategy.duck.DecoyDuck;
import designpatterns.hf.strategy.duck.MallardDuck;
import designpatterns.hf.strategy.duck.ModelDuck;
import designpatterns.hf.strategy.duck.RubberDuck;

public class MiniDuckSimulator {

	public static void main(String[] args) {

		MallardDuck mallard = new MallardDuck();
		RubberDuck rubberDuckie = new RubberDuck();
		DecoyDuck decoy = new DecoyDuck();

		ModelDuck model = new ModelDuck();

		mallard.performQuack();
		rubberDuckie.performQuack();
		decoy.performQuack();

		model.performFly();
		// Inject a new FlyBehaviour
		model.setFlyBehavior(new FlyRocketPowered());
		// Now FlyBehaviour of ModelDuck is different
		model.performFly();
	}
}
