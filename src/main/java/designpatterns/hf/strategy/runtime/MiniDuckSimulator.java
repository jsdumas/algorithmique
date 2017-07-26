package designpatterns.hf.strategy.runtime;

import designpatterns.hf.strategy.DecoyDuck;
import designpatterns.hf.strategy.MallardDuck;
import designpatterns.hf.strategy.ModelDuck;
import designpatterns.hf.strategy.RubberDuck;
import designpatterns.hf.strategy.behaviour.FlyRocketPowered;

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
