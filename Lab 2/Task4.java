package ahsan.lav2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        int sum = n * (n + 1) / 2; 
        int sum1 = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
            sum1 += arr[i];
        }
        int ans = sum1 - sum;
        System.out.print(ans);
    }
}
