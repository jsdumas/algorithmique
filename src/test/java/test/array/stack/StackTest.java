package test.array.stack;

import org.hamcrest.Matcher;
import org.hamcrest.core.IsEqual;
import org.junit.Test;

import array.stack.Stack;

public class StackTest {
	

	@Test
	public void test() {
		Stack stack = new Stack();
		assertThat(stack.isEmpty(), is(true));
		stack.push(1);
//		assert (!stack.isEmpty());
		assertThat(stack.isEmpty(), is(false));
		stack.push(2);
		assertThat(stack.top(), is(2);
//		assert (stack.top() == 2);
		stack.push(3);
		assert (stack.top() == 3);
		assert (stack.pop() == 3);
		assert (stack.top() == 2);
		assert (stack.pop() == 2);
		assert (stack.top() == 1);
		assert (stack.pop() == 1);
		assert (stack.isEmpty());

		stack.push(1);
		try {
			stack.swap();
			assert false;
		} catch (IllegalArgumentException e) {
		}
		;
		stack.push(2);
		stack.swap();
		assert (stack.top() == 1);
		stack.pop();
		assert (stack.top() == 2);

		stack.clear();
		assert stack.size() == 0;

		stack.push(1);
		try {
			swap(stack);
			assert false;
		} catch (IllegalArgumentException e) {
		}
		;
		stack.push(2);
		swap(stack);
		assert (stack.top() == 1);
		stack.pop();
		assert (stack.top() == 2);

		System.out.println("TestStack OK");
	}
	
	private void assertThat(boolean empty, Matcher<Boolean> matcher) {
		// TODO Auto-generated method stub
		
	}

	private void swap(Stack s) {
		if (s.size() <= 1)
			throw new IllegalArgumentException();
		int x = s.pop();
		int y = s.pop();
		s.push(x);
		s.push(y);
	}

}
