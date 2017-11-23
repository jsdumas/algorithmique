package test.algorithms.codingame.russianmountains;

import java.util.Queue;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import algorithms.codingame.russianmountains.GainCalcul;
import algorithms.codingame.russianmountains.GroupOfPerson;
import algorithms.codingame.russianmountains.RussianMountains;

public class GainCalculTest {

	private static final long ONE = 1;
	private static final int PLACE_NUMBER = 1;
	private static final int RIDE_NUMBER_BY_DAY = 1;
	private static final int GROUP_OF_ONE_PERSON = 1;
	private static final Queue<GroupOfPerson> GROUP_QUEUE = new GroupQueueBuilder().with(GROUP_OF_ONE_PERSON).build();
	private static final RussianMountains RUSSIAN_MOUNTAINS = new RussianMountainsBuilder(PLACE_NUMBER, RIDE_NUMBER_BY_DAY).with(
			GROUP_QUEUE).build();
	private static final GainCalcul GAIN_CALCUL = new GainCalcul(RUSSIAN_MOUNTAINS);

	@Test
	public void whenOneRideIsFinishedWhithOneGroupOfOnePersonThenCalculOfGainIsOne() {
		MatcherAssert.assertThat(GAIN_CALCUL.dailyGainOfRussianMountains(), Matchers.is(ONE));
	}

}
