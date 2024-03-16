public class Student {
    String name ;
    int p;
    int c;
    int m;
    int o;
    Student(String n,int p,int c,int m,int o){
        this.name=n;
        this.p=p;
        this.c=c;
        this.m=m;
        this.o=o;
    }
    void marks(){
        System.out.println("physics marks ="+ this.p);
        System.out.println("chemistry marks ="+ this.c);
        System.out.println("math marks ="+ this.m);
        System.out.println("optn marks ="+ this.o);
    }
    void pers(){
        int total=this.p + this.c +  this.m +this.o;
        float perc  =(total/400f)*100;
        System.out.println("percentage="+ perc);
    }
    void totalmarks(){
        int total= this.p +this.c +this.m +this.o;
        System.out.println("total marks="+total);

    }
    void printd(){
        System.out.println("name="+this.name);
        this.marks();
        this.pers();
        this.totalmarks();
    }
    public static void main(String[] args) {
        Student s1=new Student("rahul",50,60,70,80);
        s1.printd();

    }
}
