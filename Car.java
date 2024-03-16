public class Car {
    String name,colour;
    int price,cc;
    Car (String n,String c,int p, int cc){
        this.name=n;
        this.colour=c;
        this.price=p;
        this.cc=cc;
    }
    float getTax()
    {
       float tax=0;
       if (this.price<1000000)
       {
        tax=this.price*(17.0f/100);
       }
       else if 
       (this.price>=1000000 && this.price<2000000)
       {
        tax=this.price*(21.0f/100);
       }
       else if (this.price>=2000000 && this.price<5000000){
        tax=this.price*(26.0f/100);
       }
       else{
       tax=this.price*(30.0f/100);
       }
       return tax;

    }
    public static void main(String[] args) {
        Car c1=new Car("verna","black",1375000, 1500);
        c1.deatils();
    }
    int getInsurance(){
    int Insurance;
    if (this.cc<1000){
        Insurance=2399;
    } 
    else if (this.cc>=1000 && this.cc<2000){
        Insurance=3799;
    }
    else if(this.cc>=2000 && this.cc<3000){
        Insurance=5799;
    }
    else {
        Insurance=7499;
    }
    return Insurance;
    }
    void deatils(){
        System.out.println("name="+ this.name);
        System.out.println("colour="+ this.colour);
        System.out.println("price="+ this.price);
        System.out.println("cc="+ this.cc);
        int Insurance=this.getInsurance();
        float tax=this.getTax();
        int Insurance_5years=Insurance*5;
        System.out.println("Rto tax="+ tax);
        System.out.println("Insurance/1years="+ Insurance);
        System.out.println("Insurance/5years="+Insurance_5years);
        System.out.println("ON road price="+ (this.price+tax+Insurance_5years));
    }
    
}
