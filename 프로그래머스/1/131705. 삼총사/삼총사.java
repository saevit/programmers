class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        // 배열 중 3개 선택 -> 합이 0이면 answer +1
        
        for (int i = 0; i < number.length-2; i++){
            for (int j = i+1; j < number.length-1; j++){
                for (int k = j+1; k < number.length; k ++){
                    if(number[i] + number[j] + number[k] == 0){
                        answer +=1;
                    }
                }
            }
        }
        
        return answer;
    }
}