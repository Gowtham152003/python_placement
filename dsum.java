import java.util.*;
class dsum
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of.rows:");
        int m=sc.nextInt();
        System.out.println("Enter the no.of.columns:");
        int n=sc.nextInt();
        int sum=0,sum1=0;
        int i,j;
        int arr[][]=new int[m][n];
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j)
                {
                    sum=sum+arr[i][j];
                }
            }
        }
       int j1=n-1;
       for(i=0;i<m;i++)
       {
            sum1+=arr[i][j1--];
        }
        System.out.println("Left diagonal sum:"+sum);
        System.out.println("Right diagonal sum:"+sum1);
        System.out.println("Diagonal sum:"+(sum+sum1));
    }
}
