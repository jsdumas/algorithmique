package test.algorithms.codingame.rollercoaster;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

/** @link GainCalcul **/
public class GainCalculTest extends RollerCoasterInit {

	@Test
	public void whenOneRideIsFinishedWhithOneGroupOfOnePersonThenCalculOfGainIsOne() {
		MatcherAssert.assertThat(GAIN_CALCUL_FOR_ONE_RIDE_AND_ONE_GROUP_OF_ONE_PERSON.dailyGainOfRussianMountains(), Matchers.is(ONE));
	}

	@Test
	public void whenThreeRideAreFinishedWhithFourGroupsOfThreeAndOneAndOneAndTwoPersonsThenCalculOfGainIsSeven() {
		MatcherAssert.assertThat(GAIN_CALCUL_FOR_THREE_RIDES_AND_FOR_FOUR_GROUPS_OF_THREE_ONE_ONE_TWO_PERSONS.dailyGainOfRussianMountains(),
				Matchers.is(SEVEN));
	}

	@Test
	public void whenThreeRideAreFinishedWhithFourGroupsOfTwoAndThreeAndFiveAndThreePersonsThenCalculOfGainIsFifteen() {
		MatcherAssert.assertThat(GAIN_CALCUL_FOR_THREE_RIDES_AND_FOUR_GROUPS_OF_TWO_THREE_FIVE_THREE_PERSONS.dailyGainOfRussianMountains(),
				Matchers.is(FIFTEEN));
	}

	@Test
	public void whenNineMillonRidesAreFinishedWhithOneThousandGroupsThenCalculOfGainIsEightyNineThousandSevenHundredFortyFourBillionEightHundredNinetyTwoMillionfiveHundredSixtyFiveThousandFiveHundredSixtyNine() {
		MatcherAssert.assertThat(GAIN_CALCUL_FOR_NINE_MILLION_RIDES_AND_ONE_THOUSAND_GROUP.dailyGainOfRussianMountains(), Matchers.is(
				BIG_GAIN));
	}

}
