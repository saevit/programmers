class Solution {
    public int solution(int angle) {
        int answer = 0;
        
        // 예각 1, 직각 2, 둔각 3, 평각 4
        if (0 < angle && angle < 90) {
            answer = 1;
        } 
        else if ( angle == 90) {
            answer = 2;
        }
        else if (90 < angle && angle < 180) {
            answer = 3;
        }
        else if (angle == 180) {
            answer = 4;
        }
        
        return answer;
    }
}