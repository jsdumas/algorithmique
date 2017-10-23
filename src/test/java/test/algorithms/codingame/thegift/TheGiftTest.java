package test.algorithms.codingame.thegift;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import algorithms.codingame.thegift.TheGift;

public class TheGiftTest {
	
	private static final String IMPOSSIBLE = "IMPOSSIBLE";
	private static final int CONTRIBUTORS = 3;
	private static final int GIFT_VALUE = 100;
	private static final TheGift THE_GIFT = new TheGift(CONTRIBUTORS, GIFT_VALUE);
	
	private void initBudget(int budget_1, int budget_2, int budget_3) {
		this.THE_GIFT.initBudget(1, budget_1);
		this.THE_GIFT.initBudget(2, budget_2);
		this.THE_GIFT.initBudget(3, budget_3);
	}
	
	@Test
	public void shouldReturnImpossible() {
		initBudget(3,42,30);
		MatcherAssert.assertThat(THE_GIFT.shareBudget(), Matchers.equalTo(IMPOSSIBLE));
	}

	@Test
	public void shouldReturnThreeFourtyTwoAndFourtyFive() {
		initBudget(3,42,100);
		MatcherAssert.assertThat(THE_GIFT.calculateParticipation(), Matchers.contains(3,42,45));
	}
}
