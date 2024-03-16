public class Demo1 
{
    static int x=10;
    static void test()
        {
            System.out.println("running static test () mrthod");

        }
    
}

 class mainclass1
 {
public static void main(String[] args) {
        System.out.println(" main method started");
    //printing static variable of demo1 class
         System.out.println("x value before mdifying  is "+ Demo1.x);
    // calling static method of Demo1 classj
        Demo1.test();
    //re-assigning value to static variable of Demo1 class
        Demo1.x=20;
         System.out.println("x value after modifying is "+Demo1.x);
         System.out.println("mean method ended");
}
 }
