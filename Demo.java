public class Demo {
    public static String check (char a) {
       if (a>=65 && a <= 90){
        return "uppercasecharacter";
       }
        else if (a>= 97 && a<= 122){
            return "lowlower case";
        }
        else if(a>=48  && a <= 57){
            return "number";
        }
        else{
            return "special chrcter";
        }
    }
    public static void main(String[] args) {
       System.out.println(check('A')); 
    }
        
    }

