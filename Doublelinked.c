#include<stdio.h>
#include<stdlib.h>
struct node
{
    int info;
    struct node*prev;
    struct node*next;
};

int main()
{
    int d,e,f;
    //Initialize nodes
    struct node*head=NULL;
    struct node*zero=NULL;
    struct node*one=NULL;
    struct node*two=NULL;
    struct node*three=NULL;

    printf("Enter the node to be added in the first:"); //element added in first      
    scanf("%d",&d);

    //Allocate memory
    zero=malloc(sizeof(struct node));
    one=malloc(sizeof(struct node));
    two=malloc(sizeof(struct node));
    three=malloc(sizeof(struct node));

    zero->info=0;
    zero->next=one;
    zero->prev=head;
    one->info=1;
    one->next=two;
    one->prev=zero;
    two->prev=one;
    two->info=2;
    two->next=three;
    three->prev=two;
    three->info=3;
    three->next=NULL;

    

    //printing value
    head=zero;
    //pointing to head
    struct node*p=head;
    while (p!=  NULL)
    {
        printf("%d-> ",p->info);
        p=p->next;

    }
    return 0;


}

