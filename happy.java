import java.util.*;
public class happy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,sum=0,rem,s=1;
        System.out.println("Enter the number:");
        n=sc.nextInt();
        while(1)
        {
            rem=n%10;
            s=rem*rem;
            sum=sum+s;
            n=n/10;
        }

    }
    
}
