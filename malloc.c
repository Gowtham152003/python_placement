#include<stdio.h>
#include<stdlib.h>
struct student
{
    int roll_no;
    int marks;
};

int main()
{
    struct student *p;
    p=(struct student*)malloc(sizeof(struct student));
    p->roll_no=192011090;
    p->marks=89;
    printf("Student_Rollno:%d\n",p->roll_no);
    printf("Student_Marks:%d\n",p->marks);
    return 0;
}