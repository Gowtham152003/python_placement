 final class fin
 {
    //Final keyword is not able to change or override
    /*Final keyword is use for storing the confidential data like PAN number,Aadhar number etc....
    once the variable is declared as final
    we cannot override the variable.Similarly for constructors,classes
    Final methods: cannot inherited
    Final varible: not modifiable
    Final class: not inherited
    */
    final int id=1;
    final void data()
    {
        id=5; 
        System.out.println("Final cant be changed");           //not possible to change id value because it decalred as final.
    }
 }
 class two extends fin                                             // not possible to extend also beacuse it is declared as final
 {
    void data()
    {
        System.out.println("overrided");                        //  final is used for method cant oberride the method.
    }
    
    public static void main(String args[])
    {
        two obj=new two();
        obj.data();
        System.out.println(obj.id);
    }
 }
