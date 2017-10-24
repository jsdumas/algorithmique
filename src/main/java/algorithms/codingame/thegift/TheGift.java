package algorithms.codingame.thegift;

import java.util.Arrays;

public class TheGift {

	private int giftValue;
	private int[] budgets;
	private int contributors;

	public TheGift(int contributors, int giftValue) {
		this.contributors = contributors;
		this.budgets = new int[contributors];
		this.budgets[0] = 0;
		this.giftValue = giftValue;
	}

	public void initBudget(int idContributor, int budget) {
		budgets[idContributor] = budget;
	}

	private String calculateParticipation() {
		String result="";
		Arrays.sort(budgets);
		for (int contributorId = 0; contributorId < contributors; contributorId++) {
			int sharing = giftValue /(contributors-contributorId);
			Integer pay = Math.min(budgets[contributorId], sharing);
			result+=pay.toString();
			if(contributorId!=contributors-1) {
				result+="\n";
			}
			giftValue-=pay;
		}
		return result;
	}

	public String shareBudget() {
		int totalBudget = 0;
		for (int idContributor = 0; idContributor < contributors ; idContributor++) {
			totalBudget+=budgets[idContributor];
		}
		if(totalBudget<giftValue)	
			return "IMPOSSIBLE";
		else
			return calculateParticipation();
	}

}
