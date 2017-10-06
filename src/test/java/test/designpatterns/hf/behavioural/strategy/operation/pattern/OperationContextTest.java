package test.designpatterns.hf.behavioural.strategy.operation.pattern;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import designpatterns.hf.behavioural.strategy.operation.pattern.OperationAdd;
import designpatterns.hf.behavioural.strategy.operation.pattern.OperationContext;
import designpatterns.hf.behavioural.strategy.operation.pattern.OperationMultiply;
import designpatterns.hf.behavioural.strategy.operation.pattern.OperationSubstract;

public class OperationContextTest {

	private static final int TEN = 10;
	private static final int FIVE = 5;
	private static final int FIFTEEN = 15;
	private static final int FIFTY = 50;

	@Test
	public void addTenTofiveShouldReturnFifteen() {
		OperationContext operationContext = new OperationContext(new OperationAdd());
		MatcherAssert.assertThat(operationContext.executeStrategy(FIVE, TEN), Matchers.equalTo(FIFTEEN));
	}

	@Test
	public void subtractfiveToTenShouldReturnFive() {
		OperationContext operationContext = new OperationContext(new OperationSubstract());
		MatcherAssert.assertThat(operationContext.executeStrategy(TEN, FIVE), Matchers.equalTo(FIVE));
	}

	@Test
	public void multiplyTenTofiveShouldReturnFifty() {
		OperationContext operationContext = new OperationContext(new OperationMultiply());
		MatcherAssert.assertThat(operationContext.executeStrategy(FIVE, TEN), Matchers.equalTo(FIFTY));
	}

}
