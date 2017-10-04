package test.algorithms.practice.stringofcharacters.parenthesesbalanced;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import algorithms.practice.stringofcharacters.parenthesesbalanced.Parenthese;

public class ParentheseTest {
	
	private static final Parenthese PARENTHESE = new Parenthese();
	private static final String BALANCED = "[()()(){}]";
	private static final String UNBALANCED = "[()((){}]";
	
	@Test
	public void shouldBeBalanced(){
		MatcherAssert.assertThat(PARENTHESE.isBalanced(BALANCED), Matchers.is(true));
	}
	
	@Test
	public void shouldBeUnbalanced(){
		MatcherAssert.assertThat(PARENTHESE.isBalanced(UNBALANCED), Matchers.is(false));
	}

}
