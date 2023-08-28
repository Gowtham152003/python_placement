#include<stdio.h>
#include<stdlib.h>
struct node
{
    int info;           //data
    struct node *next;  //address of next node
};

int main()
{
    int d,e,f;
    //Initialize nodes
    struct node*head=NULL;
    struct node*one=NULL;
    struct node*two=NULL;
    struct node*three=NULL;
    struct node*zero=NULL;
    struct node*four=NULL;
    struct node*five=NULL;



    //Allocate memory
    one=malloc(sizeof(struct node));
    two=malloc(sizeof(struct node));
    three=malloc(sizeof(struct node));
    zero=malloc(sizeof(struct node));
    four=malloc(sizeof(struct node));
    five=malloc(sizeof(struct node));

    //assigning values and connecting
    printf("Enter the node to be added in the first:");
    scanf("%d",&d);
    printf("Enter the node to be added at the middle:");
    scanf("%d",&e);
    printf("Enter the node to be added in the lsst:");
    scanf("%d",&f);
    zero->info=d;
    zero->next=four;
    four->info=e;
    four->next=one;
    one->info=1;
    one->next=two;
    two->info=2;
    two->next=three;
    three->info=3;
    three->next=five;
    five->info=f;
    five->next=NULL;

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

