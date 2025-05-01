class Solution {
    public int solution(int num) {
        int answer = 0;
        
        long n = num; // num은 1 이상 8,000,000 미만인 정수
                      // 그러나 홀수 일 시 3을 곱하고 1을 더하며 int를 넘을 수 있음.
        
        while (n != 1) {
            if (answer >= 500) { 
                answer = -1;
                break;
            }
            
            ++answer;
            
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
        }
        
        return answer;
    }
}