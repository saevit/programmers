import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx = 0;
        
        for (int[] c : commands) {
            // i번째부터 j번째까지 temp에 리스트 저장
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < array.length; i++) {
                if (i >= c[0] - 1 && i < c[1]) {
                    temp.add(array[i]);
                }
            }

            // 정렬
            Collections.sort(temp);
            
            // k번째에 있는 수를 구하여 저장
            answer[idx++] = temp.get(c[2] - 1);
        }

        return answer;
    }
}