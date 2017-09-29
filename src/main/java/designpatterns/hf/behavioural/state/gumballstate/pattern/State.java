package designpatterns.hf.behavioural.state.gumballstate.pattern;

public interface State {
 
	public void insertQuarter();
	public void ejectQuarter();
	public void turnCrank();
	public void dispense();
}
