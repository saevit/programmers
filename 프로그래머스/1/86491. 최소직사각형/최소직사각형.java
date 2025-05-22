class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
    // 가로가 더 긴 명함 / 새로가 더 긴 명함의 일관화
    // 명함 = A X B (단, 항상 A가 더 긴 쪽)일 때 A, B의 최대값 구하기
    
    int maxA = 0; 
    int maxB = 0;
    int a; int b;
    
    for (int[] s : sizes) {
        if (s[0] > s[1]) {
            a = s[0]; 
            b = s[1];
        }
        else{
            a = s[1]; 
            b = s[0];
        }
        
        if (maxA < a) {
            maxA = a;
        }
        
        if (maxB < b) {
            maxB = b;
        }
    }
    
    answer = maxA * maxB;
        
        return answer;
    }
}