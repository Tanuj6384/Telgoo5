import java.util.*;
public class Hollow_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char c=sc.next().charAt(0);
        
        for(int i=0; i<n-1;i++){
            for(int j=0; j<n;j++) {
                if(j==n-1 || j==n-i-1){
                    System.out.print(c);
                }
                else{
                    System.out.print(" ");
                }
               
            }
             System.out.println();
        }
        for(int i=0;i<n;i++){
        System.out.print(c);
        }
    }
}

/*
 7
$
      $
     $$
    $ $
   $  $
  $   $
 $    $
$$$$$$$
 */
