package test.memo;

import static org.hamcrest.MatcherAssert.assertThat;
import memo.Fib;

import org.junit.Test;

public class FibTest {

	private static final Fib FIB = new Fib();

	@Test
	public void test() {
		assertThat(FIB.fibDP(10), equals(55));
		// assert fibDP(10) == 55;
		assert fibDP2(10) == 55;
		long start = System.currentTimeMillis();
		System.out.println(fibMemo(80));
		System.out.println((System.currentTimeMillis() - start) + " ms");
		// 42 2s
		// 43 3s
		// 44 5s
		// 45 8s
		// 46 13s
		// 50 = F11s = 89s
	}

}
