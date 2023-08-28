

/*Polymorphism is ability to take more than form from a given form
 Example: method of shape(parent) will be overriden by methods of circle,Rectangle and square
                  Shape
              /     |     \
            cicle  square  rectangle          
*/
class shape
{
   void display()
   {
      System.out.println("Starting the shape class");
   }
}
class rectangle extends shape
{
  void display()
  {
    System.out.println("Drawing rectangle");
  }
}
class circle extends shape{
  void display()
  {
    System.out.println("Drawing circle");
  }
  
  public static void main(String args[])
  {
    shape s;
    s=new circle();
    s.display();
    s=new rectangle();
    s.display();
    
  }
}