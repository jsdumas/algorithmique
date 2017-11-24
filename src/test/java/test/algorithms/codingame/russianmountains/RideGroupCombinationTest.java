package test.algorithms.codingame.russianmountains;

import java.util.Queue;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import algorithms.codingame.russianmountains.GroupOfPerson;
import algorithms.codingame.russianmountains.RideGroupCombination;
import algorithms.codingame.russianmountains.RussianMountains;

public class RideGroupCombinationTest {

	private static final int MAX_PLACE_NUMBER_IS_THREE = 3;
	private static final int GROUP_OF_ONE_PERSON = 1;
	private static final int GROUP_OF_TWO_PERSONS = 2;
	private static final int GROUP_OF_THREE_PERSONS = 3;
	private static final int RIDE_NUMBER_BY_DAY_IS_THREE = 3;
	private static final int THREE_PERSONS = 3;
	private static final Queue<GroupOfPerson> FOUR_GROUPS_OF_SEVERAL_PERSONS_QUEUE = new GroupQueueBuilder().with(GROUP_OF_THREE_PERSONS)
			.with(GROUP_OF_ONE_PERSON).with(GROUP_OF_ONE_PERSON).with(GROUP_OF_TWO_PERSONS).build();

	private static final RussianMountains RUSSIAN_MOUNTAINS_FOR_FOUR_GROUPS_OF_SEVERAL_PERSONS = new RussianMountainsBuilder(
			MAX_PLACE_NUMBER_IS_THREE, RIDE_NUMBER_BY_DAY_IS_THREE).with(FOUR_GROUPS_OF_SEVERAL_PERSONS_QUEUE).build();

	private static final RideGroupCombination RIDE_GROUP_COMBINATION = new RideGroupCombination(
			RUSSIAN_MOUNTAINS_FOR_FOUR_GROUPS_OF_SEVERAL_PERSONS);
	private static final long COMBINATION_NUMBER_IS_THREE = 3L;

	@Test
	public void whenPlaceNumberIsThreeAndFourGroupsWithThreeOneOneAndTwoPersonsThenItShouldReturnThreeCombination() {
		MatcherAssert.assertThat(RIDE_GROUP_COMBINATION.getCombinationNumber(), Matchers.is(COMBINATION_NUMBER_IS_THREE));
	}

	@Test
	public void whenTheFirstGroupGetRideThenThereAreThreePersons() {
		RIDE_GROUP_COMBINATION.getCombinationNumber();
		MatcherAssert.assertThat(RIDE_GROUP_COMBINATION.getAllGroupsByRide().peek().getPersonNumber(), Matchers.is(THREE_PERSONS));
	}

}
