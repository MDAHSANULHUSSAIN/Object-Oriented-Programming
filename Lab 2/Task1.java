
package ahsan.lav2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
       int arr[] = new int[n];
        
       int mx = -1000;
       int mn= 1000;
       for (int i=0;i<n;i++) {
            arr[i] =input.nextInt();
        }
        
        for (int i =0;i< n;i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        for (int i =0;i< n;i++) {
            if (arr[i] <mn) {
                mn = arr[i];
            }
        }
        System.out.println("MAX =" + mx);
        System.out.println("MIN =" + mn);
    }
}
