class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        // left ~ right 사이의 값 반복
        for (int i = left; i <= right; i++) {
            // 약수의 개수 구하기
            int divisorCount = 0;
            
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisorCount++;
                }
            }
            
            // 약수의 개수가 짝수라면 더하고 홀수라면 빼기
            if (divisorCount % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }
}