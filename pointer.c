#include<stdio.h>
int main()
{
    int *p;
    int a=10;
    p=&a;
    printf("Address of the varible:%p\n",a);
    printf("Value of the variable:%d\n",a);
    printf("Value of the variable:%d\n",p);
}