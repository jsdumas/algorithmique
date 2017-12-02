package test.algorithms.codingame.rollercoaster;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

/** @link Gain **/
public class RollerCoasterTest extends RollerCoasterInit {

	@Test
	public void whenOneRideIsFinishedWhithOneGroupOfOnePersonThenCalculOfGainIsOne() {
		MatcherAssert.assertThat(ROLLER_COASTER_FOR_ONE_GROUP_OF_ONE_PERSON.dailyGain(), Matchers.is(ONE));
	}

	@Test
	public void whenThreeRideAreFinishedWhithFourGroupsOfThreeAndOneAndOneAndTwoPersonsThenCalculOfGainIsSeven() {
		MatcherAssert.assertThat(ROLLER_COASTER_FOR_FOUR_GROUPS_OF_THREE_ONE_ONE_TWO_PERSONS.dailyGain(),
				Matchers.is(SEVEN));
	}

	@Test
	public void whenThreeRideAreFinishedWhithFourGroupsOfTwoAndThreeAndFiveAndThreePersonsThenCalculOfGainIsFifteen() {
		MatcherAssert.assertThat(ROLLER_COASTER_FOR_FOUR_GROUPS_OF_TWO_THREE_FIVE_THREE_PERSONS.dailyGain(),
				Matchers.is(FIFTEEN));
	}

	@Test
	public void whenNineMillonRidesAreFinishedWhithOneThousandGroupsThenCalculOfGainIsEightyNineThousandSevenHundredFortyFourBillionEightHundredNinetyTwoMillionfiveHundredSixtyFiveThousandFiveHundredSixtyNine() {
		MatcherAssert.assertThat(ROLLER_COASTER_FOR_ONE_THOUSAND_GROUPS_OF_MANY_PERSONS.dailyGain(), Matchers.is(
				BIG_GAIN));
	}

}
