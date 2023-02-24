import java.util.*;

public class Armstrong {

    public static void main(String[] args) {
        /* Enter your code here */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=n;
        int rem=0;
        int arm=0;
        
        int count=0;
        int a=n;
         while(a != 0){  
        a = a / 10;  
        count = count + 1;  
    }  
        
         if(c<0){
            System.out.print("Invalid Input");
        }
    else{

        
        while(n>0){
            rem=n%10;
            arm=arm + (int)Math.pow(rem,count);
            n=n/10;
        }
        if(c==arm){
            System.out.print("Armstrong");
        }
        else{
            System.out.print("Not Armstrong");
        }
    }
        
    }
}