public class Test0 {
    
        int Apple = 80;
        int  Qty = 4;
        float total = Apple*Qty;
        float Dis = total*15.0f/100;
        float gst = total*10.0f/100;
        float grandtotal=total-Dis+gst;
           public static void main(String[] args) {
                    Test0 t = new Test0();
                    System.out.println(t.Apple);
                    System.out.println(t.Qty);
                    System.out.println(t.total);
                    System.out.println(t.Dis);
                    System.out.println(t.gst);
                    System.out.println(t.grandtotal);
           }
    }



