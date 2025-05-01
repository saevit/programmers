class Solution {
    public boolean solution(int x) {
        // 자릿수의 합 구하기
        int sum = 0;
        int temp = x;
        while (temp>0) {
            sum += temp%10;
            temp /= 10;
        }
        
        // 나누어지는지 확인
        boolean answer;
        
        if (x%sum == 0) {
            answer = true;
        } else {
            answer = false;
        }
        
        return answer;
    }
}