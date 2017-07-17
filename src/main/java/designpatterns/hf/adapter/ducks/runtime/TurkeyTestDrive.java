package designpatterns.hf.adapter.ducks.runtime;

import designpatterns.hf.adapter.ducks.DuckAdapter;
import designpatterns.hf.adapter.ducks.MallardDuck;
import designpatterns.hf.adapter.ducks.Turkey;

public class TurkeyTestDrive {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		Turkey duckAdapter = new DuckAdapter(duck);

		for (int i = 0; i < 10; i++) {
			System.out.println("The DuckAdapter says...");
			duckAdapter.gobble();
			duckAdapter.fly();
		}
	}
}
