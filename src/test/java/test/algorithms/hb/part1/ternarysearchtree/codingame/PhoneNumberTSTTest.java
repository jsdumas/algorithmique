package test.algorithms.hb.part1.ternarysearchtree.codingame;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import algorithms.hb.part1.ternarysearchtree.codingame.PhoneNumberTST;

public class PhoneNumberTSTTest {
	
	
//	@Test
//	public void shouldReturnThreeNode(){
//		PhoneNumberTST phoneNumberTST = new PhoneNumberTSTBuilder().with("123").build(); 
//		MatcherAssert.assertThat(phoneNumberTST.getNodeNumber(), Matchers.equalTo(3));
//	}
	
	@Test
	public void shouldReturnFourNode(){
		PhoneNumberTST phoneNumberTST = new PhoneNumberTSTBuilder().with("123").with("1234").build(); 
//		System.out.println(phoneNumberTST.toString());
		MatcherAssert.assertThat(phoneNumberTST.getNodeNumber(), Matchers.equalTo(4));
	}

}
