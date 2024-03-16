public class pen1 {
    String brand="camlin";
    String colour;
     int price=40;
     public static void main(String[] args) {
        pen1 p1=new pen1();
        p1.colour="red";
        pen1 p2 =new pen1();
        p2.colour="black";
        pen1 p3= new pen1();
        p3.colour="blue";
        System.out.println(p1.brand+" "+p1.colour+"  "+p1.price);
         System.out.println(p2.brand+" "+p2.colour+ " "+p2.price);
         System.out.println(p3.brand+" "+p3.colour+ " "+p3.price);
     }
}
