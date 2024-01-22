class Solution {
    public int solution(int[][] dots) {
        
        double slope1 = (double) (dots[1][1] - dots[0][1]) / (dots[1][0] - dots[0][0]);
        double slope2 = (double) (dots[3][1] - dots[2][1]) / (dots[3][0] - dots[2][0]);
        double slope3 = (double) (dots[3][1] - dots[0][1]) / (dots[3][0] - dots[0][0]);
        double slope4 = (double) (dots[2][1] - dots[1][1]) / (dots[2][0] - dots[1][0]);

        return (slope1 == slope2 || slope3 == slope4) ? 1 : 0;
        
    }
}