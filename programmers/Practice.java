package programmers;
import java.util.*;

public class Practice {

	public static String solution(String[][] ADInfos, String[][] logs) {
        String answer = "";
        //광고 id별 수익 담을 map
        Map<String, Integer> map = new HashMap<>();

        for(int i=0 ; i<ADInfos.length ; i++){
            for(int j=0 ; j<logs.length ; j++){
                //광고id가 일치할 때 수익 계산
                int money = 0;
                if(ADInfos[i][0].equals(logs[j][1])){
                    //시청인지 클릭인지 단가 확인
                    if(logs[j][0].equals("V")){
                        money = Integer.parseInt(ADInfos[i][1]);
                    }else if(logs[j][0].equals("C")){
                        money = Integer.parseInt(ADInfos[i][2]);
                    }
                    //타겟 일치하면 수익 2배
                    if(ADInfos[i][3].equals(logs[j][3])){
                        money *= 2;
                    }
                    //시청 비율이 50%미만 단가 절반
                    if(logs[j][2].length() != 0){
                        int r = Integer.parseInt(logs[j][2]);
                        if(r < 50){
                            money /= 2;
                        }
                    }
                    //수익 있는 광고라면 수익 더해주기
                    if(map.containsKey(logs[j][1])){
                        money += map.get(logs[j][1]);
                    }
                    //광고 수익 입력
                    map.put(logs[j][1],money);

                }
            }
        }

        int max = 0;
        int flag = 0; //가장 수익 높은 광고가 2개 이상인지 확인하는 변수
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
