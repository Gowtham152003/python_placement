#include<stdio.h>
#include<stdlib.h>
struct node
{
    int info;
    struct node *next;
};

void enqueue(struct node**front,struct node**rear,int i)
{
    struct node *new;
    new=(struct node*)malloc(sizeof(struct node));
    new->next=NULL;
    new->info=i;
    if((*front)==NULL)
    {
        (*front)=new;
        (*rear)=new;
    }
    else
    {
        (*rear)->next=new;
        (*rear)=new;
    }
}
int del_queue(struct node **front)
{
    struct node *temp;
    int removed;
    if((*front)!=NULL)
    {
        temp=*front;
        (*front)=(*front)->next;
        removed=temp->info;
        free(temp);
    }
    return removed;
}

void display(struct node*front)
{
    printf("\nFront->");
    while (front !=NULL)
    {
        printf("%d-->",(*front).info);
        front=(*front).next;
    }
    printf("NULL\n");
}

void main()
{
    struct node *front=NULL,*rear=NULL;
    int finished=0,choice,data;
    do
    {
        printf("\nQUEUE OPERATIONS");
        printf("\n 1)Insert");
        printf("\n 2)Delete");
        printf("\n 3)Display");
        printf("\n 4)EXIT");
        printf("\nEnter the choice: ");
        scanf("%d",&choice);
        switch (choice)
        {
            case 1:
                printf("Enter the element need to be inserted:");
                scanf("%d",&data);
                enqueue(&front,&rear,data);
                break;
            case 2:
                printf("The element dequeued is:%d",del_queue(&front));
                break;
            case 3:
                display(front);
                break;
            case 4:
                break;

        }
        if(front ==NULL)
        {
            printf("\nThe queue is empty!!");
        }
        
    }while(choice!=4);
    
    
}