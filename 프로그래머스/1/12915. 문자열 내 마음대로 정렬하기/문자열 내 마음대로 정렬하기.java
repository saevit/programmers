import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        List<String> list = new ArrayList<>();
        
        // 정렬 기준 글자+단어로 리스트 생성
        for(int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }
        
        // 정렬 (첫 글자 기준으로 정렬 = 정렬 기준 글자로 정렬)
        Collections.sort(list);
        
        // 정렬을 위해 임의적을 넣어줬던 기준 글자 제외하고 답안에 담기
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1);
        }
        
        return answer;
    }
}