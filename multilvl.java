class Grandfather
{
    public void gf()
    {
        System.out.println("Grand Father");
    }

    
}
class father extends Grandfather
{
    public void fa()
    {
        System.out.println("Father");
    }
}
class Son extends father
{
    public void son()
    {
        System.out.println("Son");
    }


public static void main(String args[])
{
    Son obj=new Son();
    obj.son();
    obj.fa();
    obj.gf();

}
}

