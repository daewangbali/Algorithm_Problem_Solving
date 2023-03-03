package algorithm;

public class Permutation {
	static int[] nums = { 1, 2, 3 }; // 대상 집합
	static int r = 2; // 몇개를 뽑을지
	static boolean[] visited = new boolean[nums.length+1]; // 대상 숫자를 선택했는지 알려줄 집합
	static int[] out = new int[r]; // 뽑은 숫자를 담아둘 배열
	static StringBuilder sb = new StringBuilder();
	static void permutation(int count) { // count변수는 숫자 뽑은 횟수
		if(count == 2) { // 2개 뽑았으므로 결과 출력후 재귀함수 종료
			sb.append(out[0]).append(" ").append(out[1]).append("\n");
			return;
		}
		// 대상 집합을 순회하며 숫자를 하나 선택한다
		for(int i=0 ; i<nums.length ; i++) {
			// 이미 선택한 숫자가 아닌 경우(visited가 false)
			if(!visited[nums[i]]) {
				visited[nums[i]] = true; // 뽑은 숫자 표시
				out[count] = nums[i]; // 뽑은 숫자를 배열에 담아줌
				permutation(count+1); // 재귀함수 호출
				visited[nums[i]] = false; // 선택 해체
			}
		}
	}
	
	public static void main(String[] args) {
		permutation(0);
		System.out.println(sb.toString());
	}
	
}
