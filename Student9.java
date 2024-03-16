public class Student9 
{
    String  name;
    String Qualification;
    String Email;
    int yop;
    int pnumber;
    Student9(String n,String Q, String E,int y, int p){
        this.name=n;
        this.Qualification=Q;
        this.Email=E;
        this.yop=y;
        this.pnumber=p;
    }

    public static void main(String[] args) {
        Student9 s1=new Student9("Rahul","btech","rahul49449@123",2023,908765345);
        Student9 s2=new Student9("javed","btech","javed49449@123",2024,987653456);
        Student9 s3=new Student9("abhi","btech","abhi49449@123",2022,675653456);
        System.out.println( s1.name+" "+s1.Qualification+" "+s1.Email +" "+s1.yop+" "+s1.pnumber);
        System.out.println(s2.name+" "+s2.Qualification+"  "+s2.Email+" "+s2.yop+" "+s2.pnumber);
        System.out.println(s3.name+" "+s3.Qualification+"  "+s3.Email+" "+s3.yop+" "+s3.pnumber);
    }
    
}

       


   



