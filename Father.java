public class Father {
    Father() {
        this(15);
        System.out.println(15);
    }
    Father(int x) {
        System.out.println(x);
    }
    Father(String s) {
        this();
        System.out.println(s);
    }
}

class Son extends Father {
    Son() {
        super("45");
        System.out.println(100);
    }
    Son(String s) {
        this(45);
        System.out.println(s);
    }
    Son(int x) {
        this("45",45);
        System.out.println(x);
    }

    Son(int x , String s) {
        this("45");
        System.out.println(x);
    }
    Son (String x, int s) {
        this();
        System.out.println(s);
    }

    public static void main(String[] args) {
        Son s1 = new Son("45", 45);
    }
}
