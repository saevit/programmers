class Solution {
    public long solution(int price, int money, int count) {
        // 놀이기구를 타는데 필요한 총 이용료 구하기
        long totalPrice = 0;
        for (int i = 1; i <= count; i++) {
            totalPrice += price * i;
        }
        
        // 모자라는 돈 계산
        long answer = 0;
        if (totalPrice > money) {
            answer = totalPrice - money;   
        }
        
        return answer;
    }
}