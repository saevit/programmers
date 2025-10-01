import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        int n = 0; // cards1 인덱스용
        int m = 0; // cards2 인덱스용
        
        for (int i=0; i<goal.length; i++) {
            // 첫 번쨰 카드 뭉치 중에 목표 값이 있는지 확인
            if (n < cards1.length && goal[i].equals(cards1[n])) {
                n++;
            }
            // 두 번쨰 카드 뭉치 중에 목표 값이 있는지 확인
            else if (m < cards2.length && goal[i].equals(cards2[m])) {
                m++;
            }
            // 없다면 불가능 반환
            else {
                answer = "No";
                break;
            }
        }
        
        return answer;
    }
}