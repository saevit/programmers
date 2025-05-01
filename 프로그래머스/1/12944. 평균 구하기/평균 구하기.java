class Solution {
    public double solution(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        
        double answer = (double) sum / arr.length;        
        return answer;
    }
}