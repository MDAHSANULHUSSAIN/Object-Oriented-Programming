
package ahsan.lav2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n =input.nextInt();
        int arr[]=new int[n];
        int target = input.nextInt();
      
        for(int i=0;i<n;i++){
            arr[i]= input.nextInt();
            
        }
         for(int i=0;i<n-1;i++){
             if(arr[i]+arr[i+1]== target){
          System.out.print(arr[i]+" "+arr[i+1]);
         }
        
    }
    }
}
