class Solution {
    public String solution(String s) {
        String answer = "";
        
        if (s.length() % 2 == 0) { // 길이가 짝수 일 때
            int minIndex1 = s.length() / 2 - 1;
            int minIndex2 = s.length() / 2;
            
            answer += s.charAt(minIndex1);
            answer += s.charAt(minIndex2);
        } 
        else { // 길이가 홀수 일 때
            int minIndex = s.length() / 2;
            
            answer += s.charAt(minIndex);
        }
        
        return answer;
    }
}