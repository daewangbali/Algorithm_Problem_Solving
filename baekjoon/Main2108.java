package baekjoon;
import java.io.*;

public class Main2108 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
		//�Է°� ���� : -4000 ~ 4000 (�̰� �迭�� ǥ���ϱ� ���� �迭 ũ�� 8001)
		int[] arr = new int[8001];
		int min = Integer.MAX_VALUE;//�ּڰ�
		int max = Integer.MIN_VALUE;//�ִ밪
		int sum = 0;//��� ���ϱ� ���� ����
		int median = 10000;
		int mode = 10000;
		
		for(int i=0;i<T;i++) {
			int value = Integer.parseInt(br.readLine());
			if(min > value) {
				min = value;
			}
			if(max < value) {
				max = value;
			}
			arr[value+4000]++; //counting sort ����
			sum += value;
			
		}
		int count = 0; // �߾Ӱ� �� ���� ��
		int mode_max = 0; // �ֺ��� �ִ�
		
		//������ ������ �ֺ��� 1���� �������� ��� true, �ƴҰ�� false
		boolean flag = false;
		
		for(int i=min+4000; i<=max + 4000;i++) {
			
			if(arr[i] > 0) {
				/*
				 * <�߾Ӱ� ã��>
				 * ����Ƚ���� ��ü ������ ���ݿ� �� ��ģ�ٸ�
				 */
				if(count < (T + 1) / 2) {
					count += arr[i]; // i���� �󵵼��� count�� ����
					median = i - 4000;
				}
				/*
				 * <�ֺ� ã��>
				 * ���� �ֺ󰪺��� ���� ���� �󵵼��� �� ���� ���
				 */
				if(mode_max < arr[i]) {
					mode_max = arr[i];
					mode = i - 4000;
					flag = true; //ù �����̹Ƿ� true�� ����
				}
				// ���� �ֺ� �ִ񰪰� ������ ���鼭 �� ���� �ߺ��Ǵ� ���
				else if(mode_max == arr[i] && flag == true){
					mode = i - 4000;
					flag= false;
				}
			}
		}
		sb.append((int)Math.round((double)sum / T)).append("\n");
		sb.append(median).append("\n");
		sb.append(mode).append("\n");
		sb.append(max - min);
		System.out.println(sb.toString());
	}
}

/*
 *int T = Integer.parseInt(br.readLine());
		if(T == 1) {
			int n = Integer.parseInt(br.readLine());
			sb.append(n).append("\n");//���
			sb.append(n).append("\n");//���
			sb.append(n).append("\n");//���
			sb.append(0).append("\n");//���
		}else {
			int[] arr = new int[T];
			int[] freqArr = new int[8001];
			ArrayList<Integer> list = new ArrayList<Integer>();
			double sum = 0;
			for(int i=0;i<T;i++) {
				int n = Integer.parseInt(br.readLine());
				list.add(n);
				freqArr[n+4000]++;
				sum += list.get(i);
			}
			Collections.sort(list);
			sb.append(Math.round(sum/T)).append("\n");//���
			sb.append(list.get((T/2))).append("\n");//�߾Ӱ�
			int max = 0;
			int maxIndex = 0;
			for(int i=0;i<freqArr.length;i++) {
				if(freqArr[i] > 0 && freqArr[i] > max ) {
					max = freqArr[i];
					maxIndex = i;
				}
			}
			sb.append(maxIndex-4000).append("\n");//�ֺ�
			sb.append(Math.abs(list.get(0)) + list.get(list.size()-1)).append("\n");//������
			
		}
		System.out.println(sb.toString());	 
 */
