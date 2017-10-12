package test.algorithms.hb.part1.ternarysearchtree.codingame;

import algorithms.hb.part1.ternarysearchtree.codingame.PhoneNumberTST;

public class PhoneNumberTSTBuilder {
	
	private final PhoneNumberTST PHONE_NUMBER_TST = new PhoneNumberTST();

	public PhoneNumberTSTBuilder with(String phoneNumber) {
		PHONE_NUMBER_TST.put(phoneNumber);
		return this;
	}

	public PhoneNumberTST build() {
		return PHONE_NUMBER_TST;
	}

}
