import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[]{-1};

        int[] narr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<narr.length ; i++){
            if(narr[i] != arr[0])
                list.add(narr[i]);
        }
        
        return list.stream().mapToInt(i->i).toArray();
    }
}