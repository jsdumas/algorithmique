package test.algorithms.codingame.thegift;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import algorithms.codingame.thegift.TheGift;

public class TheGiftTest {
	
	private int budget_1;
	private int budget_2;
	private int budget_3;
	private static final int GIFT_VALUE = 100;
	private static final TheGift THE_GIFT = new TheGift(GIFT_VALUE);
	
	private void initBudget(int budget_1, int budget_2, int budget_3) {
		this.budget_1=budget_1;
		this.budget_2=budget_2;
		this.budget_3=budget_3;
	}

	@Test
	public void shouldReturnThreeFourtyTwoAndFourtyFive() {
		initBudget(3,42,100);
		MatcherAssert.assertThat(THE_GIFT.calculateParticipation(), Matchers.contains(3,42,45));
	}
}
