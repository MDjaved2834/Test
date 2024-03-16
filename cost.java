

public class cost {
    public static float check (int n)
       {
    float amt= n*100;
    if (amt>=1000){
    return amt-amt*0.01f;
    }
    else{
    return amt;
    }
 }
    public static void main(String[] args) {
        System.out.println(check(10));
        System.out.println(check(5));
        System.out.println(check(20));
    }
 }

