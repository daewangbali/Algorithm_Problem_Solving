class Solution {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        String s = "*";
        sb.append(s.repeat(phone_number.length() - 4));
        sb.append(phone_number.substring(phone_number.length() - 4, phone_number.length()));
        return sb.toString();
    }
}