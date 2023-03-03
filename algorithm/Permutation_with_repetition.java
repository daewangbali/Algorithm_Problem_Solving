package algorithm;

public class Permutation_with_repetition {
	static int[] nums = { 1, 2, 3 }; 
	static int r = 2;
	static int[] out = new int[r];
	static StringBuilder sb = new StringBuilder();
	static void permutation(int count) {
		if(count == 2) {
			sb.append(out[0]).append(" ").append(out[1]).append("\n");
			return;
		}
		for(int i=0 ; i<nums.length ; i++) {
			out[count] = nums[i];
			permutation(count+1);
		}
	}
	
	public static void main(String[] args) {
		permutation(0);
		System.out.println(sb.toString());
	}
}