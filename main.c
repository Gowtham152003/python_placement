#include<stdio.h>
void main()
{
    static int i=0;
        if(i<=5)
        {
            printf("%d\t",i);
        }
        i++;
        main();
        
    }
