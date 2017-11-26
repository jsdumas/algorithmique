package algorithms.codingame.russianmountains;

import java.util.LinkedList;
import java.util.Queue;

public class GainCalcul {

	private static final long RIDE_PRICE_PERSON = 1L;

	private final RideGroupsCombination rideGroupCombination;
	private final Queue<GroupsByRide> currentQueue;
	private final long rideNumberByDay;

	private final RussianMountains russianMountains;

	public GainCalcul(RussianMountains russianMountains) {
		this.russianMountains = russianMountains;
		this.rideGroupCombination = new RideGroupsCombination(russianMountains);
		this.currentQueue = new LinkedList<GroupsByRide>();
		this.rideNumberByDay = russianMountains.getRideNumberByDay();
	}

	public long dailyGainOfRussianMountains() {
		
		if(russianMountains.isPlaceNumberGreaterThanPeople()){
			RussianMountainsQueue russianMountainsQueue = russianMountains.getRussianMountainsQueue();
			return (RIDE_PRICE_PERSON * russianMountainsQueue.getNumberOfPerson())*rideNumberByDay;
		} 
		
		long result = 0;
		currentQueue.addAll(rideGroupCombination.getAllGroupsByRide());
		Queue<GroupsByRide> nextFile = new LinkedList<GroupsByRide>();
		
		for (long i = 0; i < rideNumberByDay; i++) {
				if (currentQueue.isEmpty()) {
					currentQueue.addAll(nextFile);
					nextFile = new LinkedList<GroupsByRide>();
				}
				GroupsByRide currentGroupRide = currentQueue.poll();
				nextFile.add(currentGroupRide);
				result += RIDE_PRICE_PERSON * currentGroupRide.getPersonNumber();
			}
		return result;
	}

}
