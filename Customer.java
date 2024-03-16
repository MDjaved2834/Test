public class Customer {
    String name;
    int balance,pin,bankcode;
    boolean pancard;
    long phnumber;
    Customer(String n,int b,int p, boolean pc, long ph){
        this.name=n;
        this.balance=b;
        this.pin=p;
        this.pancard=pc;
        this.phnumber=ph;
    }
    //set pin
    void setpin(int PIN){
        if (pin>=1000 && PIN<=9999){
            this.pin=PIN;
        }
        else{
            System.out.println("PIN must be 4 digit");
        }
    }
    //update number
    void updateNumber(int PIN,long oldnumber,long newnumber){
        if (this.pin==PIN)
        {
            if(this.phnumber==oldnumber)
            {
                this.phnumber=newnumber;
             System.out.println("number PH-number UPDTE");
            }
        }
       else
       {
        System.out.println("Incorrect pin");
       }
    }
    void deposit(int PIN,int ammount){
        if ( this.pin==PIN){
            if (this.pancard==true || ammount<=100000){
             this.balance=this.balance+ammount;
            }
            else{
                System.out.println("LINK-PANCARSD");
            }
        }
        else{
            System.out.println("incorrect pin");
        }
    }
    
    void withdrow(int PIN,int ammount){
        if ( this.pin==PIN){
            if (this.pancard==true || ammount<=50000)
            {
            this.balance=this.balance+ammount;
            }
            else{
                System.out.println("LINK-PANCARSD");
            }
        }
        else{
            System.out.println("Insufficient balance");
        }
    
    }
    //check balance
    void checkbalance(int PIN , int ammount){
        if ( this.pin==PIN)
        {
            System.out.println("current balance="+ this.balance);

             if(this.bankcode==2 || this.bankcode==3 && this.balance<10000)
             {
                System.out.println("LOW min-balance");
                System.out.println(10000-this.balance+"must be deposite");
             }
        }
        else{
            System.out.println("INCCORRECT pin");
        }
    }

    public static void main(String[] args) {
        Customer c1=new Customer("rahul",1,1122,false,99887776655L);
        c1.checkbalance(1122,5000);
        c1.deposit(1122,75000);
        c1.withdrow(1122,50000);
        c1.checkbalance(1122, 1200);

    }
}
// public class Customer {
//     String name;
//     int balance, pin;
//     boolean pancard;
//     long phnumber;

//     public Customer(String n, int b, int p, boolean pc, long ph) {
//         this.name = n;
//         this.balance = b;
//         this.pin = p;
//         this.pancard = pc;
//         this.phnumber = ph;
//     }
//      public void setPin(int pin) {
//         if (pin >= 1000 && pin <= 9999) {
//             this.pin = pin;
//         }
//          else {
//             System.out.println("PIN must be 4 digits");
//         }
//     }
//      public void updateNumber(int pin, long oldNumber, long newNumber) {
//         if (this.pin == pin && this.phnumber == oldNumber) {
//             this.phnumber = newNumber;
//             System.out.println("Phone number updated");
//         }
//          else {
//             System.out.println("Incorrect PIN or old phone number");
//         }
//     }
//      public void deposit(int pin, int amount) {
//         if (this.pin == pin) {
//             if (this.pancard || amount <= 100000) {
//                 this.balance += amount;
//                 System.out.println("Deposit successful");
//             } 
//             else {
//                 System.out.println("PAN card linkage required for deposits above 100000");
//             }
//         } 
//         else {
//             System.out.println("Incorrect PIN");
//         }
//     }
//     public void withdraw(int pin, int amount) {
//         if (this.pin == pin) {
//             if (this.pancard || amount <= 50000) {
//                 if (this.balance >= amount) {
//                     this.balance -= amount;
//                     System.out.println("Withdrawal successful");
//                 } else {
//                     System.out.println("Insufficient balance");
//                 }
//             } 
//             else {
//                 System.out.println("PAN card linkage required for withdrawals above 50000");
//             }
//         } 
//         else {
//             System.out.println("Incorrect PIN");
//         }
//     }
//     public void checkBalance(int pin) {
//         if (this.pin == pin) {
//             System.out.println("Current balance: " + this.balance);
//             if ((this.balance < 10000) && (this.bankcode== 2 || this.bankcode == 3)) {
//                 System.out.println("Low minimum balance. Deposit " + (10000 - this.balance) + " to avoid charges.");
//             }
//         }
//          else {
//             System.out.println("Incorrect PIN");
//         }
//     }
//     public static void main(String[] args) {
//         Customer c1 = new Customer("Rahul", 1, 1122, false, 9988777665L);
//         c1.checkBalance(1122);
//         c1.deposit(1122, 75000);
//         c1.withdraw(1122, 5000);
//         c1.checkBalance(1122);
//     }
// }