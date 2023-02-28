package baekjoon;
import java.io.*;

public class Main2108 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
		//입력값 범위 : -4000 ~ 4000 (이걸 배열에 표현하기 위해 배열 크기 8001)
		int[] arr = new int[8001];
		int min = Integer.MAX_VALUE;//최솟값
		int max = Integer.MIN_VALUE;//최대값
		int sum = 0;//평균 구하기 위한 변수
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
			arr[value+4000]++; //counting sort 위해
			sum += value;
			
		}
		int count = 0; // 중앙값 빈도 누적 수
		int mode_max = 0; // 최빈값의 최댓값
		
		//이전의 동일한 최빈값이 1번만 등장했을 경우 true, 아닐경우 false
		boolean flag = false;
		
		for(int i=min+4000; i<=max + 4000;i++) {
			
			if(arr[i] > 0) {
				/*
				 * <중앙값 찾기>
				 * 누적횟수가 전체 길이의 절반에 못 미친다면
				 */
				if(count < (T + 1) / 2) {
					count += arr[i]; // i값의 빈도수를 count에 누적
					median = i - 4000;
				}
				/*
				 * <최빈값 찾기>
				 * 이전 최빈값보다 현재 값의 빈도수가 더 높을 경우
				 */
				if(mode_max < arr[i]) {
					mode_max = arr[i];
					mode = i - 4000;
					flag = true; //첫 등장이므로 true로 변경
				}
				// 이전 최빈값 최댓값과 동일한 경우면서 한 번만 중복되는 경우
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
			sb.append(n).append("\n");//평균
			sb.append(n).append("\n");//평균
			sb.append(n).append("\n");//평균
			sb.append(0).append("\n");//평균
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
			sb.append(Math.round(sum/T)).append("\n");//평균
			sb.append(list.get((T/2))).append("\n");//중앙값
			int max = 0;
			int maxIndex = 0;
			for(int i=0;i<freqArr.length;i++) {
				if(freqArr[i] > 0 && freqArr[i] > max ) {
					max = freqArr[i];
					maxIndex = i;
				}
			}
			sb.append(maxIndex-4000).append("\n");//최빈값
			sb.append(Math.abs(list.get(0)) + list.get(list.size()-1)).append("\n");//범위값
			
		}
		System.out.println(sb.toString());	 
 */
