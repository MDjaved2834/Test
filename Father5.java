 class Father5 {
    Father5() {
        this(15);
        System.out.println(15);
    }
    Father5(String s) {
        this();
        System.out.println(s);
    }
    Father5(int x) {
       
        System.out.println(x);
    }
}

class Son extends Father5 {
    Son() {
        super("100");
        System.out.println(100);
    }
    Son(int x) {
        this();
        System.out.println(x);
    }
    Son(String s) {
        this(45);
        System.out.println(s);
        
    }

    Son(String x, int s) {
        this(45 ,"45");
        System.out.println(s);
    }
    Son (int x ,String s) {
        this("45");
        System.out.println(x);
    }

    public static void main(String[] args) {
        Son s1 = new Son("java", 65);
    }
}


