class Solution {
    public String solution(String X, String Y) {
        
        // X와 Y를 돌며 공통으로 포함 된 숫자 찾기 -> 수가 길어질수록 반복문을 많이 돌아야함. (기각)
        // X와 Y가 0~9를 몇개씩 가지고 있는지 카운팅
        int[] countX = new int[10];
        for (int i=0; i<X.length(); i++){
            countX[X.charAt(i) - '0']++;
        }
        
        int[] countY = new int[10];
        for (int j=0; j<Y.length(); j++){
            countY[Y.charAt(j) - '0']++;
        }
       
        // 공통 수로 만들 수 있는 가장 큰 수 찾기
        // (큰 수부터 공통으로 최대 몇개씩 있는지 확인 후 개수만큼 나열)
        StringBuilder answer = new StringBuilder();
        for (int k = 9; k >= 0; k--){
            int common = Math.min(countX[k], countY[k]);
            
            for (int l=0; l<common; l++){
                answer.append(k);
            }
            
        }
        
        // 짝궁이 존재하지 않는다면 -1
        if (answer.length() == 0) {
            return "-1";
        }
        
        // 짝궁이 0으로만 구성되어 있다면 0
        if (answer.charAt(0) == '0') {
            return "0";
        }
        
        return answer.toString();
    }
}