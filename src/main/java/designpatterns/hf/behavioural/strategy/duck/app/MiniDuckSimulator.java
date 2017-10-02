package designpatterns.hf.behavioural.strategy.duck.app;

import designpatterns.hf.behavioural.strategy.duck.behaviour.FlyRocketPowered;
import designpatterns.hf.behavioural.strategy.duck.bird.DecoyDuck;
import designpatterns.hf.behavioural.strategy.duck.bird.MallardDuck;
import designpatterns.hf.behavioural.strategy.duck.bird.ModelDuck;
import designpatterns.hf.behavioural.strategy.duck.bird.RubberDuck;

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
