class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        // 아스키코드 +n -> 결과로 저장
        
        for (char c : s.toCharArray()) {
             if (Character.isUpperCase(c)) {
                // 대문자 
                answer += (char) ('A' + (c - 'A' + n) % 26);
            } else if (Character.isLowerCase(c)) {
                // 소문자
                answer += (char) ('a' + (c - 'a' + n) % 26);
            } else {
                // 공백
                answer += c;
            }
        }
        
        return answer;
    }
}