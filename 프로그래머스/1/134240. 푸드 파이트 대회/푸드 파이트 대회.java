class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        // 0번은 물
        // 1번부터 /2해서 배치 -> 물 -> 역순으로 다시
        
        // 순서대로 /2해서 배치하는 문자열
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;
            sb.append(String.valueOf(i).repeat(count));
        }
        
        // 음식 순서대로 배치 -> 물 -> 역순으로 배치
        answer += sb + "0";
        answer += sb.reverse();
        
        return answer;
    }
}