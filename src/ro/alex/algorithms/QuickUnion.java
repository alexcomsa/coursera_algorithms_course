package ro.alex.algorithms;

public class QuickUnion {

	private int[] id;

	public QuickUnion(int n) {
		id = new int[n];
		for (int index = 0; index < n; index++) {
			id[index] = index;
		}
	}

	public int root(int root) {
		System.out.println("Searching for the root of "+root+"...");
		while (root != id[root]) {
			root = id[root];
		}
		
		System.out.println("Root of "+root+" is: "+root);
		return root;
	}

	public boolean connected(int p, int q) {
		System.out.println("Are "+p+" and "+q+"connected");
		return id[p] == id[q];
	}

	public void union(int p, int q) {
		int i = root(p);
		int j = root(q);
		//set p to be a child of the root element of q
		System.out.println("Connecting "+p+" to "+q+" by setting the root of q("+j+") to be the root of p("+i+")");
		id[i] = id[j];
	}

	public static void main(String[] args) {
		
		QuickUnion qu = new QuickUnion(10);
		qu.union(4, 3);
		qu.union(3, 8);
		qu.union(6, 5);
		qu.union(9, 4);
		qu.union(2, 1);
		System.out.println(qu.connected(8, 9));
		System.out.println(qu.connected(5, 4));
		qu.union(5, 0);
		qu.union(7, 2);
		qu.union(6, 1);
		qu.union(7, 3);

	}

}
