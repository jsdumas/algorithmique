package test.algorithms.codingame.dwaresandgiants;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import algorithms.codingame.dwaresandgiants.DwaresStandingOnTheShouldersOfGiants;
import algorithms.codingame.dwaresandgiants.Person;

public class DwaresStandingOnTheShouldersOfGiantsTest {
	
	private static final Person PERSON = new InfluencerBuilder(4).withInheritance(1,2).withInheritance(1,3).withInheritance(3,4).build();
	private static final DwaresStandingOnTheShouldersOfGiants DWARES = new DwaresStandingOnTheShouldersOfGiants();
	
	@Test
	public void shouldReturnThree() {
		MatcherAssert.assertThat(DWARES.findTheLongestInfluenceInheritance(PERSON), Matchers.is(3));
	}
}
