class Solution {
    public long solution(long n) {
        long answer = -1;
        
        double sqrt = Math.sqrt(n);

        if (sqrt == (long)sqrt) { // 소수점 없다면 정수의 제곱근이 있다
            answer = (long)((sqrt+1)*(sqrt+1));
        }
        
        return answer;
    }
}