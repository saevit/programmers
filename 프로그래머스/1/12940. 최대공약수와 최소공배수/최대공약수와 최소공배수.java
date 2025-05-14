class Solution {
    public int[] solution(int n, int m) {
        
        // 유클리드 호제법
        // 최대공약수: A를 B로 나눈 나머지 R과 B의 최대공약수와 같다
        // 최소공배수: A * B / 최대공약수
        
        int gcd = getGCD(n, m);
        int lcm = (n * m) / gcd;
        return new int[]{gcd, lcm};
    }

    private static int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}