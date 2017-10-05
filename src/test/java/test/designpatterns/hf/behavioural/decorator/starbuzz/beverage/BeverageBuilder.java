package test.designpatterns.hf.behavioural.decorator.starbuzz.beverage;

import designpatterns.hf.behavioural.decorator.starbuzz.beverage.Beverage;
import designpatterns.hf.behavioural.decorator.starbuzz.pattern.Mocha;
import designpatterns.hf.behavioural.decorator.starbuzz.pattern.Soy;
import designpatterns.hf.behavioural.decorator.starbuzz.pattern.Whip;

public class BeverageBuilder {

	private Beverage houseBlend;

	public BeverageBuilder(Beverage houseBlend) {
		this.houseBlend = houseBlend;
	}

	public BeverageBuilder withSoy() {
		houseBlend = new Soy(houseBlend);
		return this;
	}

	public BeverageBuilder withMocha() {
		houseBlend = new Mocha(houseBlend);
		return this;
	}

	public BeverageBuilder withWhip() {
		houseBlend = new Whip(houseBlend);
		return this;
	}

	public Beverage build() {
		return houseBlend;
	}

}
