class car 
{
    String model;
    float price;
    car(String m,float p)
    {
        model=m;
        price=p;
    }
    void speed()
    {
        System.out.println("The car speed is:100 kmph");
    }
    void mileage()
    {
        System.out.println("The car mileage is:40 kmph");
    }
    void display()
    {
        System.out.println("Model:"+model);
        System.out.println("Price:"+price);

    }
    public static void main(String args[])
    {
        car obj=new car("Benz",78900.6f);
        obj.display();
        obj.speed();
        obj.mileage();
    }
}
