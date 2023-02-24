import java.io.*;
import java.util.*;

public class Pair_With_given_Sum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int X=sc.nextInt();
        sol(arr,X);
    }
    public static void sol(int [] arr, int X){
        int count=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]+arr[j]==X){
                   count++;
                }
               
            }
        }
        if(count>0)
                 System.out.println("YES");
             else{
                    System.out.print("NO");
                }
    }
}

/*
6
10 20 35 50 75 80
70
*/