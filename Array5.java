// Copying 2D Arrays Using Loop
import java.util.Arrays;
public class Array5
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
	    	    for (int j =0;j<b[i].length;j++){
	    	       b[i][j] = a[i][j];
	    	    }
	     }
       System.out.println("value= "+ Arrays.deepToString(b));
	  }
 }
