class prac                                      // Class name
{
    int id;                                     //Instance variable
    String name;
    void getData(int i,String n)
    {
        id=i;
        name=n;
    }
    void display()
    {
        System.out.println(id);
        System.out.println(name);
    }
    public static void main(String args[])     //public- Access modifiers ,static-excecutes first ///void- no return value,main- function name
    {
        prac a=new prac(); //object creation
        prac b=new prac();
        a.id=10;            //objct name.instance varible
        a.name="Gowtham";
        b.id=20;
        b.name="Arun";
        System.out.println(a.id);
        System.out.println(a.name);
        System.out.println(b.id);
        System.out.println(b.name);

    }
}