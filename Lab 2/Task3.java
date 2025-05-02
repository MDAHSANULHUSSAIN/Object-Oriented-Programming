
package ahsan.lav2;

import java.util.Arrays;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]= input.nextInt();
        }  
        Arrays.sort(arr);
        if(n>0){
            System.out.print(arr[0]+" ");
        }
         for(int i=1;i<n;i++){
             if(arr[i]!= arr[i-1]){
                 System.out.print(arr[i] + " ");
         }
         }
          System.out.println();
        
    
}
}
