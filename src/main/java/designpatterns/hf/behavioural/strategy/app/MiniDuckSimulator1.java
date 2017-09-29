package designpatterns.hf.behavioural.strategy.app;

import designpatterns.hf.behavioural.strategy.behaviour.FlyRocketPowered;
import designpatterns.hf.behavioural.strategy.duck.Duck;
import designpatterns.hf.behavioural.strategy.duck.MallardDuck;
import designpatterns.hf.behavioural.strategy.duck.ModelDuck;

public class MiniDuckSimulator1 {
 
	public static void main(String[] args) {
 
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
   
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();

	}
}
