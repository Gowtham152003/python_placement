#include <stdio.h>
int q[50],f=-1,r=-1,n,item;
void enqueue();
void dequeue();
void display();
int main()
{
 int choice=1;
 printf("enter the value of n:");
 scanf("%d",&n);
 while(choice<=n)
 {
    printf("\n\n--------queue OPERATIONS-----------\n");
    printf("1.enqueue\n");
    printf("2.dequeue\n");
    printf("3.display\n");
    printf("4.Exit\n");
    printf("-----------------------");
    printf("\nEnter your choice:\t");
    scanf("%d",&choice);
    switch(choice)
    {
        case 1: 
            enqueue();
            break;
        case 2:
            dequeue();
            break;
        case 3: 
            display();
            break;
        case 4: 
            break; 
    }
}
return 0;
}
void enqueue()
{
    printf("enter element:");
    scanf("%d",&item);
    if(r==n-1)
    {
        printf("Queue is full");
    }
    else if(f==-1 && r==-1)
    {
        f=0;
        r=0;
        q[r]=item;
    }
    else
    { 
        r=r+1;
        q[r]=item;
    }
}
void dequeue()
{
    if(f==r)
    {
        item=q[f];
        f==-1;
        r==-1;
        }
    else
    {
        item=q[f]; 
        f=f+1;
    }
}
void display()
{
    int i;
    if(f==-1 && r==-1)
    {
        printf("Queue empty");
    }
    else
    {
        for(i=f;i<=r;i++)
        {
            printf("%d",q[i]);
            printf("\n");
        }
    }
}
