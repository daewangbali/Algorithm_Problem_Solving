class Solution {
    boolean solution(String s) {
        int pleng = s.replaceAll("[Pp]","").length();
        int yleng = s.replaceAll("[Yy]","").length();

        return pleng == yleng ? true : false;
    }
}