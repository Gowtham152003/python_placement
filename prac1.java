class prac1                                     // Class name
{
    int id;                                     //Instance variable
    String name;
    void getData(int i,String n)                //Methods
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
        prac1 a=new prac1();
        prac1 b=new prac1(); //object creation
        a.getData(10,"Gowtham");
        a.display();
        b.getData(11,"Arun");
        b.display();
        

    }
}