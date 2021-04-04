public class Randp {
    private int[] nums;
    private int numsLeft;
	
    public Randp(int n) {
    	nums = new int[n];
        initNums(n);
        numsLeft = n;
    }
	
    private void initNums(int n) {
        for (int i=0;i<nums.length;i++) {
        	nums[i] = i+1;
        	//System.out.print(possibleOptions[i]);
        }
        
        //numsLeft = nums.length + 1;
        //System.out.println();
    }
	
    public int nextInt() {
    	if (numsLeft == 0) {
    		return 0;
    	}
    	int random = (int) (Math.random() * (numsLeft - 0)) + 0;
    	//System.out.println(random);
    	int returnValue = nums[random];
    	//System.out.println(returnValue);
    	nums[random] = nums[numsLeft-1];
    	nums[numsLeft-1] = returnValue;
    	numsLeft--;
    	return returnValue;
        // Math.random() should never be called more than once
        // when this method is called.  Recursion is not allowed.
        
    }
}