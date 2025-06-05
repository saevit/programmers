import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character,Integer> map = new HashMap<>();
        
        // 해시로 저장 (알파벳:위치)
        // key로 찾아서 없다 -> -1 + 해시에 저장
        // key로 찾으니 있다 -> 위치 차이 계산 + 해시 갱신
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (!map.containsKey(c)) {  // 키가 없다면 -1
                answer[i] = -1;
            } 
            else {  // 키가 있다면 차이 계산
                answer[i] = i - map.get(c);
            }
            map.put(c, i); // 끝날 때 마다 갱신
        }
        
        return answer;
    }
}