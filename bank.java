

public class bank {
    public static void desplay(int bal ,int amt, boolean pan)
    {
    if (amt<  100000)
    {
       amt = amt+ bal;
    }
    if (amt>100000 && pan == false)
    {
        System.out.println("link pancard");
    }
    if (amt>100000 && pan == true){
        amt = amt+bal;
    }
}
 public static void main(String[] args) 
 {
   
   desplay(1000000,2000000,true);
 
}

    
        
    
    
}
