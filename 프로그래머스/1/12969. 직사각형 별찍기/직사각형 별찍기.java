import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < b; i++) { // 세로줄 만큼 반복
            for (int j = 0; j < a; j++) { // 가로줄 출력
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}