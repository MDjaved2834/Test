public class teenager {
    public static String check (int age)
    {
   if (age>=12 && age<=19){
    return "teenager";
   }
   else{
    return "not a teenager";
   }
    }
    public static void main(String[] args) {
        System.out.println(check(28));
    }
}
//java visualizer