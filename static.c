#include<stdio.h>
void staticfun();
void autovar();
int main()
{
    int i;
    for(i=0;i<5;i++)
    {
        staticfun();
    }
     for(i=0;i<5;i++)
    {
        autovar();
    }

}
void staticfun()
{
    static int num=5;
    printf("\n static fun:value of num=%d",num--);      
}
void autovar()
{
    int var=5;
    printf("\n autovar:value of num=%d",var--);
}