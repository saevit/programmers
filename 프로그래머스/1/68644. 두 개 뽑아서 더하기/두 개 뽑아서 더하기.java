import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        // Set 선언 (중복 방지) 
        Set<Integer> set = new HashSet<>();
        
        // 가능한 두 수를 더하는 경우 모드 담기
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        // Set → int[]
        int[] answer = new int[set.size()];
        int i = 0;
        for (int num : set) {
            answer[i++] = num;
        }

        // 정렬
        Arrays.sort(answer);
        
        return answer;
    }
}