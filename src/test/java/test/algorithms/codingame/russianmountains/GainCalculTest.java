package test.algorithms.codingame.russianmountains;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

public class GainCalculTest extends RussianMountainsInit {

	@Test
	public void whenOneRideIsFinishedWhithOneGroupOfOnePersonThenCalculOfGainIsOne() {
		MatcherAssert.assertThat(GAIN_CALCUL_FOR_ONE_RIDE_AND_ONE_GROUP_OF_ONE_PERSON.dailyGainOfRussianMountains(), Matchers.is(ONE));
	}

	@Test
	public void whenThreeRideAreFinishedWhithFourGroupsOfThreeAndOneAndOneAndTwoPersonThenCalculOfGainIsSeven() {
		MatcherAssert.assertThat(GAIN_CALCUL_FOR_THREE_RIDES_AND_SEVERAL_GROUPS_OF_SEVERAL_PERSONS.dailyGainOfRussianMountains(), Matchers
				.is(SEVEN));
	}

}
