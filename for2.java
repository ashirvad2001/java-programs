import java.util.*;

public class for2 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int rev=0;
        int rem=0;
        int n=sc.nextInt();
        while(n>0){
           rem=n%10;
           rev=(rev*10)+rem;
          
System.out.print(rev);
           n=n/10;
        }
       // System.out.print(rev);
       System.out.println();
    }
}
