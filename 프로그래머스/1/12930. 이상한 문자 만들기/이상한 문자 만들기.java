class Solution {
    public String solution(String s) {
        String answer = "";
        
        int count = 0;
        for (Character c : s.toCharArray()) {
            // 공백이면 카운트 초기화
            if (c == ' ') {
                answer += c;
                count = 0;
                continue;
            }
            
            // 짝수번째는 대문자, 홀수번째는 소문자로
            if (count % 2 == 0) {
                answer += Character.toUpperCase(c);
            } else {
                answer += Character.toLowerCase(c);
            }
            
            // 카운트 +1
            count++;
        }
        
        return answer;
    }
}