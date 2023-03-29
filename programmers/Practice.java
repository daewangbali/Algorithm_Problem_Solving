package programmers;
import java.util.*;

public class Practice {

	public static String solution(String[][] ADInfos, String[][] logs) {
        String answer = "";
        //���� id�� ���� ���� map
        Map<String, Integer> map = new HashMap<>();

        for(int i=0 ; i<ADInfos.length ; i++){
            for(int j=0 ; j<logs.length ; j++){
                //����id�� ��ġ�� �� ���� ���
                int money = 0;
                if(ADInfos[i][0].equals(logs[j][1])){
                    //��û���� Ŭ������ �ܰ� Ȯ��
                    if(logs[j][0].equals("V")){
                        money = Integer.parseInt(ADInfos[i][1]);
                    }else if(logs[j][0].equals("C")){
                        money = Integer.parseInt(ADInfos[i][2]);
                    }
                    //Ÿ�� ��ġ�ϸ� ���� 2��
                    if(ADInfos[i][3].equals(logs[j][3])){
                        money *= 2;
                    }
                    //��û ������ 50%�̸� �ܰ� ����
                    if(logs[j][2].length() != 0){
                        int r = Integer.parseInt(logs[j][2]);
                        if(r < 50){
                            money /= 2;
                        }
                    }
                    //���� �ִ� ������ ���� �����ֱ�
                    if(map.containsKey(logs[j][1])){
                        money += map.get(logs[j][1]);
                    }
                    //���� ���� �Է�
                    map.put(logs[j][1],money);

                }
            }
        }

        int max = 0;
        int flag = 0; //���� ���� ���� ���� 2�� �̻����� Ȯ���ϴ� ����
        for(String key : map.keySet()){
            if(max < map.get(key)){
            	
                max = map.get(key);
                answer = key;
                flag = 0;
            }else if(max == map.get(key)){
                flag = 1;
            }
        }

        if(flag == 1){
            answer = "-1";
        }
        
        return answer;
    }
	
	
	public static void main(String[] args) {
		String[][] ADInfos = {{"A", "5", "20", "F"}, {"B", "3", "5", "M"}};

		String[][] logs = {{"C", "A", "", "M"}, {"V", "B", "30", "M"}, {"C", "B", "", "M"}};
		System.out.println(solution(ADInfos, logs));
	}
}
