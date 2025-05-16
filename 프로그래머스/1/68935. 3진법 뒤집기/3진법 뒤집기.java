import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        
        // 3진법 구하기
        // -> 3으로 나눈 나머지를 구함
        // -> 이때 순서가 3진법 반전순으로 배열에 삽입
        List<Integer> ternary = new ArrayList<>();

        while (n > 0) {
            ternary.add(n % 3);
            n /= 3;
        }
        
        System.out.println(ternary);
        
        // 10진법으로 표현
        // -> 뒤에서 부터 3^0, 3^1, 3^2...
        int answer = 0;
        int powerOfThree = 1;
            
        for (int i = ternary.size() - 1; i >= 0; i--) {
            answer += ternary.get(i) * powerOfThree;
            powerOfThree *= 3;
        }
        
        return answer;
    }
}