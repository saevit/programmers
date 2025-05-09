import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {

        // 문자열을 문자 배열로 변환
        Character[] chars = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }

        // 문자를 큰것부터 작은 순으로 정렬 (내림차순)
        Arrays.sort(chars, Collections.reverseOrder());

        // 문자열로 다시 합치기
        String answer = "";
        for (char c : chars) {
            answer += c;
        }

        return answer;
    }
}