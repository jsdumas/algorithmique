package test.algorithms.codingame.russianmountains;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

public class RideGroupCombinationTest extends RussianMountainsInit {

	@Test
	public void whenPlaceNumberIsThreeAndFourGroupsWithThreeOneOneAndTwoPersonsThenItShouldReturnThreeCombination() {
		MatcherAssert.assertThat(RIDE_GROUP_COMBINATION.getCombinationNumber(), Matchers.is(COMBINATION_NUMBER_IS_THREE));
	}

	@Test
	public void whenTheFirstGroupGetRideThenThereAreThreePersons() {
		MatcherAssert.assertThat(RIDE_GROUP_COMBINATION.getAllGroupsByRide().peek().getPersonNumber(), Matchers.is(THREE_PERSONS));
	}

}
