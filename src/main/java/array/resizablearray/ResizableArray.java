package array.resizablearray;

import java.util.Arrays;

// Tableaux redimensionnables
public class ResizableArray {

	private int length; // la taille du tableau = le nombre d'éléments
						// significatifs dans data
	private int[] tableau; // invariant: 0 <= length <= data.length

	public ResizableArray(int len) {
		this.length = len;
		this.tableau = new int[len];
	}

	public int getSize() {
		return this.length;
	}

	public int getItemsValue(int i) {
		if (i < 0 || i >= this.length)
			throw new ArrayIndexOutOfBoundsException(i);
		return this.tableau[i];
	}

	public void setItemsValue(int i, int v) {
		if (i < 0 || i >= this.length)
			throw new ArrayIndexOutOfBoundsException(i);
		this.tableau[i] = v;
	}

	public void setSize(int len) {
		int tableauLength = this.tableau.length;
		if (len > tableauLength) {
			int[] a = new int[Math.max(len, 2 * tableauLength)];
			for (int i = 0; i < this.length; i++)
				a[i] = this.tableau[i];
			this.tableau = a;
			// note : on peut remplacer les quatre lignes ci-dessus par
			// this.data = Arrays.copyOfRange(this.data, 0, Math.max(len, 2 * n));
		} else if (4 * len < tableauLength)
			this.tableau = Arrays.copyOfRange(this.tableau, 0, tableauLength / 2);
		this.length = len;
	}

	public void append(int v) {
		int n = this.length;
		this.setSize(n + 1);
		this.tableau[n] = v;
	}

	public void append(int a[]) {
		int n = this.length;
		this.setSize(n + a.length);
		for (int v : a)
			this.tableau[n++] = v;
	}

	public int[] toArray() {
		return Arrays.copyOfRange(this.tableau, 0, this.length);
	}

	@Override
	public String toString() {
		StringBuffer b = new StringBuffer("(" + this.tableau.length + ")[");
		if (0 < this.length)
			b.append(this.tableau[0]);
		for (int i = 1; i < this.length; i++)
			b.append(", ").append(this.tableau[i]);
		return b.append("]").toString();
	}

}