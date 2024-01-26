import java.util.*;

class Solution {
    public long solution(long n) {
        char[] sarr = (n + "").toCharArray();
        Arrays.sort(sarr);
        StringBuilder sb = new StringBuilder(new String(sarr));
        
        return Long.parseLong(sb.reverse().toString());
    }
}