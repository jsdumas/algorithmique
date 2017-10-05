package test.designpatterns.hf.behavioural.decorator.starbuzz.beverage;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import designpatterns.hf.behavioural.decorator.starbuzz.beverage.Beverage;
import designpatterns.hf.behavioural.decorator.starbuzz.beverage.HouseBlend;

public class HouseBlendTest {

	private static final Beverage HOUSE_BLEND = new HouseBlend();

	@Test
	public void shouldCostHeightyNineCents() {
		MatcherAssert.assertThat(HOUSE_BLEND.cost(), Matchers.equalTo(0.89));
	}

	@Test
	public void shouldCostOneDollardAndThirtyfourCents() {
		Beverage houseBlendExtra = new HouseBlendBuilder(HOUSE_BLEND).withSoy().withMocha().withWhip().build();
		MatcherAssert.assertThat(houseBlendExtra.cost(), Matchers.equalTo(1.34));
	}
}
