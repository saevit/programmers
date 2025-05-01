class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if (a > b) { // a가 더 크다면 순서 변경
            int temp = a;
            a = b;
            b = temp;
        }
        
        // 사이의 정수 합 구하기
        for (int i = a; i <= b; i++) {
            answer += i;
        }
        
        return answer;
    }
}