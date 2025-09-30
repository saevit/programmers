import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        // 리스트에 점수를 추가 -> 정렬 -> k순위까지 남기고 제거 후 3위 기록
        
        List<Integer> rank = new ArrayList<>();
        
        for (int i = 0; i < score.length; i++) {
            // 점수 추가 후 정렬
            rank.add(score[i]);
            Collections.sort(rank, Collections.reverseOrder());
            
            // k위까지만 명예의 전당 유지
            if (rank.size() > k) {
                rank.remove(rank.size() - 1); // 가장 낮은 점수 제거
            }
            
            // 명예의 전당 최하위 점수 기록
            answer[i] = rank.get(rank.size() - 1);
        }
        
        return answer;
    }
}