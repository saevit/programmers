import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        // 등급이 높은 순서대로 정렬
        Arrays.sort(score); // 오름차순 정렬
        
        for (int i = 0; i < score.length / 2; i++) {// 역순으로(내림차순으로)
            int temp = score[i];
            score[i] = score[score.length - 1 - i];
            score[score.length - 1 - i] = temp;
        }
        
        // 순서대로 m개씩 묶었을때 가장 낮은 등급 확인하여 (낮은등급)*m 구하기
        for (int i = m - 1; i < score.length; i += m) {
            answer += score[i] * m;
        }
        
        
        return answer;
    }
}