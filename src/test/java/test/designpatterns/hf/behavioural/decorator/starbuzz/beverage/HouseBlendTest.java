package test.designpatterns.hf.behavioural.decorator.starbuzz.beverage;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import designpatterns.hf.behavioural.decorator.starbuzz.beverage.Beverage;
import designpatterns.hf.behavioural.decorator.starbuzz.beverage.HouseBlend;
import designpatterns.hf.behavioural.decorator.starbuzz.pattern.Mocha;

public class HouseBlendTest {

	private static final Beverage HOUSE_BLEND = new HouseBlend();
	private static final double HOUSE_BLEND_STANDARD_PRICE = 0.89;
	private static final double HOUSE_BLEND_EXTRA_PRICE = 1.34;

	@Test
	public void shouldCostHeightyNineCents() {
		MatcherAssert.assertThat(HOUSE_BLEND.cost(), Matchers.equalTo(HOUSE_BLEND_STANDARD_PRICE));
	}

	@Test
	public void shouldCostMoreThanHeightyNineCents() {
		Beverage houseBlendExtra = new BeverageBuilder(HOUSE_BLEND).withSoy().build();
		MatcherAssert.assertThat(houseBlendExtra.cost(), Matchers.greaterThan(HOUSE_BLEND_STANDARD_PRICE));
	}

	@Test
	public void shouldCostOneDollardAndThirtyfourCents() {
		Beverage houseBlendExtra = new BeverageBuilder(HOUSE_BLEND).withSoy().withMocha().withWhip().build();
		MatcherAssert.assertThat(houseBlendExtra.cost(), Matchers.equalTo(HOUSE_BLEND_EXTRA_PRICE));
	}

	@Test
	public void shouldBeTypeOfHouseBlend() {
		Beverage houseBlendExtra = new BeverageBuilder(HOUSE_BLEND).withMocha().build();
		MatcherAssert.assertThat(houseBlendExtra instanceof Mocha, Matchers.is(true));
	}
}
