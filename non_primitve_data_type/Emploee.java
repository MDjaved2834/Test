package non_primitve_data_type;

public class Emploee {
       String name;
      int salary;
       public Emploee(String name,int salary){
        this.name=name;
        this.salary=salary;
       }
       public static void main(String[] args) {
        Emploee E1=new Emploee("A", 23000);
        Emploee E2=new Emploee("b", 65000);
        Emploee E3=new Emploee("c", 67000);
        Emploee E4=new Emploee("d", 45000);
        Emploee x[]={E1,E2,E3,E4};
        for( int i=0; i<=x.length-1; i++){
            System.out.println(x[i].name+" "+x[i].salary);
        }
    }
}
       

