public class Test3 {
    public static void main(String[] args) {
        int balance=999;
        int amount= 1000;
        System.out.println("balance before withdraw="+ balance);
        System.out.println("withdraw amount="+ amount);
        if( balance >= amount){
            balance= balance-amount;
            System.out.println("balance amount after withdraw="+ balance);
        }
        System.out.println("end program");

        }
    }

