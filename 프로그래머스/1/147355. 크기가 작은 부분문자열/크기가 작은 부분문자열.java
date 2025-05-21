class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        // t 문자열을 p 길이 만큼 자르기
        // 자른 문자열이 p보다 작다면 answer +1
        long pLong = Long.parseLong(p);
        
        for (int i = 0; i <= t.length() - p.length(); i++) {
            String sub = t.substring(i, i+p.length());
            
            long subLong = Long.parseLong(sub);
            if (subLong <= pLong) {
                answer++;
            }
        }
        
        return answer;
    }
}