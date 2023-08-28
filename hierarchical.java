class A1
{
    public void display1()
    {
        System.out.println("Parent class");
    }
}
class B extends A1
{
    public void display()
    {
        System.out.println("Brother class");
    }
}
class C extends A1
{
    public void display()
    {
        System.out.println("Sibling class");
    }
    public static void main(String args[])
    {
    C s=new C();
    s.display1();
    }
    
}
