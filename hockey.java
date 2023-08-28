class sports 
{
    void play()
    {
        System.out.println("Playing a Game!!!");
    }
}
class cricket extends sports
{
   void play()
    {
        System.out.println("Playing Cricket!!!");
    } 
}
class football extends sports
{
   void play()
    {
        System.out.println("Playing Footbal!!!");
    } 
}
class volleyball extends sports
{
   void play()
    {
        System.out.println("Playing volleyball!!!");
    } 
}
class hockey extends sports
{
   void play()
    {
        System.out.println("Playing Hockey!!!");
    } 
    public static void main(String args[])
    {
        sports s=new sports();
        s.play();
        s=new cricket();
        s.play();
        s=new football();
        s.play();
        s=new volleyball();
        s.play();
        s=new hockey();
        s.play();
    }
}
