package algorithms.codingame.rollercoaster;

/** @link GainTest **/
public class Gain {

	private final RollerCoaster rollerCoaster;

	public Gain(RollerCoaster rollerCoaster) {
		this.rollerCoaster = rollerCoaster;
	}

	public long dailyGainOfRussianMountains() {
		if (rollerCoaster.isPlaceNumberGreaterThanRiders()) {
			return rollerCoaster.gainWhenPlaceAreGreaterThanRiders();
		}
		return	rollerCoaster.gainWhenRidersPlaceAreGreaterThanRPlace();
	}

}
