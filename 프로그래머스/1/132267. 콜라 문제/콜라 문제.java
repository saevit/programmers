class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        // n개가 있을 때 a개를 -> b개로
        // 남는 병도 같이 가지고 있다가 a개가 되면 다시 +b개로
    
        while (n >= a) { // 교환 가능한 빈 병이 있을 때까지 반복
            int exchanged = (n / a) * b;
            answer += exchanged; // 총 받은 콜라 병 누적
            n = (n % a) + exchanged; // 남은 빈 병 + 새로 받은 콜라
        }
        
        return answer;
    }
}