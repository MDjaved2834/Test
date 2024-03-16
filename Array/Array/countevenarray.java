package Array.Array;

public class countevenarray {
    public static void printArray(int[] numbers) {
            for (int i = 0; i <= numbers.length-1; i++) {
                    if(i%2==1){
                            System.out.println(numbers[i] + " ");
            }
        }
    }
    public static  void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6,5,6,7,8,9,3,2,4,5};
          printArray( numbers );
            }
        }
    

    





