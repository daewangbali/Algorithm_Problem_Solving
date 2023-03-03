package algorithm;

public class Permutation {
	static int[] nums = { 1, 2, 3 }; // ��� ����
	static int r = 2; // ��� ������
	static boolean[] visited = new boolean[nums.length+1]; // ��� ���ڸ� �����ߴ��� �˷��� ����
	static int[] out = new int[r]; // ���� ���ڸ� ��Ƶ� �迭
	static StringBuilder sb = new StringBuilder();
	static void permutation(int count) { // count������ ���� ���� Ƚ��
		if(count == 2) { // 2�� �̾����Ƿ� ��� ����� ����Լ� ����
			sb.append(out[0]).append(" ").append(out[1]).append("\n");
			return;
		}
		// ��� ������ ��ȸ�ϸ� ���ڸ� �ϳ� �����Ѵ�
		for(int i=0 ; i<nums.length ; i++) {
			// �̹� ������ ���ڰ� �ƴ� ���(visited�� false)
			if(!visited[nums[i]]) {
				visited[nums[i]] = true; // ���� ���� ǥ��
				out[count] = nums[i]; // ���� ���ڸ� �迭�� �����
				permutation(count+1); // ����Լ� ȣ��
				visited[nums[i]] = false; // ���� ��ü
			}
		}
	}
	
	public static void main(String[] args) {
		permutation(0);
		System.out.println(sb.toString());
	}
	
}
