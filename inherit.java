/*inheritance
   deriving the parent class properties to the child class (one class can access another class properties)
   1.single
   2.multilevel
   3.hybrid(not in java)
   4.hierarchical
 */
class inherit 
{
    public void eat()
    {
        System.out.println("Eating");
    }

    
}
class A extends inherit
{
    public void play()
    {
        System.out.println("Playing");
    }

public static void main(String args[])
{
    A obj=new A();
    obj.play();
    obj.eat();

}
}

