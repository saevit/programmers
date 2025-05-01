class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        for (int i = 0; i<phone_number.length(); i++) {
            if (i < phone_number.length() - 4) {
                // 뒷자리 4개 제외 *로
                answer += "*";
            } else {
                answer += phone_number.charAt(i);
            }
        }
        
        return answer;
    }
}