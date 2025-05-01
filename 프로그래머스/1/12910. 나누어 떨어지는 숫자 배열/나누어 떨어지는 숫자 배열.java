import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        
        // 나누어 떨어지는 수 찾기
        for (int i : arr) {
            if (i % divisor == 0) {
                list.add(i);
            }
        }

        int[] answer;

        if (list.size() == 0) {
            // 나누어 떨어지는 수가 없다면 -1
            answer = new int[]{-1};
        } else {
            // 나누어 떨어지는 수가 있다면 정렬 후 int[]형으로 변환 
            Collections.sort(list);
            answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
        }

        return answer;
    }
}