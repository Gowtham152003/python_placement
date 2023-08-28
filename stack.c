/*STACK
1.LIFO(Lost in First In)
2.Collection of same type of elements
3.Linear list
4.Element added it will be in the top of the stack
5.Deletion and Insertion done at the end of the list.
       BASIC OPERATION   
            1.push   //overflow -top++
            2.pop   //under flow-top --
TYPEDEF FUNCTION:
    ALIAS NAME

    struct node
    {
        int marks;
        int roll_no;
    };
    typedef struct node STUD;       //node need to call the structure with again struct student s1,s2 like that instead of that
                                    we can use STUD s1,s2
    
*/
#include<stdio.h>
int stack[50],choice,n,top=-1,x,i;
void insert();
void pop();
void display();
int main()
{
    printf("Enter the size of the stack[1-50]:");
    scanf("%d",&n);
    printf("STACK OPERATIONS\n1.PUSH\n2.POP\n3.DISPLAY");
    
    while(1)
    {
      printf("\nEnter the choice[1-3]:");
      scanf("%d",&choice);
      switch(choice)
    {
        case 1:
            insert();
            break;
        case 2:
            pop();
            break;
        case 3:
            display();
            break;
        default:
            printf("Enter the vaid choice:");
    } 
    if(choice == 4)
    	break;
    }
    return 0;
}

void insert()
{
    if(top==n-1)
    {
        printf("Stack overflow");
    }
    else{
        printf("Enter the value to be inserted:");
        scanf("%d",&x);
        top++;
        stack[top]=x;
    }
}
void pop()
{
    if(top==-1)
    {
        printf("Stack underfolw");
    }
    else{
        printf("The popped elements is:%d\n",stack[top]);
        top--;
    }
}
void display()
{
    if(top>=0)
    {
        printf("The elements in the stack is:");
        for(i=top;i>=0;i--)
        {
            printf("%d\n",stack[i]);
        }
    }
    else{
        printf("The stack is empty");
    }
}