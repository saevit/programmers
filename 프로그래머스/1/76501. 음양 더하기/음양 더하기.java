class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i] == true) {
                // true는 더하기
                answer += absolutes[i];
            } else {
                // false는 빼기
                answer -= absolutes[i];
            }
        }
        
        return answer;
    }
}