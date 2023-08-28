class methodover
{
    static int sum(int n,int m)   
    {
        return n+m;
    }
    static int sum(int a,int b,int c)      //method over loading - same function name but different parameters//
    {
        return a+b+c;
    }
    public static void main(String args[])
    {
        System.out.println("Sum of (10,20) is :"+sum(10,20));        //calling first method
        System.out.println("Sum of(10,20,30) is:"+sum(10,20,30));  //callinng second method

    }



}