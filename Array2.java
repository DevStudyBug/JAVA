//2.Using LOOPING construct to copy arrays
import java.util.Arrays;
class Array2 {
    public static void main (String[] args){
        int [] array1 = { 1,2,3,4,5,6};
        int [] array2 = new int[6];
        for (int i=0;i<array1.length;i++){
            array2[i] = array1[i];    
        }
        System.out.print(Arrays.toString(array2)); // converting integer to string
    }
}
 // o/p [1, 2, 3, 4, 5, 6]

