public class Tv {
   String name;
   String type;
   int price;
   public static void main(String[] args) {
      Tv t1=new Tv();
      t1.name="sony";t1.type="led"; t1.price=45000;
      Tv t2=new Tv();
      t2.name="mi"; t2.type="led"; t2.price=23456;
      Tv t3=new Tv();
      t3.name="oneplus";t3.type="lcd"; t3.price=89000;
      System.out.println(t1.name+","+t1.type+","+t1.price);
      System.out.println(t2.name+","+t2.type+","+t2.price);
      System.out.println(t3.name+","+t3.type+", "+t3.price);

   }
}
 
    

