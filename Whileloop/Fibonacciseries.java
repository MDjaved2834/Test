public class Fibonacciseries {
    public static void main(String[] args) {
        int n=10;
        int firstTerm=0,secondTerm=1;
        int i=1;
        while(i<=n){
            System.out.print(firstTerm +" ");
            int nextTerm =firstTerm + secondTerm;
            firstTerm=secondTerm;
            secondTerm=nextTerm;
            i++;
        }
    }
}
    