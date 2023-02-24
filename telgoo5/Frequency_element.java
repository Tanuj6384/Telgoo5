import java.util.*;
public class Frequency_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int [] fr = new int [arr.length];  
        int visited = -1;  
        
        for(int i = 0; i < arr.length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;  
                    //To avoid counting same element again  
                    fr[j] = visited;  
                }  
            }  
            if(fr[i] != visited)  
                fr[i] = count;  
        }  
        
        
        for(int i = 0; i < fr.length; i++){  
            if(fr[i] != visited)  
                System.out.println(arr[i]+" "+fr[i]);  
        }  
    }
}
    

   /*  
   8
10 30 10 20 10 20 30 10

10 4
30 2
20 2

*/

        

