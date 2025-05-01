import java.util.*;

class Solution {
    public long solution(long n) {       
        // 숫자 배열에 하나씩 넣기
        List<Integer> numList = new ArrayList<>();
        
        while (n > 0) {
            numList.add((int)(n % 10));
            n /= 10;
        }

        System.out.println(numList);
        
        // 정렬하기
        numList.sort(Collections.reverseOrder());
        
        // 다시 숫자로 합치기
        long answer = 0;
        
        for(int i : numList) {
            answer = answer*10 + i;
        }
        
        return answer;
    }
}