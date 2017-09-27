package designpatterns.hf.strategy.app;

import designpatterns.hf.strategy.behaviour.FlyRocketPowered;
import designpatterns.hf.strategy.duck.Duck;
import designpatterns.hf.strategy.duck.MallardDuck;
import designpatterns.hf.strategy.duck.ModelDuck;

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
