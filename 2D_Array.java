// PRINT ALL THE ELEMENT OF 2D ARRAY
public class 2D_Array
{
	public static void main(String[] args) {
	    int [][] a={
	        { 1,-2,3},
	        {-4,-5,6,9},
	        {7},
	    };
	    for (int i =0;i<a.length;i++){
	    	    for (int j =0;j<a[i].length;j++) {
	    	    //a[0].length=3,a[1].length=4, a[2].length=1
	    	    // when i=0,j=0<3 so it will print a[0][0] 
                System.out.print(a[i][j] +" ");
	    	    }
	    System.out.println(" ");
	    }
       }
 }

 // System.out.println(a.length+"length"); see the index 0,1,2 i.e=3
