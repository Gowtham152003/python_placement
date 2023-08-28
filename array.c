#include<stdio.h>
#include<stdlib.h>
int main()
{
    int *ptr;
    int n,i;
    printf("Enter the value of n:");
    scanf("%d",&n);
    ptr=(int*)malloc(n*sizeof(int));
    for(i=0;i<n;i++)
    {
        scanf("%d",&ptr[i]);
    }
    printf("\nArray elements are\n");
    for(i=0;i<n;i++)
    {
        printf("%d\n",ptr[i]);
    }
    return 0;
}