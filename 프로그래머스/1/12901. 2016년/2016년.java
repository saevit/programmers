import java.util.*;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        // 요일의 이름 (일요일부터 토요일)
        List<String> days = List.of("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT");
        // 각 달의 일수
        int[] daysInMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // 2016년 1월 1일은? +1일인데 5
        // 2016년 1월 20일은? +20일이므로 4+20=24, 24%7=3 따라서 수요일
        
        // 올해로부터 일수 구하기
        int num = 0;
        // -- 이전 달까지의 일수 더하기
        for (int i = 1; i < a; i++){
            num += daysInMonth[i-1];
        }
        // -- 일의 일수 더하기
        num += b;
        
        // 일주일씩 묶은 후 남은 일수로 요일 구하기
        answer = days.get((4 + num) % 7);
        
        return answer;
    }
}