package algorithm;
import java.io.*;

public class Implementation3_2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		String n = br.readLine();
		//����Ʈ�� �̵��� �� �ִ� 8���� ���� ����
		int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
		int[] dy= {-1, -2, -2, -1, 1, 2, 2, 1};
		
		int row = n.charAt(1)-'0';
		int column = n.charAt(0)-'a' + 1;
		
		int count = 0;
		//8���� ���⿡ ���Ͽ� �� ��ġ�� �̵��� �������� Ȯ��
		for(int i=0 ; i<8 ; i++) {
			//�̵��ϰ��� �ϴ� ��ġ Ȯ��
			int nr = row + dx[i];
			int nc = column + dy[i];
			//�ش� ��ġ�� �̵��� �����ϴٸ� ī��Ʈ ����
			if(nr > 0 && nc > 0 && nr <= 8 && nc <=8)
				count++;
		}
		System.out.println(count);
	}
}
