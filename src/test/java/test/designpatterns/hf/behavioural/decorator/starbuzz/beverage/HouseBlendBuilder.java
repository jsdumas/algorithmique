package test.designpatterns.hf.behavioural.decorator.starbuzz.beverage;

import designpatterns.hf.behavioural.decorator.starbuzz.beverage.Beverage;
import designpatterns.hf.behavioural.decorator.starbuzz.pattern.Mocha;
import designpatterns.hf.behavioural.decorator.starbuzz.pattern.Soy;
import designpatterns.hf.behavioural.decorator.starbuzz.pattern.Whip;

public class HouseBlendBuilder {

	private Beverage houseBlend;

	public HouseBlendBuilder(Beverage houseBlend) {
		this.houseBlend = houseBlend;
	}

	public HouseBlendBuilder withSoy() {
		houseBlend = new Soy(houseBlend);
		return this;
	}

	public HouseBlendBuilder withMocha() {
		houseBlend = new Mocha(houseBlend);
		return this;
	}

	public HouseBlendBuilder withWhip() {
		houseBlend = new Whip(houseBlend);
		return this;
	}

	public Beverage build() {
		return houseBlend;
	}

}
