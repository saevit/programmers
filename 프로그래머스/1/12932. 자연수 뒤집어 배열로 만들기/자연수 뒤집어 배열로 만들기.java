class Solution {
    public int[] solution(long n) {
        int length = String.valueOf(n).length();
        int[] answer = new int [length];
        
        for (int i = 0; i < length; i++) {
            answer[i] = (int) (n % 10); // 1의 자리 배열에 입력
            n /= 10;
        }
        
        return answer;
    }
}