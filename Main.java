
public class Main {

	public static void main(String[] args) {
		BST<Integer> bsti = new BST<Integer>(12);
		bsti.insert(3);
		bsti.insert(1);
		bsti.insert(6);
		bsti.insert(4);
		bsti.insert(13);
		
		int temp = 0;
		int trees = 1000;
		for (int i=0;i<trees;i++) {
			Randp randomtemp = new Randp(1000);
			BST<Integer> tempBST = new BST<Integer>(12);
			for (int j=0;j<1000;j++) {
				tempBST.insert(randomtemp.nextInt());
			}
			temp += tempBST.depth();
			tempBST = null;
			randomtemp = null;
		}
		System.out.println(temp/trees);
		//System.out.println(bsti2.heightTree(bsti2));
		
		// If printed in order, the below line should produce 7, 12, 19
		//System.out.println(bsti);
		//System.out.println(bsti.depth());
		//System.out.println(bsti2);
		//System.out.println(bsti2.depth());
	}

}

