/*3.copying Arrays Using arrraycopy() method
System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
src: The source array.
srcPos: The starting position in the source array.
dest: The destination array.
destPos: The starting position in the destination array.
length: The number of array elements to be copied.*/

import java.util.Arrays;
class Array3 {
    public static void main (String[] args){
        int[] n1 = {2,3,12,4,12,-2}; 
        int[] n2 = new int[n1.length];
        int[] n3 = new int[5];
        System.arraycopy(n1,0,n2,0,n1.length);
        System.out.println("n2 = "+ Arrays.toString(n2));
        System.arraycopy(n1,2,n3,1,3);
        System.out.println("n3 = "+ Arrays.toString(n3));
        }
    }
