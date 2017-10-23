package algorithms.codingame.thegift;

import java.util.ArrayList;
import java.util.List;

public class TheGift {

	private int giftValue;
	private int[] budgets;
	private final int[][] budgetTable;
	private List<Integer> results;

	public TheGift(int contributors, int giftValue) {
		this.budgets = new int[contributors + 1];
		this.budgets[0] = 0;
		this.giftValue = giftValue;
		this.results=new ArrayList<Integer>();
		this.budgetTable=new int[contributors + 1][giftValue + 1];
	}

	public void initBudget(int idContributor, int budget) {
		budgets[idContributor] = budget;
	}

	public List<Integer> calculateParticipation() {
		for (int contributorId = 1; contributorId < budgets.length + 1 + 1; contributorId++) {
			for (int pay = 1; pay < giftValue + 1; pay++) {
				
				int notTakingBudget = budgetTable[contributorId - 1][pay]; // not taking item i
				int takingBudget = 0;
				
				if (budgets[contributorId] <= pay) {
					takingBudget =  budgetTable[contributorId - 1][pay - budgets[contributorId]];
				}
				
				budgetTable[contributorId][pay] = Math.min(notTakingBudget, takingBudget);
			}

		}
		return null;
	}

	public String shareBudget() {
		int totalBudget = 0;
		for (int idContributor = 1; idContributor < budgets.length; idContributor++) {
			totalBudget+=budgets[idContributor];
		}
		if(totalBudget<giftValue)	
			return "IMPOSSIBLE";
		else
			return "POSSIBLE";
	}

	// public int calculBestBenefit() {
	// // time complexity: O(N*W)
	// for (int itemId = 1; itemId < numOfItems + 1; itemId++) {
	// for (int weight = 1; weight < capacityOfKnapsack + 1; weight++) {
	//
	// int notTakingItem = knapsackTable[itemId - 1][weight]; // not taking item
	// i
	// int takingItem = 0;
	//
	// if (weights[itemId] <= weight) {
	// takingItem = values[itemId] + knapsackTable[itemId - 1][weight -
	// weights[itemId]];
	// }
	//
	// knapsackTable[itemId][weight] = Math.max(notTakingItem, takingItem);
	// }
	// }
	// totalBenefit = knapsackTable[numOfItems][capacityOfKnapsack];
	// return totalBenefit;
	// }

}
