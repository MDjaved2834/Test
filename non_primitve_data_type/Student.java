package non_primitve_data_type;

public class Student {
    String name;
    String qualificatio;
    double precentage; int yearofpassout;

    public Student(String name,String qualificati, double precentage,  int  yearofpassout){
        this.name=name;
        this.qualificatio=qualificati;
        this.precentage=precentage;
        this.yearofpassout=yearofpassout;
    }
    //@Override
    public String toString(){
        return this.name+" "+this.qualificatio+" "+ this.precentage+" "+this.yearofpassout;
    }
}



