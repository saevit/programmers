class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        // 문자열 s의 길이가 4 혹은 6이 아니라면 False
        if (s.length() != 4 && s.length() != 6) {
            answer = false;
            return answer;
        }
        
        // 모두 숫자가 아니라면 False
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                answer = false;
            }
        }
        
        return answer;
    }
}