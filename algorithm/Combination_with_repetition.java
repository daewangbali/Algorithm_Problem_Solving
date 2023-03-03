package algorithm;

public class Combination_with_repetition {
	static StringBuilder sb = new StringBuilder();
	static int[] nums = { 1, 2, 3 }; 
	static int r = 2;
	static int[] out = new int[2];
	static void combination(int start, int count) {
		if(count == r) {
			sb.append(out[0]).append(" ").append(out[1]).append("\n");
			return;
		}
		
		// 대상 집합을 순회하며 숫자를 하나 선택한다 이때 주어진 인덱스부터 순회한다.
		for(int i=start ; i<nums.length ; i++) {
			// 이미 선택한 숫자가 아닌 경우(visited가 false)
			out[count] = nums[i];
			combination(i, count+1); // 재귀함수 호출
		}	
	}

	public static void main(String[] args) {
		combination(0,0);
		System.out.println(sb.toString());
	}
}