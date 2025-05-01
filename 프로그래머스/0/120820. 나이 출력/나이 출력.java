class Solution {
    public int solution(int age) {
        int answer = 2022 - (age - 1); // 태어난 순간부터 1살 이므로 age-1년 살았음
        return answer;
    }
}