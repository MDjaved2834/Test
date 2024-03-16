public class students {
    String name;
    int yop;
    public static void main(String[] args) {
        students s1=new students();
        s1.name="javed";
        s1.yop=2023;
        students s2=new students();
        s2.name="rahil";
        s2.yop= 2033;
        System.out.println(s1.name+" "+ s1.yop);
        System.out.println(s2.name+" "+ s2.yop);
        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}
