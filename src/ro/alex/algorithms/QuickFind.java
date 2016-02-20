package ro.alex.algorithms;

public class QuickFind {

	private int[] id;

	public QuickFind(int n) {
		id = new int[n];
		for (int index = 0; index < n; index++) {
			id[index] = index;
		}
	}

	public void union(int p, int q) {
		int idp = id[p];
		int idq = id[q];
		System.out.println("Connecting " + p + " with " + q);
		for (int index = 0; index < id.length; index++) {
			if (id[index] == idp) {
				id[index] = idq;
			}
		}
	}

	public boolean connected(int p, int q) {
		System.out.print("Is " + p + "connected to " + q);
		return id[p] == id[q];
	}

	public void printArray() {
		for (int index = 0; index < id.length; index++) {
			System.out.print(id[index] + " ");
		}
	}

	public static void main(String[] args) {

		QuickFind qf = new QuickFind(10);
		qf.union(3, 4);
		qf.union(3, 8);
		qf.union(6, 5);
		qf.union(9, 4);
		qf.union(2, 1);
		System.out.println(qf.connected(8, 9));
		System.out.println(qf.connected(5, 0));
		qf.union(5, 0);
		qf.union(7, 2);
		qf.union(6, 1);
		qf.printArray();
	}
}
