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
		
		// ��� ������ ��ȸ�ϸ� ���ڸ� �ϳ� �����Ѵ� �̶� �־��� �ε������� ��ȸ�Ѵ�.
		for(int i=start ; i<nums.length ; i++) {
			// �̹� ������ ���ڰ� �ƴ� ���(visited�� false)
			if(!visited[i]) {
				visited[i] = true; // ���� ���� ǥ��
				combination(i+1, count+1); // ����Լ� ȣ��
				visited[i] = false; // ���� ��ü
			}
		}	
		
	}
	public static void main(String[] args) {
		combination(0,0);
		System.out.println(sb.toString());
	}
	
	
	
}
