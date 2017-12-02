package test.algorithms.codingame.rollercoaster;

import algorithms.codingame.rollercoaster.Gain;
import algorithms.codingame.rollercoaster.GroupOfRiders;
import algorithms.codingame.rollercoaster.SequenceOfRides;
import algorithms.codingame.rollercoaster.RollerCoaster;
import algorithms.codingame.rollercoaster.RollerCoasterQueue;

public abstract class RollerCoasterInit {

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

	private static final int ID_ONE = 0;
	private static final int ID_TWO = 1;
	private static final int ID_THREE = 2;
	private static final int ID_FOR = 3;

	private static final RollerCoasterQueue RUSSIAN_MOUNTAINS_QUEUE_OF_ONE_GROUP_OF_ONE_PERSON = new RollerCoasterQueueBuilder()//
			.with(new GroupOfRiders(ID_ONE, ONE_PERSON))//
			.build();
	private static final RollerCoasterQueue RUSSIAN_MOUNTAINS_QUEUE_OF_FOUR_GROUPS_OF_THREE_ONE_ONE_TWO_PERSONS = new RollerCoasterQueueBuilder()
			.with(new GroupOfRiders(ID_ONE, THREE_PERSONS))//
			.with(new GroupOfRiders(ID_TWO, ONE_PERSON))//
			.with(new GroupOfRiders(ID_THREE, ONE_PERSON))//
			.with(new GroupOfRiders(ID_FOR, TWO_PERSONS))//
			.build();
	private static final RollerCoasterQueue RUSSIAN_MOUNTAINS_QUEUE_OF_FOUR_GROUPS_OF_TWO_THREE_FIVE_THREE_PERSONS = new RollerCoasterQueueBuilder()
			.with(new GroupOfRiders(ID_ONE, TWO_PERSONS))//
			.with(new GroupOfRiders(ID_TWO, THREE_PERSONS))//
			.with(new GroupOfRiders(ID_THREE, FIVE_PERSONS))//
			.with(new GroupOfRiders(ID_FOR, THREE_PERSONS))//
			.build();

	private static final RollerCoasterQueue RUSSIAN_MOUNTAINS_QUEUE_OF_ONE_THOUSAND_GROUPS_OF_MANY_PERSONS = new RollerCoasterQueueBuilder()
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


}
