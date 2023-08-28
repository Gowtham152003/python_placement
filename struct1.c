#include<stdio.h>
struct student
{
    int roll_no;
    int marks;

};
int main()
{
    struct student s1;
    struct student *p;
    p=&s1;
    p->roll_no=192011090;
    p->marks=90;
    printf("Student_Rollno:%d\n",p->roll_no);
    printf("Student_Marks:%d",p->marks);
    return 0;
    
}