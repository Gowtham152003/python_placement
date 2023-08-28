class cons1
{
    int id;
    String name;
    String dept;
    cons1()
    {
        System.out.println("Hii");    //Default constructor
    }

    cons1(int id,String name)         //Parametrized constructor
    {
        this();                             //call the default constructor
        this.id=id;                      //this keyword is used to diffrentiate/instantiate the current instance variable
        this.name=name;
        System.out.println("Hi");
    }

    cons1(int id,String name,String dept)         //constructor overloading
    {
        this(13,"Arun") ;       
        //this(id,name);  
        this.id=id;
        this.name=name ;                       //Calling prevoius constructor //value mot passed for int =0,str=null
        //this.dept=dept;
        System.out.println("Hi");
    }
    void display()
    {
        System.out.println(id);
        System.out.println(name);
        System.out.println(dept);
        
    }
    public static void main(String args[])
    {
        cons1 obj1=new cons1();                  //calling the default constructor
        //cons1 obj =new cons1(10,"abc");
        cons1 obj2=new cons1(11,"Gowtham","CSE");  //calling the parametrized constructor
        //obj.display();
        obj2.display();


    }
}