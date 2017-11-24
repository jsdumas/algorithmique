package test.algorithms.codingame.russianmountains;

import java.util.Queue;

import algorithms.codingame.russianmountains.GainCalcul;
import algorithms.codingame.russianmountains.GroupOfPerson;
import algorithms.codingame.russianmountains.RideGroupCombination;
import algorithms.codingame.russianmountains.RussianMountains;

public abstract class RussianMountainsInit {

	private static final int MAX_PLACE_NUMBER_IS_ONE = 1;
	private static final int MAX_PLACE_NUMBER_IS_THREE = 3;

	private static final int RIDE_NUMBER_BY_DAY_IS_ONE = 1;
	private static final int RIDE_NUMBER_BY_DAY_IS_THREE = 3;

	private static final int GROUP_OF_ONE_PERSON = 1;
	private static final int GROUP_OF_TWO_PERSONS = 2;
	private static final int GROUP_OF_THREE_PERSONS = 3;

	private static final Queue<GroupOfPerson> ONE_GROUP_OF_ONE_PERSON_QUEUE = new GroupQueueBuilder().with(GROUP_OF_ONE_PERSON).build();
	private static final Queue<GroupOfPerson> FOUR_GROUPS_OF_SEVERAL_PERSONS_QUEUE = new GroupQueueBuilder().with(GROUP_OF_THREE_PERSONS)
			.with(GROUP_OF_ONE_PERSON).with(GROUP_OF_ONE_PERSON).with(GROUP_OF_TWO_PERSONS).build();

	private static final RussianMountains RUSSIAN_MOUNTAINS_FOR_ONE_GROUP_OF_ONE_PERSON = new RussianMountainsBuilder(
			MAX_PLACE_NUMBER_IS_ONE, RIDE_NUMBER_BY_DAY_IS_ONE).with(ONE_GROUP_OF_ONE_PERSON_QUEUE).build();
	private static final RussianMountains RUSSIAN_MOUNTAINS_FOR_FOUR_GROUPS_OF_SEVERAL_PERSONS = new RussianMountainsBuilder(
			MAX_PLACE_NUMBER_IS_THREE, RIDE_NUMBER_BY_DAY_IS_THREE).with(FOUR_GROUPS_OF_SEVERAL_PERSONS_QUEUE).build();

	protected static final long ONE = 1;
	protected static final long SEVEN = 7;

	protected static final int THREE_PERSONS = 3;

	protected static final long COMBINATION_NUMBER_IS_THREE = 3L;

	protected static final GainCalcul GAIN_CALCUL_FOR_ONE_RIDE_AND_ONE_GROUP_OF_ONE_PERSON = new GainCalcul(
			RUSSIAN_MOUNTAINS_FOR_ONE_GROUP_OF_ONE_PERSON);
	protected static final GainCalcul GAIN_CALCUL_FOR_THREE_RIDES_AND_SEVERAL_GROUPS_OF_SEVERAL_PERSONS = new GainCalcul(
			RUSSIAN_MOUNTAINS_FOR_FOUR_GROUPS_OF_SEVERAL_PERSONS);

	protected static final RideGroupCombination RIDE_GROUP_COMBINATION = new RideGroupCombination(
			RUSSIAN_MOUNTAINS_FOR_FOUR_GROUPS_OF_SEVERAL_PERSONS);

}
