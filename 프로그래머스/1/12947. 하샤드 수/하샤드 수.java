class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int xtemp = x;
        while(xtemp > 0){
            sum += (xtemp % 10);
            xtemp /= 10;
        }
        return x % sum == 0 ? true : false;
    }
}