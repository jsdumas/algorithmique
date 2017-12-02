package algorithms.codingame.rollercoaster;

/** @link GainTest **/
public class Gain {

	private final RollerCoaster rollerCoaster;

	public Gain(RollerCoaster rollerCoaster) {
		this.rollerCoaster = rollerCoaster;
	}

	public long dailyGainOfRollerCoaster() {
		long gain = 0;
		for (long i = 0; i < rollerCoaster.getRideNumberByDay(); i++) {
			Ride ride = new Ride(rollerCoaster);
			gain += ride.boardingRiders();
		}
		return gain;
	}

}
