public class Mobile1 {
    String  brand;
    String name;
    int price;
    String ram;
    public static void main(String[] args) {
        Mobile1 s1 =new Mobile1();
        s1.brand="Redmi";
        s1.name="8pro";
        s1.price=19999;
        s1.ram = "8gb";

        Mobile1 s2 = new Mobile1();
        s2.brand="Redmi";
        s2.name="9pro";
        s2.price=19466;
        s2.ram= "8gb";

        Mobile1 s3 = new Mobile1();
        s3.brand="apple";
        s3.name="iphone 11";
        s3.price=119900;
        s3.ram= "8gb";
        
        System.out.println( s1.brand+" "+s1.name+" "+s1.price +" "+s1.ram);
        System.out.println(s1.brand+" "+s2.name+"  "+s2.price+" "+s2.ram);
        System.out.println(s1.brand+" "+s3.name+"  "+s3.price+" "+s3.ram);
    }
    
}

