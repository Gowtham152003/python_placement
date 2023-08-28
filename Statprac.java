class Statprac 
{
    int id;
    String name;
    static String college_name="SSE";     //static keyword the valus is same/common for all objects created.

    Statprac(int i,String n)
    {
        id =i;
        name=n;
    }
    static void change()
    {
        college_name="IIT";             //changing the static value using method.
    }
    void display()
    {
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("College:"+college_name);
    }
    public static void main(String args[])
    {
        Statprac obj=new Statprac(192011090,"Gowtham");
        Statprac obj1=new Statprac(192011274,"Vikas");
        Statprac obj2=new Statprac(192011095,"Harish");
        Statprac.change();
        ////Statprac.college_name="IIT";                               //changing the static value//
        obj.display();
        obj1.display();
        obj2.display();
    }
}
