package test.algorithms.codingame.russianmountains;

import algorithms.codingame.russianmountains.Gain;
import algorithms.codingame.russianmountains.GroupOfRiders;
import algorithms.codingame.russianmountains.GroupsSortedForRides;
import algorithms.codingame.russianmountains.RollerCoaster;
import algorithms.codingame.russianmountains.RollerCoasterQueue;

public abstract class RussianMountainsInit {

	private static final int MAX_PLACE_NUMBER_IS_ONE = 1;
	private static final int MAX_PLACE_NUMBER_IS_THREE = 3;
	private static final int MAX_PLACE_NUMBER_IS_FIVE = 5;
	private static final int MAX_PLACE_NUMBER_TEN_MILLION = 10000000;

	private static final int RIDE_NUMBER_BY_DAY_IS_ONE = 1;
	private static final int RIDE_NUMBER_BY_DAY_IS_THREE = 3;
	private static final int RIDE_NUMBER_BY_DAY_IS_NINE_MILLION = 9000000;

	protected static final int ONE_PERSON = 1;
	protected static final int TWO_PERSONS = 2;
	protected static final int THREE_PERSONS = 3;
	protected static final int FIVE_PERSONS = 5;

	private static final GroupOfRiders GROUP_OF_ONE_PERSON = new GroupOfRiders(ONE_PERSON);
	private static final GroupOfRiders GROUP_OF_TWO_PERSONS = new GroupOfRiders(TWO_PERSONS);
	private static final GroupOfRiders GROUP_OF_THREE_PERSONS = new GroupOfRiders(THREE_PERSONS);
	private static final GroupOfRiders GROUP_OF_FIVE_PERSONS = new GroupOfRiders(FIVE_PERSONS);

	private static final RollerCoasterQueue RUSSIAN_MOUNTAINS_QUEUE_OF_ONE_GROUP_OF_ONE_PERSON = new RussianMountainsQueueBuilder().with(
			GROUP_OF_ONE_PERSON).build();
	private static final RollerCoasterQueue RUSSIAN_MOUNTAINS_QUEUE_OF_FOUR_GROUPS_OF_THREE_ONE_ONE_TWO_PERSONS = new RussianMountainsQueueBuilder()
			.with(GROUP_OF_THREE_PERSONS).with(GROUP_OF_ONE_PERSON).with(GROUP_OF_ONE_PERSON).with(GROUP_OF_TWO_PERSONS).build();
	private static final RollerCoasterQueue RUSSIAN_MOUNTAINS_QUEUE_OF_FOUR_GROUPS_OF_TWO_THREE_FIVE_THREE_PERSONS = new RussianMountainsQueueBuilder()
			.with(GROUP_OF_TWO_PERSONS).with(GROUP_OF_THREE_PERSONS).with(GROUP_OF_FIVE_PERSONS).with(GROUP_OF_THREE_PERSONS).build();

	private static final RollerCoasterQueue RUSSIAN_MOUNTAINS_QUEUE_OF_ONE_THOUSAND_GROUPS_OF_MANY_PERSONS = new RussianMountainsQueueBuilder()
			.withManyPeople().build();

	private static final RollerCoaster RUSSIAN_MOUNTAINS_FOR_ONE_GROUP_OF_ONE_PERSON = new RollerCoaster(MAX_PLACE_NUMBER_IS_ONE,
			RIDE_NUMBER_BY_DAY_IS_ONE, RUSSIAN_MOUNTAINS_QUEUE_OF_ONE_GROUP_OF_ONE_PERSON);
	private static final RollerCoaster RUSSIAN_MOUNTAINS_FOR_FOUR_GROUPS_OF_THREE_ONE_ONE_TWO_PERSONS = new RollerCoaster(
			MAX_PLACE_NUMBER_IS_THREE, RIDE_NUMBER_BY_DAY_IS_THREE, RUSSIAN_MOUNTAINS_QUEUE_OF_FOUR_GROUPS_OF_THREE_ONE_ONE_TWO_PERSONS);
	private static final RollerCoaster RUSSIAN_MOUNTAINS_FOR_FOUR_GROUPS_OF_TWO_THREE_FIVE_THREE_PERSONS = new RollerCoaster(
			MAX_PLACE_NUMBER_IS_FIVE, RIDE_NUMBER_BY_DAY_IS_THREE, RUSSIAN_MOUNTAINS_QUEUE_OF_FOUR_GROUPS_OF_TWO_THREE_FIVE_THREE_PERSONS);

	private static final RollerCoaster RUSSIAN_MOUNTAINS_FOR_ONE_THOUSAND_GROUPS_OF_MANY_PERSONS = new RollerCoaster(
			MAX_PLACE_NUMBER_TEN_MILLION, RIDE_NUMBER_BY_DAY_IS_NINE_MILLION,
			RUSSIAN_MOUNTAINS_QUEUE_OF_ONE_THOUSAND_GROUPS_OF_MANY_PERSONS);

	protected static final long ONE = 1;
	protected static final long SEVEN = 7;
	protected static final long FIFTEEN = 15;
	protected static final long BIG_GAIN = 89744892565569L;

	protected static final long COMBINATION_NUMBER_IS_THREE = 3L;

	protected static final Gain GAIN_CALCUL_FOR_ONE_RIDE_AND_ONE_GROUP_OF_ONE_PERSON = new Gain(
			RUSSIAN_MOUNTAINS_FOR_ONE_GROUP_OF_ONE_PERSON);
	protected static final Gain GAIN_CALCUL_FOR_THREE_RIDES_AND_FOR_FOUR_GROUPS_OF_THREE_ONE_ONE_TWO_PERSONS = new Gain(
			RUSSIAN_MOUNTAINS_FOR_FOUR_GROUPS_OF_THREE_ONE_ONE_TWO_PERSONS);
	protected static final Gain GAIN_CALCUL_FOR_THREE_RIDES_AND_FOUR_GROUPS_OF_TWO_THREE_FIVE_THREE_PERSONS = new Gain(
			RUSSIAN_MOUNTAINS_FOR_FOUR_GROUPS_OF_TWO_THREE_FIVE_THREE_PERSONS);
	protected static final Gain GAIN_CALCUL_FOR_NINE_MILLION_RIDES_AND_ONE_THOUSAND_GROUP = new Gain(
			RUSSIAN_MOUNTAINS_FOR_ONE_THOUSAND_GROUPS_OF_MANY_PERSONS);

	protected static final GroupsSortedForRides RIDE_GROUP_COMBINATION = new GroupsSortedForRides(
			RUSSIAN_MOUNTAINS_FOR_FOUR_GROUPS_OF_THREE_ONE_ONE_TWO_PERSONS);

}
