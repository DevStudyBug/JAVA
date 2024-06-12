//6. Copying 2D Arrays Using arraycopy()

import java.util.Arrays;
public class Array6
{
	public static void main(String[] args) {
	    int [][] a={
	        { 1,-2,3},
	        {-4,-5,6,9},
	        {7},
	    };
	    int[][] b = new int[a.length][];
	    for (int i =0;i<b.length;i++){
	    	  
	    	    b[i]= new int[a[i].length];
	    	     System.arraycopy(a[i] ,0,b[i],0,b[i].length);
	    	    }
	    System.out.println(Arrays.deepToString(b));
	 }
 }
