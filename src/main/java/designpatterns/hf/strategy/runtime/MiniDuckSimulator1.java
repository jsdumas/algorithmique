package designpatterns.hf.strategy.runtime;

import designpatterns.hf.strategy.Duck;
import designpatterns.hf.strategy.MallardDuck;
import designpatterns.hf.strategy.ModelDuck;
import designpatterns.hf.strategy.behaviour.FlyRocketPowered;

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
