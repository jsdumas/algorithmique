package algorithms.codingame.rollercoaster;

import java.util.HashMap;
import java.util.Stack;

public class SequenceOfRides {

	private final long rideCapacity;
	private final Stack<Ride> sequenceOfRides;
	private final HashMap<GroupOfRiders, Ride> rideMap;
	private long gainOfSequence;

	public SequenceOfRides(long maxPlaceNumber) {
		this.rideCapacity = maxPlaceNumber;
		this.sequenceOfRides = new Stack<Ride>();
		this.gainOfSequence=0;
		this.rideMap = new HashMap<GroupOfRiders, Ride>();
	}
	
	public boolean canNextGroupGetOnBoard(GroupOfRiders group){
		return sequenceOfRides.peek().getNumberOfRiders() + group.getNumberOfRiders() <= this.rideCapacity;
	}

	public void add(GroupOfRiders group) {
		if (sequenceOfRides.isEmpty() || !canNextGroupGetOnBoard(group)) {
			Ride ride = new Ride();
			ride.add(group);
			sequenceOfRides.add(ride);
			rideMap.put(group, ride);
		} else {
			sequenceOfRides.peek().add(group);
		}
		gainOfSequence+=group.getNumberOfRiders();
	}
	
	public boolean isSequenceFinished(GroupOfRiders group){
		return rideMap.containsKey(group) && !canNextGroupGetOnBoard(group);
	}


	public long dailyGain(long numberOfRidesByDay) {
		long gainOfTheDay =  gainOfSequence * (numberOfRidesByDay / sequenceOfRides.size());
		long rest = numberOfRidesByDay % sequenceOfRides.size();
		if(rest==0){
			return gainOfTheDay;
		}
		long count = 0;
		for(Ride ride : sequenceOfRides){
			if(count==rest){
				break;
			}
			gainOfTheDay+= ride.getNumberOfRiders();
			count++;
		}
		return gainOfTheDay;
	}

}
