class Solution {
    public int[] solution(int[] arr) {
        // 배열의 길이가 1인 경우 -> 리턴하는 배열이 빈 배열이 되므로 -1을 넣고 반환
        if (arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }
        
        // 가장 작은 값을 가진 인덱스 구하기
        int min_index = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[min_index]) {
                min_index = i;
            }
        }
        
        // 가장 작은 수를 제외하고 answer에 복사하기
        int[] answer = new int[arr.length - 1];
        
        for (int i = 0, j = 0; i < arr.length; i++) {
        if (i != min_index) {
            answer[j++] = arr[i];
            }
        }
        
        return answer;
    }
}