package non_primitve_data_type;

public class main2 {
   
        public static void main(String[] args) {
            Student s1=new Student("javed","cs",60,2023);
            Student s2=new Student("Alice","cs",60,2024);
    
            Student s3=new Student("Rahul","it",90,2024);
    
            Student s4=new Student("virat","ECE",50,2022);
    
            Student s5=new Student("Sabir","EEE",93,2020);
            Student x[]={s1,s2,s3,s4,s5,s5};

            for(int i=0; i<x.length-1; i++){
               System.out.print(x[i]);
            }
               for(int i=0; i<x.length-1; i++){
               if(x[i].qualificatio.equals("cs") && x[i].precentage>=60){
                System.out.println(x[i]+" ");//cs and percentage>=60
            }
        }
            for(int i=0; i<x.length-1; i++){
            if(x[i].yearofpassout==2023 && x[i].precentage>=60){
                System.out.println(x[i]);//yop=2023 and per>=50
            }
        }
            for(int i=0; i<x.length-1; i++){
            if(x[i].yearofpassout==2023  ||  x[i].yearofpassout==2024 && x[i].precentage>=55){
                System.out.println(x[i]);//yop==2023 or 2024 and perc>=55
            }
            }
            
            
        }
    }

        
    

        
        
    


