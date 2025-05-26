import java.util.Map;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        Map<String, Integer> numMap = Map.of("zero", 0, "one", 1, "two", 2,
                                             "three", 3, "four", 4, "five", 5,
                                             "six", 6, "seven", 7, "eight", 8,
                                             "nine", 9);   
        
        // 문자열을 하나 씩 순회
        // 숫자라면 바뀌지 않았으므로 -> 숫자로 저장
        // 문자라면 임시 문자열에 넣기 -> 임시문자열이 리스트에 있다면 해당 숫자를 찾아 저장
        
        String temp = "";
        
        for (char c : s.toCharArray()) {
            
            // 숫자라면 바로 저장 / 문자라면 임시 문자열에 저장
            if (Character.isDigit(c)) {
                answer = answer * 10 + Character.getNumericValue(c);
            } 
            else {
                temp += c;
            }
            
            // 임시 문자열이 영단어를 의미하는지 파악 및 저장
            Integer findNum = numMap.get(temp);
            if (findNum != null) {
                answer = answer * 10 + findNum;
                
                // 초기화
                temp = "";
            }
        }
        
        return answer;
    }
}