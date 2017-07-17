package designpatterns.hf.adapter.ducks.runtime;

import designpatterns.hf.adapter.ducks.Duck;
import designpatterns.hf.adapter.ducks.MallardDuck;
import designpatterns.hf.adapter.ducks.TurkeyAdapter;
import designpatterns.hf.adapter.ducks.WildTurkey;

public class DuckTestDrive {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();

		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);

		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();

		System.out.println("\nThe Duck says...");
		testDuck(duck);

		System.out.println("\nThe TurkeyAdapter says...");
		testDuck(turkeyAdapter);
	}

	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
