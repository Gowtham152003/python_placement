import java.util.*;
class spiral
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i,j,mincol=0,minrow=0;
        System.out.println("Enter the no.of.rows:");
        int m=sc.nextInt();
        System.out.println("Enter the no.of.coumns:");
        int n=sc.nextInt();
        int maxrow=m-1,maxcol=n-1;
        int arr[][]=new int[m][n];
        int c=1;
        while(c<=m*n)
        {
            for(i=mincol;i<=maxcol;i++)
            {
                arr[minrow][i]=c++;
            }
            minrow++;

            for(i=minrow;i<=maxrow;i++)
            {
                arr[i][maxcol]=c++;
            }
            maxcol--;
            for(i=maxcol;i>=mincol;i--)
            {
                arr[maxrow][i]=c++;
            }
            maxrow--;
            for(i=maxrow;i>=minrow;i--)
            {
                arr[i][mincol]=c++;
            }
            mincol++;


        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
}
}