 class Superbike {
    String  model;
    String engine;
    String topspeed;
    int price;
    public static void main(String[] args) {
        Superbike s1 =new Superbike();
        s1.model="kawasaki";
        s1.engine="649c";
        s1.topspeed="210kmph";
        s1.price = 594000;

        Superbike s2 = new Superbike();
        s2.model="street triple";
        s2.engine="765cc";
        s2.topspeed="225kmph";
        s2.price= 884000;

        Superbike s3 = new Superbike();
        s3.model="Dukati panigle v2";
        s3.engine="955cc";
        s3.topspeed="257kmph";
        s3.price= 1700000;
        System.out.println();
        System.out.println( s1.model+" "+s1.engine+" "+s1.topspeed +" "+s1.price);
        System.out.println(s2.model+" "+s2.engine+"  "+s2.topspeed+" "+s2.price);
        System.out.println(s3.model+" "+s3.engine+"  "+s3.topspeed+" "+s3.price);
    }
    
}

       


   

