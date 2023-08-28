class student 
{
    int id;
    String name;

    student(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    
}
class department extends student
{
    String dept;
    department(int id,String name,String dept)
    {
        super(id,name);
        this.dept=dept;

    }
    void display()
    {
        System.out.println(id);
        System.out.println(name);
        System.out.println(dept);
    }
    
    public static void main(String args[])
    {
        department d=new department(19,"Gowtham","CSE");
        d.display();
    }
}
