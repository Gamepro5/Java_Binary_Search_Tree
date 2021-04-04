public class BST<T extends Comparable<T>> {
	private T datum;
	private BST<T> left; 
	private BST<T> right;  

	public BST(T datum) {
		this.datum = datum;
		left = null;
		right = null;
	}

	public T getDatum() {
		return datum;  // returns the datum of a node
	}
	public BST<T> getLeft() {
		return left;   // returns the left subtree
	}
	public BST<T> getRight() {
		return right;  // returns the right subtree
	}
	
	public void setLeft(BST<T> tree) {
		left = tree;
	}

	public void setRight(BST<T> tree) {
		right = tree;
	}
	
	public void insert(T datum) {
		if (this.datum.compareTo(datum) > 0) {
			if (this.getLeft() != null) {
				left.insert(datum);
			} else {
				left = new BST<T>(datum);
			}
		} else if (this.datum.compareTo(datum) == 0) {
			System.out.println("Already In the Tree!");
		} else if (this.datum.compareTo(datum) < 0) {
			if (this.getRight() != null) {
				right.insert(datum);
			} else {
				right = new BST<T>(datum);
			}
		}
	}
	
	public int depth() {
		if (this.getDatum() == null) {
			return 0;
		} else {
			return (1 + (Math.max(
					
					(this.getLeft() == null)?(0):(this.getLeft().depth()), (this.getRight() == null)?(0):(this.getRight().depth())
					
					)));
		}
	}
	
	public String toString() {
		String s = "" + datum + ", ";
		if (left != null)
			s = s + left.toString();
		if (right != null)
			s = s + right.toString();
		return s;
	}
}
