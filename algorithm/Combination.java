package algorithm;

public class Combination {
	static StringBuilder sb = new StringBuilder();
	static int[] nums = { 1, 2, 3 }; 
	static int r = 2;
	static boolean[] visited = new boolean[nums.length+1];
	static void combination(int start, int count) {
		if(count == r) {
			for(int i=0;i<nums.length; i++) {
				if(visited[i])
					sb.append(nums[i]).append(" ");
			}
			sb.append("\n");
		}
		
		// 대상 집합을 순회하며 숫자를 하나 선택한다 이때 주어진 인덱스부터 순회한다.
		for(int i=start ; i<nums.length ; i++) {
			// 이미 선택한 숫자가 아닌 경우(visited가 false)
			if(!visited[i]) {
				visited[i] = true; // 뽑은 숫자 표시
				combination(i+1, count+1); // 재귀함수 호출
				visited[i] = false; // 선택 해체
			}
		}	
		
	}
	public static void main(String[] args) {
		combination(0,0);
		System.out.println(sb.toString());
	}
	
	
	
}
