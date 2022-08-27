import java.util.*;

public class for1 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            int rem=n%10;
           System.out.print(rem);
            n=n/10;
        }
        //System.out.println();
        // System.out.print(rem);
    }
}
