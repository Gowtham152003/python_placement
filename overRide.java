class overRide              
//In method oveririding both parent and child class have the same method//
//child classs will override method of parent class//
{
    String color="RED";
    overRide()
    {
        System.out.println("Parent class Constructor");
    }
    public void drive()
    {
        System.out.println("Driving car");
    }
}
class One extends overRide
    {
        One()
            {
                super();                                            //derived constructor can only call parent constructor it need to be the first line of the constructor using super().
            }
        public void drive()
        {
            
            System.out.println("Riding bike");
            super.drive();  
            System.out.println("Color:"+super.color);                                //  Super keyword is used to access the methods,instance variables,constructor from the child cass//
        }
        public static void main(String args[])
        {
            One obj=new One();
            obj.drive();
        }
    }
    

