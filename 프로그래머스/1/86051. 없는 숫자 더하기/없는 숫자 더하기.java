class Solution {
    public int solution(int[] numbers) {        
        int[] list = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        // 존재하는 숫자 0으로 바꾸기
        for (int n : numbers) {
            list[n] = 0;
        }
        
        // 배열의 원소값을 모두 더한다 -> 존재하지 않는 수의 합
        int answer = 0;
        for (int i : list) {
            answer += i;
        }
        
        return answer;
    }
}